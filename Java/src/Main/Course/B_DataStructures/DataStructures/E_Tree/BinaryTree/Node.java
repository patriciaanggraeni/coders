package Course.B_DataStructures.DataStructures.E_Tree.BinaryTree;

public class Node {
    Node left, right, next;
    private final int data;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    protected int getData() {
        return this.data;
    }

}
