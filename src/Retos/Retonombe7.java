package Retos;

import java.util.Scanner;

public class Retonombe7 {
    public static void main(String[] args){
        try (Scanner leer = new Scanner (System.in)) {
            String nombre, apellido;
            System.out.println("Digite su nimbre");
            nombre=leer.nextLine();
            System.out.println("digites su apellido");
            apellido=leer.nextLine();

            System.out.println("su nombre en mayusculas es"+(nombre.toUpperCase()));
            System.out.println("su apellido en miniscula es"+(apellido.toLowerCase()));

            System.out.println("su nombre completo es "+nombre+" "+apellido);

            System.out.println("su nombre tiene"+nombre.length()+ "caracteres");

            System.out.println("su apellido tiene "+apellido.length()+" caracteres");

            System.out.println("su usuario puede ser"+(nombre.substring(0, 2))+apellido);
        }



    }
}
