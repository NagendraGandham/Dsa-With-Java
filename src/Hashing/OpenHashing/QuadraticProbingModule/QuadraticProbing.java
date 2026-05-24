package Hashing.OpenHashing.QuadraticProbingModule;

public class QuadraticProbing {
    private int[] hashTable;
    private int size;
    private final int EMPTY=-1;
    private final int DELETED=-2;

    public QuadraticProbing(int size){
        this.size=size;
        hashTable=new int[size];
        for(int i=0;i<size;i++){
            hashTable[i]=EMPTY;
        }
    }

    private int hash(int key){
        return key%size;
    }

    public void insert(int key){
        int index=hash(key);
       for(int i=0;i<size;i++){
           int newIndex=(index + i* i)%size;
           if(hashTable[newIndex]==EMPTY || hashTable[newIndex]==DELETED){
               hashTable[newIndex]=key;
               return;
           }
       }
        System.out.println("Hash Table is full");
        hashTable[index]=key;
    }

    public boolean search(int key){
        int index=hash(key);
        for(int i=0;i<size;i++){
            int newIndex=(index+i*i)%size;
            if(hashTable[newIndex]== EMPTY){
                return false;
            }
            if(hashTable[newIndex]==key){
                return true;
            }
        }
        return false;
    }

    public void delete(int key){
        int index=hash(key);
        for(int i=0;i<size;i++) {
            int newIndex = (index + i * i) % size;
            if(hashTable[newIndex]==EMPTY){
                return;
            }
            if(hashTable[newIndex]==key){
                hashTable[newIndex]=DELETED;
            }
        }
    }

    public void display(){
        System.out.println(".....HashTable.....");
        for(int i=0;i<size;i++){
            System.out.println(i+" --> "+hashTable[i]);
        }
    }
}
