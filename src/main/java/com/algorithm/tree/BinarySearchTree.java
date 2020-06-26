package com.algorithm.tree;

import lombok.Data;

public class BinarySearchTree {
    private Node root;

    public Node search(int value) {
        Node temp = root;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        return temp;
    }

    public void insert(int value) {
        Node temp = root;
        Node parent = null;
        while (temp != null) {
            if (temp.value == value) {
                return;
            } else if (value > temp.value) {
                parent = temp;
                temp = temp.right;

            } else {
                parent = temp;
                temp = temp.left;

            }
        }
        if (parent == null) {
            root = new Node(value);
        } else if (value > parent.value) {
            parent.right = new Node(value);
            parent.right.parent = parent;
        } else {
            parent.left = new Node(value);
            parent.left.parent = parent;
        }
    }

    public void delete(int value) {
        Node temp = root;
        while (temp != null) {
            if (temp.value == value) {
                break;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        if (temp == null) {
            return;
        }
        if (temp.left != null && temp.right != null) {
            Node s = successor(temp);
            temp.value = s.value;
            temp = s;
        }

        //删除节点左子树为空
        if (temp.left == null) {
            handlerEmptyLeftChild(temp);

        } else if (temp.right == null) {
            handlerEmptyRightChild(temp);
        }

    }

    private void handlerEmptyLeftChild(Node node) {
        Node temp = node;
        Node parent = temp.parent;
        if (parent == null) {
            root = temp.right;
            if (root != null) {
                root.parent = null;
            }
        } else if (parent.left == temp) {
            parent.left = temp.right;
            if (temp.right != null) {
                temp.right.parent = parent;
            }
        } else if (parent.right == temp) {
            parent.right = temp.right;
            if (temp.right != null) {
                temp.right.parent = parent;
            }
        }

    }

    private void handlerEmptyRightChild(Node node) {
        Node temp = node;
        Node parent = temp.parent;
        if (parent == null) {
            root = temp.left;
            if (root != null) {
                root.parent = null;
            }
        } else if (parent.left == temp) {
            parent.left = temp.left;
            if (temp.left != null) {
                temp.left.parent = parent;
            }
        } else if (parent.right == temp) {
            parent.right = temp.left;
            if (temp.left != null) {
                temp.left.parent = parent;
            }
        }
    }

    public Node successor(Node node) {
        if (node.right != null) {
            return doMinNode(node.right);
        } else {
            Node parent = node.parent;
            while (parent != null && parent.right == node) {
                node = parent;
                parent = node.parent;
            }
            return parent;
        }

    }

    public Node maxNode() {
        return root == null ? null : doMaxNode(root);
    }

    public Node minNode() {
        return root == null ? null : doMinNode(root);
    }

    private Node doMaxNode(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    private Node doMinNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    @Data
    public static class Node {
        private int value;
        private Node left;
        private Node right;
        private Node parent;

        public Node(int value) {
            this.value = value;
        }
    }

}
