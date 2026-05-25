package Hashing.OpenHashing.DoubleHashing;

public class Main {
    public static void main(String[] args) {
        DoubleHashingDemo hashTable=new DoubleHashingDemo(10);
        hashTable.insert(15);
        hashTable.insert(25);
        hashTable.insert(5);
        hashTable.insert(35);
        hashTable.insert(22);
        hashTable.insert(45);

        hashTable.display();

        System.out.println(hashTable.search(25));
        System.out.println(hashTable.search(67));


        hashTable.delete(25);
        hashTable.display();

        System.out.println(hashTable.search(45));
    }
}
