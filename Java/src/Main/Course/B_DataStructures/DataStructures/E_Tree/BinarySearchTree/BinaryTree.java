package Course.B_DataStructures.DataStructures.E_Tree.BinarySearchTree;

import java.util.Stack;

public class BinaryTree {

    Node root;

    BinaryTree() {
        this.root = null;
    }

    protected void insert(int value) {
        root = insert(root, value);
    }
    protected Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    protected void preOrder() {
        preOrder(root);
    }

    protected void preOrder(Node root) {
        if (root == null) {
            System.out.println("Root masih kosong");
        } else {
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                Node temp = stack.pop();
                System.out.print(temp.data + " ");

                if (temp.right != null) {
                    stack.push(temp.right);
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                }
            }
        }
    }

    protected void inOrder() {
        inOrder(root);
    }

    protected void inOrder(Node root) {
        if (root == null) {
            System.out.println("Banary Tree Kosong");
        } else {
            Stack<Node> stack = new Stack<>();
            Node temp = root;
            while (!stack.isEmpty() || temp != null) {
                if (temp != null) {
                    stack.push(temp);
                    temp = temp.left;
                } else {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    temp = temp.right;
                }
            }
        }
    }

    protected void search(int key) {
        search(root, key);
    }

    protected Node search(Node root,int key) {
        if (root == null || key == root.data) {
            System.out.println("Data " + key + " ditemukan");
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
}