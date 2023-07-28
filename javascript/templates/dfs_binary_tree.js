class TreeNode {
    constructor(val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}

// Function to perform Depth-First Search (DFS) - Inorder Traversal
function dfsInorder(node) {
    if (node !== null) {
        dfsInorder(node.left);
        console.log(node.value + " ");
        dfsInorder(node.right);
    }
}

// Function to perform Depth-First Search (DFS) - Preorder Traversal
function dfsPreorder(node) {
    if (node !== null) {
        console.log(node.value + " ");
        dfsPreorder(node.left);
        dfsPreorder(node.right);
    }
}

// Function to perform Depth-First Search (DFS) - Postorder Traversal
function dfsPostorder(node) {
    if (node !== null) {
        dfsPostorder(node.left);
        dfsPostorder(node.right);
        console.log(node.value + " ");
    }
}

// Example usage:
// Build a sample binary tree:
//         1
//        / \
//       2   3
//      / \
//     4   5

const root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);
root.left.right = new TreeNode(5);

console.log("Inorder Traversal (DFS): ");
dfsInorder(root);

console.log("Preorder Traversal (DFS): ");
dfsPreorder(root);

console.log("Postorder Traversal (DFS): ");
dfsPostorder(root);