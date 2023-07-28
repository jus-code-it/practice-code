class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

# Function to perform Depth-First Search (DFS) - Inorder Traversal
def dfs_inorder(node):
    if node is not None:
        dfs_inorder(node.left)
        print(node.value, end=' ')
        dfs_inorder(node.right)
    else:
        return

# Function to perform Depth-First Search (DFS) - Preorder Traversal
def dfs_preorder(node):
    if node is not None:
        print(node.value, end=' ')
        dfs_preorder(node.left)
        dfs_preorder(node.right)
    else:
        return

# Function to perform Depth-First Search (DFS) - Postorder Traversal
def dfs_postorder(node):
    if node is not None:
        dfs_postorder(node.left)
        dfs_postorder(node.right)
        print(node.value, end=' ')
    else:
        return

# Example usage:
if __name__ == "__main__":
    # Build a sample binary tree:
    #         1
    #        / \
    #       2   3
    #      / \
    #     4   5

    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)

    print("Inorder Traversal (DFS):")
    dfs_inorder(root)
    print()

    print("Preorder Traversal (DFS):")
    dfs_preorder(root)
    print()

    print("Postorder Traversal (DFS):")
    dfs_postorder(root)
    print()