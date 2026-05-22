package Hashing.OpenHashing.LinearProbing;

public class LpMain {
    public static void main(String[] args) {
        LinearProbing table=new LinearProbing(7);
        table.insert(22);
        table.insert(17);
        table.insert(15);
        table.insert(27);
        table.insert(25);
        table.insert(29);
        table.display();
        System.out.println(table.search(17));
        table.delete(25);
        table.display();
        System.out.println(table.search(29));
        table.insert(3);
        table.display();
    }
}
