package algorithm.tree;


import com.algorithm.tree.BinarySearchTree;
import org.testng.annotations.Test;

public class BinarySearchTreeTest {

    @Test
    public void test() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(3);
        binarySearchTree.insert(6);
        binarySearchTree.insert(5);
        binarySearchTree.insert(4);
        binarySearchTree.insert(2);
        System.out.println("初始节点:");
        System.out.println(binarySearchTree.minNode().getValue());
        System.out.println(binarySearchTree.maxNode().getValue());


        System.out.println(binarySearchTree.search(5).getValue());
        binarySearchTree.delete(2);
        binarySearchTree.delete(6);
        System.out.println("删除之后:");
        System.out.println(binarySearchTree.minNode().getValue());
        System.out.println(binarySearchTree.maxNode().getValue());

    }
}
