package Hashing.OpenHashing.QuadraticProbingModule;

import java.util.Queue;

public class QpMain {
    public static void main(String[] args) {
        QuadraticProbing table=new QuadraticProbing(10);
        table.insert(22);
        table.insert(12);
        table.insert(32);
        table.insert(15);
        table.insert(25);
        table.insert(7);
        table.display();
        System.out.println(table.search(12));
        table.delete(25);
        table.display();

    }
}
