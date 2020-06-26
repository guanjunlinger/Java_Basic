package com.algorithm.tree;

import java.util.Stack;

public class BinaryTreeTraversal {
    public int value;
    public BinaryTreeTraversal left;
    public BinaryTreeTraversal right;
    /**
     * 后序遍历专用
     */
    public boolean count;

    public BinaryTreeTraversal(int value) {
        this.value = value;
    }


    public static void preOrder(BinaryTreeTraversal root) {
        Stack<BinaryTreeTraversal> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (stack.size() > 0) {
            BinaryTreeTraversal temp = stack.pop();
            System.out.println(temp.value);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }

        }
    }

    public static void inOrder(BinaryTreeTraversal root) {
        Stack<BinaryTreeTraversal> stack = new Stack<>();
        BinaryTreeTraversal current = root;
        while (current != null || stack.size() > 0) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                BinaryTreeTraversal temp = stack.pop();
                System.out.println(temp.value);
                current = temp.right;
            }
        }
    }

    public static void postOrder(BinaryTreeTraversal root) {
        Stack<BinaryTreeTraversal> stack = new Stack<>();
        BinaryTreeTraversal current = root;
        while (current != null || stack.size() > 0) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                if (current.count) {
                    System.out.println(current.value);
                    current = null;

                } else {
                    current.count = true;
                    stack.push(current);
                    current = current.right;
                }

            }
        }
    }
}
