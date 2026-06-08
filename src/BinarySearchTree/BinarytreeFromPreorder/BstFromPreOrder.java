package BinarySearchTree.BinarytreeFromPreorder;

import java.util.Stack;

public class BstFromPreOrder {
    Node root;
    BstFromPreOrder(){
        root=null;
    }

    public Node preorderTreeConstruction(int[] preorder,int[] ind,int up){
        if( ind[0]==preorder.length || preorder[ind[0]]>up){
            return null;
        }
        Node node=new Node(preorder[ind[0]]);
        ind[0]++;
        node.left=preorderTreeConstruction(preorder,ind, node.data);
        node.right=preorderTreeConstruction(preorder,ind,up);
        return node;
    }


    public Node preorderTreeIterative(int[] preorder){
        if(preorder.length==0){
            return null;
        }
        Node root=new Node(preorder[0]);
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        for(int i=1;i<preorder.length;i++){
            if(preorder[i]<stack.peek().data){
                stack.peek().left=new Node(preorder[i]);
                stack.push(stack.peek().left);
            }
            else{
                Node parent=null;
                while(!stack.isEmpty() && preorder[i]>stack.peek().data){
                    parent=stack.pop();
                }
                parent.right=new Node(preorder[i]);
                stack.push(parent.right);
            }
        }
        return root;
    }

    void displayTree(Node node, int level){
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

}
