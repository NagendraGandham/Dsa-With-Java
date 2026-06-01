package BinaryTree.TreeConstruction;

import java.util.Scanner;

public class PostInorderMain {
    public static void main(String[] args) {
        PostInorderTreeConstruction tree=new PostInorderTreeConstruction();
        System.out.println("enter the no of nodes of a tree");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] postOrder=new int[n];
        int[] inOrder=new int[n];
        System.out.println("enter the post order of the tree");
        for(int i=0;i<n;i++){
            postOrder[i]=sc.nextInt();
        }
        System.out.println("Enter the InOrder of the tree");
        for(int i=0;i<n;i++){
            inOrder[i]=sc.nextInt();
        }
        int[] prInd={inOrder.length-1};
        if(inOrder.length!=postOrder.length){
            System.out.println("Cannot build tree");
            return;
        }
        Node root=tree.treeConstruction(postOrder,inOrder,prInd,0,postOrder.length-1);
        tree.display(root,0);
    }
}
