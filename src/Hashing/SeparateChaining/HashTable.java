package Hashing.SeparateChaining;

public class HashTable {
    private Node[] hashTable;
    private int size;

    public HashTable(int size){
        this.size=size;
        hashTable=new Node[size];
    }
    private int hash(int key){
        return key % size;
    }

    void insert(int key){
        int index=hash(key);
        Node newnode=new Node(key);
        newnode.next=hashTable[index];
        hashTable[index]=newnode;
    }

    boolean search (int key){
        int index=hash(key) ;
        Node temp=hashTable[index];
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    void delete(int key){
        int index=hash(key);
        Node prev=null;
        Node temp=hashTable[index];
        while(temp!=null){
            if(temp.data==key){
                if(prev==null){
                    hashTable[index]=temp.next;
                }
                else{
                    prev.next=temp.next;
                }
                return;
            }
            prev=temp;
            temp=temp.next;
        }
    }

    void printTable(){
        for(int i=0;i<size;i++){
            System.out.print(i+ " --> ");
            Node curr=hashTable[i];
            while(curr!=null){
                System.out.print(curr.data+"-->");
                curr=curr.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

}
