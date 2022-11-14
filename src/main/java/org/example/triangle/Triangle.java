package org.example.triangle;

public class Triangle {
    public static void printTriangle() {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
