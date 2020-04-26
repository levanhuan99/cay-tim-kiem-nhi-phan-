public class Test {

    public static void main(String[] args) {
        BST<String> tree=new BST<>();
        tree.insert("A");
        tree.insert("B");
        tree.insert("F");
        tree.insert("D");
        tree.insert("H");
        System.out.println("sorted ");
        tree.inorder();
        System.out.println("size is "+tree.size);
    }


}
