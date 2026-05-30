package BinaryTree.TreeConstruction;

public class PreOrderAndInorderTreeConstruction {
    Node treeConstruction(int[] preOrder,int[] inOrder,int[] prInd,int start,int end){
        if(start>end){
            return null;
        }
        Node node=new Node(preOrder[prInd[0]]);
        int index=search(inOrder,preOrder[prInd[0]]);
        prInd[0]++;
        node.left=treeConstruction(preOrder,inOrder,prInd,start,index-1);
        node.right=treeConstruction(preOrder,inOrder,prInd,index+1,end);
        return node;
    }

    int search(int[] inOrder,int key){
        for(int i=0;i<inOrder.length;i++){
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
