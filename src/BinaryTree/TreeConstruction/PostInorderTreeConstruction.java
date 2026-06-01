package BinaryTree.TreeConstruction;

public class PostInorderTreeConstruction {
    Node treeConstruction(int[] post,int[] Inorder,int[] posInd,int start,int end){
        if(start>end){
            return null;
        }
        Node node=new Node(post[posInd[0]]);
        int index=search(Inorder,post[posInd[0]],start,end);
        posInd[0]--;
        node.right=treeConstruction(post,Inorder,posInd,index+1,end);
        node.left=treeConstruction(post,Inorder,posInd,start,index-1);
        return node;
    }

    int search(int[] inOrder,int key,int start,int end){
        for(int i=start;i<=end;i++){
            if(inOrder[i]==key){
                return i;
            }
        }
        return -1;
    }

    void display(Node node,int level){
        if(node==null){
            return ;
        }
        display(node.right,level+1);
        for(int i=0;i<=level;i++){
            System.out.print("    ");
        }
        System.out.println(node.data);
        display(node.left,level+1);
    }
}
