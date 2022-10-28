package Ejercicios;

import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int x = 1; x <= 5; x++) {
            System.out.println("digite el precio del producto");
            leer.nextInt();

            System.out.println("digite la cantidad del producto");
            leer.nextInt();
        }
        leer.close();

    }
}
