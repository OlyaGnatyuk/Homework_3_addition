package org.example.multiplication_table;

public class MultiplicationTable {
    public static void printMultiplicationTable() {
        for (int x = 1; x <= 9;  x++) {
            for (int y = 1; y <= 9; y++) {
                int result = x * y;
                if (result < 10) {
                    System.out.print(x + " * " + y + " = " + result + "     ");
                } else {
                    System.out.print(x + " * " + y + " = " + result + "    ");
                }
            }
            System.out.println();
        }
    }
}
