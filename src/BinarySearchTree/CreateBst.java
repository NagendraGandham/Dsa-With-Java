package BinarySearchTree;

public class CreateBst {
    Node root;

    CreateBst(){
        this.root=null;
    }


    Node insert(Node node,int value){
        if(node==null){
            return new Node(value);
        }

        if(node.data>=value){
            node.left=insert(node.left,value);
        }
        else{
            node.right=insert(node.right,value);
        }
        return node;
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

    void inOrdertraversal(Node node){
        if(node==null){
            return ;
        }
        inOrdertraversal(node.left);
        System.out.print(node.data+" ");
        inOrdertraversal(node.right);
    }

    Boolean search(Node node,int value){
        if(node==null){
            return false;
        }
        if(node.data==value){
            return true;
        }
        if(node.data<value){
            return search(node.right,value);
        }
        else{
            return search(node.left,value);
        }
    }

    Boolean searchUsingIterating(Node node,int value){
        while(node!=null){
            if(node.data==value){
                return true;
            }
            if(node.data<value){
                node=node.right;
            }
            else{
                node=node.left;
            }
        }
        return false;
    }

    Node insertUsingIterativeApproach(Node node,int value) throws Exception{
        Node prev=null;
        if(node==null){
            root=new Node(value);
            return root;
        }
        while(node!=null){
            prev=node;
            if(node.data==value){
                throw new Exception("No duplicate elements allowed");
            }
            if(node.data<value){
                node=node.right;
            }
            else{
                node=node.left;
            }
        }
        if(prev.data>value){
            prev.left=new Node(value);
        }
        else{
            prev.right=new Node(value);
        }
        return root;
    }
}
