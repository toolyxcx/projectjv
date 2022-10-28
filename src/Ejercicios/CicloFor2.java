package Ejercicios;
import java.util.Scanner;

public class CicloFor2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int pri1 = 0, cant2, referencia = 0, subtotal, total = 0, billete = 0, cambio = 0;
        String seguir = "s", no = "n";

        for (int x = 1; x <= 5; x++) {
            System.out.println("digite el precio del producto");
            pri1 = leer.nextInt();

            System.out.println("digite la cantidad del producto");
            cant2 = leer.nextInt();
            subtotal = pri1 * cant2;
            // iniciar el contador de minutis de la compra
            referencia = referencia + 1;
            // iniciamos acumulador para el total de la compra
            total = total + subtotal;

        }

        System.out.println("el total de su compra es \n" + total);
        System.out.println("ingrese el valor con el que desea pagar");
        billete = leer.nextInt();
        cambio = billete - total;
        System.out.println("su cambio es \n" + cambio);
        leer.nextLine();
        System.out.println("cuenta con telefonia movil exito, presione s si es correcto de lo contrario presione n");

        if (seguir.equals("s")) {
            System.out.println("la cantidad de minutos de la compra es \n" + referencia);
            seguir = leer.nextLine();

        }
        else if(no.equals("n")){
            System.out.println("no pierdas mas minutos adquiere tu telefonia movil");
            no=leer.nextLine();
        }
        

        leer.close();

    }
}
