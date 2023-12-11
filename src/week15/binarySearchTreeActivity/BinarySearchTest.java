package week15.binarySearchTreeActivity;


public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearchTreeDemo letters = new BinarySearchTreeDemo();
        letters.addNode('A');
        letters.addNode('B');
        letters.addNode('C');
        letters.addNode('D');
        letters.addNode('E');
        letters.addNode('F');
        letters.addNode('G');

        letters.preOrderTraverse(letters.getRoot());
        System.out.println();

        letters.inOrderTraverse(letters.getRoot());
        System.out.println();

        letters.postOrderTraverse(letters.getRoot());
        System.out.println();


    }
}
