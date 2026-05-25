package BinaryTree;

import java.util.Scanner;

public class BTMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root;
        BinaryTrreeDemo tree =new BinaryTrreeDemo();
        root=tree.createTree(sc);
        System.out.println(root.data);
        tree.displayTree(root,0);
    }
}
