package com.beyond.linkedlist.practice;

public class SinglyLinkedList<T> implements List<T> {
    // 연결 리스트의 첫 번째 노드를 가리키는 참조
    private Node<T> head;

    private int size;

    // 생성자
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    @Override
    public void addFirst(T data) {
        // 새 노드 생성
        Node<T> newNode = new Node<>(data);

        // 리스트가 비어있는 경우
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        // size 증가
        size++;
    }

    @Override
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> lastNode = search(size - 1);

            lastNode.next = newNode;
        }

        size++;
    }

    @Override
    public void add(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(data);

            return;
        }

        if (index == size) {
            addLast(data);

            return;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> prevNode = search(index - 1);

        newNode.next = prevNode.next;
        prevNode.next = newNode;

        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return search(index).data;
    }

    @Override
    public boolean contains(T data) {
        Node<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.data.equals(data)) {

                return true;
            }

            currentNode = currentNode.next;
        }

        return false;
    }

    @Override
    public void removeFirst() {
        if (head == null) {
            return;
        } else {
            Node<T> firstNode = head;

            head = firstNode.next;
            firstNode.data = null;
            firstNode.next = null;

            size--;
        }
    }

    @Override
    public void removeLast() {
        if (head == null) {
            return;
        } else if ((size - 2) < 0) {
            removeFirst();

            return;
        } else {
            Node<T> lastPrevNode = search(size - 2);

            lastPrevNode.next.data = null;
            lastPrevNode.next = null;

            size--;
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            removeFirst();

            return;
        }

        if (index == (size - 1)) {
            removeLast();

            return;
        }

        Node<T> prevNode = search(index - 1);
        Node<T> targetNode = prevNode.next;

        prevNode.next = targetNode.next;
        targetNode.data = null;
        targetNode.next = null;

        size--;
    }

    @Override
    public void remove(T data) {
        Node<T> currentNode = head;

        // 리스트가 비어있는 경우
        if (currentNode == null) {
            return;
        }

        // 삭제할 노드가 헤드인 경우
        if (currentNode.data.equals(data)) {
            removeFirst();

            return;
        }

        for (int i = 0; i < size - 1; i++) {
            if (currentNode.next.data.equals(data)) {
                Node<T> nextNode = currentNode.next;

                currentNode.next = nextNode.next;
                nextNode.data = null;
                nextNode.next = null;

                size--;

                break;
            }

            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        Node<T> currentNode = head;
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        while (currentNode != null) {
            sb.append(currentNode.data + ", ");

            currentNode = currentNode.next;
        }

        if (sb.lastIndexOf(",") != -1) {
            sb.replace(sb.lastIndexOf(","), sb.length(), "]");
        } else {
            sb.append("]");
        }

        return sb.toString();
    }

    private Node<T> search(int index) {
        // head에서부터 차례로 index까지 검색
        Node<T> currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    // 내부 클래스
    private static class Node<T> {
        // 노드가 저장하는 데이터
        private T data;
        
        // 다음 노드를 가리키는 참조
        private Node<T> next;

        // 노드를 생성할 때 사용할 생성자
        private Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
