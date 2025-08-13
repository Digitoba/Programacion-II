
package tp1;

import java.util.Scanner;

public class TP1_4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " X " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        
    }
    
}