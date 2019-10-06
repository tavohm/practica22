package practica22;

import java.util.Scanner;

/* @author tavohm */
public class Practica22 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      Persona Pancracito = new Persona("Pancracio","Gutierritos");
      Persona macaco = new Persona();
      
      int año;
      System.out.println("en que año naciste? ");
      año = leer.nextInt();
      
      System.out.println("La edad de Pancracito es: "+Pancracito.getEdad(año));
      Pancracito.toString();
    }

}
