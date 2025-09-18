package Course.B_DataStructures.DataStructures.E_Tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinaryTree bst = new BinaryTree();

        bst.insert(12);
        bst.insert(2);
        bst.insert(121);
        bst.insert(5);
        bst.insert(43);

        System.out.print("preOrder: ");
        bst.preOrder();
        System.out.print("\ninOrder: ");
        bst.inOrder();

        System.out.println("\n");
        bst.search(5);

    }
}
