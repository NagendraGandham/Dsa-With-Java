package BinarySearchTree.BinaryTreePostOrder;

import java.util.Stack;

public class BinaryTreeCreationPostOrder {
    Node root;
    BinaryTreeCreationPostOrder(){
        root=null;
    }

    public Node treeConstructionUsingRecurssion(int[] postorder,int[] ind,int lb) {
         if( ind[0]<0 || lb>postorder[ind[0]] ){
             return null;
         }
         Node node=new Node(postorder[ind[0]]);
         ind[0]--;
         node.right=treeConstructionUsingRecurssion(postorder,ind,node.data);
         node.left=treeConstructionUsingRecurssion(postorder,ind,lb);
         return node;
    }

    public Node treeConstructionIteratively(int[] preorder){
        if(preorder.length==0){
            return null;
        }
        root=new Node(preorder[preorder.length-1]);
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        for(int i=preorder.length-2;i>=0;i--){
            if(preorder[i]>stack.peek().data){
                stack.peek().right=new Node(preorder[i]);
                stack.push(stack.peek().right);
            }
            else{
                Node parent=null;
                while(!stack.isEmpty() && stack.peek().data>preorder[i]){
                    parent=stack.pop();
                }
                parent.left=new Node(preorder[i]);
                stack.push(parent.left);
            }
        }
        return root;
    }


    void inOrdertraversal(Node node){
        if(node==null){
            return ;
        }
        inOrdertraversal(node.left);
        System.out.print(node.data+" ");
        inOrdertraversal(node.right);
    }
}
