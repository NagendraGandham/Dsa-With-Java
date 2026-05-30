package BinaryTree.TreeConstruction;

import java.util.Scanner;

public class PreInordeMain {
    public static void main(String[] args) {
        PreOrderAndInorderTreeConstruction tree=new PreOrderAndInorderTreeConstruction();
        int[] prInd={0};
        System.out.println("enter the no of nodes of a tree");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] preOrder=new int[n];
        int[] inOrder=new int[n];
        System.out.println("enter the pre order of the tree");
        for(int i=0;i<n;i++){
            preOrder[i]=sc.nextInt();
        }
        System.out.println("Enter the InOrder of the tree");
        for(int i=0;i<n;i++){
            inOrder[i]=sc.nextInt();
        }
        Node root=tree.treeConstruction(preOrder,inOrder,prInd,0,preOrder.length-1);
        tree.display(root,0);
    }
}
