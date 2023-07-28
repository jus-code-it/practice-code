#include <iostream>

class TreeNode {
public:
    int value;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int val) : value(val), left(nullptr), right(nullptr) {}
};

// Function to perform Depth-First Search (DFS) - Inorder Traversal
void dfs_inorder(TreeNode* node) {
    if (node != nullptr) {
        dfs_inorder(node->left);
        std::cout << node->value << " ";
        dfs_inorder(node->right);
    }
}

// Function to perform Depth-First Search (DFS) - Preorder Traversal
void dfs_preorder(TreeNode* node) {
    if (node != nullptr) {
        std::cout << node->value << " ";
        dfs_preorder(node->left);
        dfs_preorder(node->right);
    }
}

// Function to perform Depth-First Search (DFS) - Postorder Traversal
void dfs_postorder(TreeNode* node) {
    if (node != nullptr) {
        dfs_postorder(node->left);
        dfs_postorder(node->right);
        std::cout << node->value << " ";
    }
}

// Example usage:
int main() {
    // Build a sample binary tree:
    //         1
    //        / \
    //       2   3
    //      / \
    //     4   5

    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);

    std::cout << "Inorder Traversal (DFS): ";
    dfs_inorder(root);
    std::cout << std::endl;

    std::cout << "Preorder Traversal (DFS): ";
    dfs_preorder(root);
    std::cout << std::endl;

    std::cout << "Postorder Traversal (DFS): ";
    dfs_postorder(root);
    std::cout << std::endl;

    return 0;
}