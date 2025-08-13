
package tp1;

import java.util.Scanner;

public class TP1_3 {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println(nombre);
        System.out.println(edad);
        
    }
    
}