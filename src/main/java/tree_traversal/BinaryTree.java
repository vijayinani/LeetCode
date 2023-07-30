package tree_traversal;

public class InOrder {

    Node root;

    InOrder() {
        root = null;
    }

    public static void main(String[] args) {


        InOrder tree = new InOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function call
        System.out.println(
                "Inorder traversal of binary tree is ");
        tree.printInorder(tree.root);
    }

    private void printInorder(Node root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.println(root.key);
        printInorder(root.right);
    }
}
