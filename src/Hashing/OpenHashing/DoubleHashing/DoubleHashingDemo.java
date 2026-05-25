package Hashing.OpenHashing.DoubleHashing;

public class DoubleHashingDemo {
    private int[] hashTable;
    private int size;
    private final int EMPTY=-1;
    private final int DELETED=-2;

    public DoubleHashingDemo(int size){
        this.size=size;
        hashTable=new int[size];
        for(int i=0;i<size;i++){
            hashTable[i]=EMPTY;
        }
    }

    private int hash(int key){
        return key%size;
    }

    private int hash2(int key){
        return 7-(key%7);
    }

    public void insert(int key){
        int index=hash(key);
        if(hashTable[index]==EMPTY || hashTable[index]==DELETED){
            hashTable[index]=key;
            return;
        }
        int jumpSize=hash2(key);
        int i=1;
        while(true){
            int newIndex=(index+i*jumpSize)%size;
            if(hashTable[newIndex]==EMPTY || hashTable[newIndex]==DELETED){
                hashTable[newIndex]=key;
                return;
            }
            i++;
            if(i==size){
                System.out.println("Hash Table is Full");
                return;
            }
        }
    }


    public boolean search(int key){
        int index=hash(key);
        int jumpSize=hash2(key);
        int i=0;
        while(i<size){
            int newIndex=(index+i*jumpSize)%size;
            if(hashTable[newIndex]==EMPTY){
                return false;
            }
            if(hashTable[newIndex]==key){
                return true;
            }
            i++;
        }
        return false;
    }

    public void delete(int key){
        int index=hash(key);
        int jumpSize=hash2(key);
        int i=0;
        while(i<size){
            int newIndex=(index+i*jumpSize)%size;
            if(hashTable[newIndex]==EMPTY){
                return;
            }
            if(hashTable[newIndex]==key){
                hashTable[newIndex]=DELETED;
                return;
            }
            i++;
        }
    }


    public void display(){
        System.out.println(".....HashTable.....");
        for(int i=0;i<size;i++){
            System.out.println(i+" --> "+hashTable[i]);
        }
    }

}
