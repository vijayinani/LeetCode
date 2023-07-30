package tree_traversal;

public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of binary tree is ");
        tree.printInorder(tree.root);
        System.out.println();

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder(tree.root);
        System.out.println();

        System.out.println("Postorder traversal of binary tree is ");
        tree.printPostorder(tree.root);
        System.out.println();
    }

    private void printInorder(Node root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.key + " ");
        printInorder(root.right);
    }

    private void printPreorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.key + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    private void printPostorder(Node root) {
        if (root == null) {
            return;
        }

        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.key + " ");
    }
}
