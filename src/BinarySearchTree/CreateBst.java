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

    boolean search(Node node,int value){
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

    boolean searchUsingIterating(Node node,int value){
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

    Node deleteNode(Node node,int value){
        if(node==null){
            return node;
        }
        if(value>node.data){
            node.right=deleteNode(node.right,value);
        }
        else if(node.data>value){
            node.left=deleteNode(node.left,value);
        }
        else{
            if(node.right==null && node.left==null){
                return null;
            }
            else if(node.left==null){
                return node.right;
            }
            else if(node.right==null){
                return node.left;
            }
            else{
                Node rep=find(node.right);
                node.data=rep.data;
                node.right=deleteNode(node.right,rep.data);
            }
        }
        return node;
    }

    Node find(Node node){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
}
