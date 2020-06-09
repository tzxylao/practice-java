package com.lll.practice.stack;

import java.util.Stack;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/4 17:39
 **/
public class StackExample {
    private static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        stack.push("1");
        stack.add("2");
        stack.set(1, "4");
        stack.addElement("3");
        stack.insertElementAt("5", 3);
        System.out.println(stack.capacity());
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }
    }
}
