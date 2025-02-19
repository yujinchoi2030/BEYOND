package com.beyond.stack.practice;

public class ArrayStack<E> implements Stack<E> {
    // 스택의 최상위 요소의 인덱스
    private int top;
    
    // 스택의 최대 크기
    private int maxSize;

    // 스택 배열
    private E[] values;

    public ArrayStack() {
        this(16);
    }

    public ArrayStack(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
        this.values = (E[]) new Object[maxSize];
    }

    @Override
    public void push(E value) {
        if (top == maxSize - 1) {
            throw new RuntimeException("스택이 가득 찼습니다.");
        } else {
            values[++top] = value;
        }
    }

    @Override
    public int size() {

        return (top + 1);
    }

    @Override
    public boolean isEmpty() {

        return (top == -1);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("스택이 비어 있습니다.");
        } else {
            return values[top--];
        }
    }

    @Override
    public boolean contains(E value) {
        boolean result = false;

        for (int i = 0; i <= top; i++) {
            if (values[i].equals(value)) {
                result = true;

                break;
            }
        }

        return result;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("스택이 비어 있습니다.");
        } else {
            return values[top];
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("[");

        for (int i = 0; i <= top; i++) {
            sb.append(values[i] + ", ");
        }

        if (sb.lastIndexOf(",") != -1) {
            sb.replace(sb.lastIndexOf(","), sb.length(), "]");
        } else {
            sb.append("]");
        }

        return sb.toString();
    }
}