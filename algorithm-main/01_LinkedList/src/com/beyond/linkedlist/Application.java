package com.beyond.linkedlist;

import com.beyond.linkedlist.practice.List;
import com.beyond.linkedlist.practice.SinglyLinkedList;

public class Application {
    public static void main(String[] args) {
////        자바에서 제공하는 LinkedList 테스트
//        List<String> list = new LinkedList<>();
//
////        addFirst() 메소드 테스트 (Java 21부터 지원)
//        list.addFirst("사과");
//        list.addFirst("딸기");
//
//        System.out.println(list);
//        System.out.println();
//
////        addLast() 메소드 테스트 (Java 21부터 지원)
//        list.addLast("포도");
//        list.addLast("키위");
//
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println();
//
////        add() 메소드 테스트
//        list.add(1, "수박");
//
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println();
//
////        get(), contains() 메소드 테스트
//        System.out.println(list.get(0));
//        System.out.println(list.contains("딸기"));
//        System.out.println(list.contains("바나나"));
//        System.out.println();
//
////        removeFirst(), removeLast(), remove() 메소드 테스트
//        list.removeFirst();
//
//        System.out.println(list);
//        System.out.println();
//
//        list.removeLast();
//
//        System.out.println(list);
//        System.out.println();
//
//        list.remove(0);
//
//        System.out.println(list);
//        System.out.println();
//
//        list.remove("포도");
//
//        System.out.println(list);
//        System.out.println();

//        SinglyLinkedList 구현 및 테스트
        List<String> list = new SinglyLinkedList<>();

//        addFirst(), addLast(), add() 메소드 구현
        list.addFirst("사과");
        list.addFirst("딸기");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
        
        list.addLast("포도");
        list.addLast("키위");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.add(0, "수박");
        list.add(5, "바나나");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

//        list.add(2, "복숭아");
        list.add(5, "복숭아");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

//        get(), contains() 메소드 구현
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(3));
        System.out.println(list.get(6));
        System.out.println();

        System.out.println(list.contains("딸기"));
        System.out.println(list.contains("두리안"));
        System.out.println(list.contains("바나나"));
        System.out.println(list.contains("참외"));
        System.out.println();

//        removeFirst(), removeLast(), remove() 메소드 구현
        list.removeFirst();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.remove(0);
        list.remove(3);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.remove("포도");
//        list.remove("사과");
//        list.remove("키위");
//        list.remove("딸기");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
    }
}