package com.lll.practice.tree;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/8 11:20
 **/
public class Node {
    public Node left;
    public Node right;
    @Getter
    @Setter
    private Integer val;

    public Node(Integer val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val + "";
    }
}
