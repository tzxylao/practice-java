package com.lll.practice.tree;

import lombok.extern.java.Log;

import java.util.Stack;

/**
 *                          1
 *              2                       3
 *      4           5           6           7
 *  8       9   10      11  12      13  14      15
 * @author: laoliangliang
 * @description: 前序遍历
 * @create: 2020/6/8 11:20
 **/
@Log
public class TreeOrder {

    public static Node getRootNode() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.left.left.left = new Node(8);
        node.left.left.right = new Node(9);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(11);
        node.right.left.left = new Node(12);
        node.right.left.right = new Node(13);
        node.right.right.left = new Node(14);
        node.right.right.right = new Node(15);
        return node;
    }

    public static void main(String[] args) {
        TreeOrder treeOrder = new TreeOrder();
        treeOrder.pre(getRootNode());
        treeOrder.preStack(getRootNode());
        System.out.println();
        System.out.println("------------------");
        treeOrder.middle(getRootNode());
        System.out.println();
        System.out.println("------------------");
        treeOrder.after(getRootNode());
        System.out.println();
        System.out.println("------------------");
    }

    private void after(Node node) {
        if (node == null) {
            return;
        }
        after(node.left);
        after(node.right);
        System.out.print(node + " ");
    }

    private void middle(Node node) {
        if (node == null) {
            return;
        }
        middle(node.left);
        System.out.print(node + " ");
        middle(node.right);
    }

    private void pre(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node + " ");
        pre(node.left);
        pre(node.right);
    }

    private void preStack(Node node) {
        if (node == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        System.out.println();
        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
            System.out.print(pop+" ");
        }
    }

}
