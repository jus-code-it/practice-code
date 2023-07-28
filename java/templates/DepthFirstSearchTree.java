class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        value = val;
        left = null;
        right = null;
    }
}

public class DepthFirstSearchTree {

    // Function to perform Depth-First Search (DFS) - Inorder Traversal
    static void dfsInorder(TreeNode node) {
        if (node != null) {
            dfsInorder(node.left);
            System.out.print(node.value + " ");
            dfsInorder(node.right);
        }
    }

    // Function to perform Depth-First Search (DFS) - Preorder Traversal
    static void dfsPreorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            dfsPreorder(node.left);
            dfsPreorder(node.right);
        }
    }

    // Function to perform Depth-First Search (DFS) - Postorder Traversal
    static void dfsPostorder(TreeNode node) {
        if (node != null) {
            dfsPostorder(node.left);
            dfsPostorder(node.right);
            System.out.print(node.value + " ");
        }
    }

    // Example usage:
    public static void main(String[] args) {
        // Build a sample binary tree:
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("Inorder Traversal (DFS): ");
        dfsInorder(root);
        System.out.println();

        System.out.print("Preorder Traversal (DFS): ");
        dfsPreorder(root);
        System.out.println();

        System.out.print("Postorder Traversal (DFS): ");
        dfsPostorder(root);
        System.out.println();
    }
}