package BinaryTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinaryTrreeDemo {
    Node createTree(Scanner sc){
        System.out.println("Enter node data (-1 for null) :");
        int value=sc.nextInt();
        if(value==-1){
            return null;
        }
        System.out.println("Do you want left child of "+value);
        boolean left=sc.nextBoolean();
        Node newNode=new Node(value);
        if(left){
            newNode.left=createTree(sc);
        }
        System.out.println("Do you want right child of "+value);
        boolean right= sc.nextBoolean();
        if(right){
            newNode.right=createTree(sc);
        }
        return newNode;
    }

    void displayTree(Node node,int level){
        if(node==null){
            return;
        }
        displayTree(node.right,level+1);
        for(int i=0;i<level;i++){
            System.out.print("    ");
        }
        System.out.println(node.data);
        displayTree(node.left,level+1);
    }

    void inOrderTraversal(Node node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);
    }

    void preOrderTraversal(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void postOrderTraversal(Node node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");
    }
}
