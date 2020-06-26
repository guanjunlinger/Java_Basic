package algorithm.tree;

import com.algorithm.tree.BinaryTreeTraversal;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BinaryTreeTraversalTest {
    private BinaryTreeTraversal root;

    @BeforeClass
    public void before() {
        root = new BinaryTreeTraversal(1);
        root.left = new BinaryTreeTraversal(2);
        root.right = new BinaryTreeTraversal(3);
        root.left.left = new BinaryTreeTraversal(5);
        root.right.right = new BinaryTreeTraversal(43);
        root.right.right.left = new BinaryTreeTraversal(32);

    }

    @Test
    public void testPreOrder() {
        BinaryTreeTraversal.preOrder(root);
    }

    @Test
    public void testInOrder() {
        BinaryTreeTraversal.inOrder(root);
    }

    @Test
    public void testPostOrder() {
        BinaryTreeTraversal.postOrder(root);
    }
}
