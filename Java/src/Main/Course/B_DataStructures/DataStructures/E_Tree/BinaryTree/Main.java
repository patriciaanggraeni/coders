package Course.B_DataStructures.DataStructures.E_Tree.BinaryTree;

public class Main {
    public static void main(String[] args) {

        BinaryTree bnt = new BinaryTree();

        bnt.createBinaryTree();

        System.out.println("--- Dengan rekursif: ");
        System.out.print("PreOrder : ");
        bnt.preOrderRecursive(bnt.root);
        System.out.print("\nInOrder  : ");
        bnt.inOrderRecursive(bnt.root);
        System.out.print("\nPostOrder :");
        bnt.postOrderRecursive(bnt.root);

        System.out.println("\n\n--- Dengan iteratif: ");
        System.out.print("PreOrder : ");
        bnt.preOrderIterative();
        System.out.print("\nInOrder  : ");
        bnt.inOrderIterative();
        System.out.print("\nPostOrder : ");
        bnt.postOrderIterative();

        System.out.print("\n\nLevel Order: ");
        bnt.levelOrder();

        System.out.println(" ");
        System.out.print("Maksimum nilai binary tree: " + bnt.findMax(bnt.root));

    }
}