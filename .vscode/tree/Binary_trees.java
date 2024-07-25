// Binary Trees
// each node can have a max of 2 children 

// Binary Trees, such as Binary Search Trees and AVL Trees,
// are great compared to Arrays and Linked Lists because they 
// are BOTH fast at accessing a node, AND fast when it comes 
// to deleting or inserting a node, with no shifts in memory needed.

// types
// balanced
// complete
// full
// perfect

public class Binary_trees {
    public static class TreeNode {
        char data;
        TreeNode left;
        TreeNode right;

        public TreeNode(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode createNewNode(char data) {
        return new TreeNode(data);
    }

    public static void main(String[] args) {
        TreeNode root = createNewNode('R');
        TreeNode nodeA = createNewNode('A');
        TreeNode nodeB = createNewNode('B');
        TreeNode nodeC = createNewNode('C');
        TreeNode nodeD = createNewNode('D');
        TreeNode nodeE = createNewNode('E');
        TreeNode nodeF = createNewNode('F');
        TreeNode nodeG = createNewNode('G');

        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        // Test
        System.out.println("root.right.left.data: " + root.right.left.data);
      
    }
}

//binary tree traversal =>> visiting every node , one node at a time
// tree traversal method
// BFS
// DFS = > pre-order
//     = > in-order
//     = > post-order
