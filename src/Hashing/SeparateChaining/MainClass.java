package Hashing.SeparateChaining;

public class MainClass {
    public static void main(String[] args) {
        HashTable table=new HashTable(10);
        table.insert(12);
        table.insert(13);
        table.insert(16);
        table.insert(19);
        table.insert(15);
        table.insert(162);
        table.insert(676);
        table.printTable();
        System.out.println(table.search(6));
        System.out.println(table.search(12));
        table.delete(676);
        table.printTable();

    }
}
