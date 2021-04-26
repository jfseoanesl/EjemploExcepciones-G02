package test;

import java.util.Scanner;
import modelo.*;

public class Test {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroA ;
        int numeroB ;
        
        boolean conExcepcion=true;
        do{
            try{    
                System.out.println("Numero 1: ");
                numeroA = entrada.nextInt();
                System.out.println("Numero 2: ");
                numeroB = entrada.nextInt();

                int division = Calculadora.dividir(numeroA, numeroB);
                System.out.println("division = " + division);

                double raiz = Calculadora.raiz(numeroB);
                System.out.println("raiz = " + raiz);

                conExcepcion = false;

            }
            catch(java.util.InputMismatchException ex){
                System.out.println("Se requiere valor entero");
                conExcepcion = true;
                entrada.nextLine();
            }
            catch(ExcepcionPropia ex){
                System.out.println(ex);
                conExcepcion=true;
            } 
            finally{
                if(conExcepcion)
                    System.out.println("El codigo genero excepciones");
                else
                    System.out.println("El codigo ejecuto sin excepciones");
            }
        }while(conExcepcion);    
        
    }
}
