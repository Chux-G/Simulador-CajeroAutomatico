/*
 Proceso de la primera opcion para consultar el salario vigente
 */
package cajeroautomaico;

import java.util.Scanner;


/**
 *
 * @author jesus
 */
public class Consulta extends Saldo {
    int d, g;
    @Override
     public void OperacionBancaria(){
       int repite = 0;
       Scanner sc = new Scanner(System.in);
      do{
        System.out.println("\nBIENVENIDO AL CAJERO AUTOMATICOO:");
        System.out.println("Seleccione una opcion: ");
        System.out.println("\n1.Consulta de saldo.");
        System.out.println("2.Retiro de Efetivo.");
        System.out.println("3.Deposito de Efectivo");
        System.out.println("4.Salir");
        System.out.println(" \n");
        opcion = sc.nextInt();
         switch(opcion){
             case 1 :
                 r = Saldo.saldo; 
                 MostrarResultado();
                 break;
             case 2 :
                 Scanner l = new Scanner(System.in);
                 System.out.print("\nIngrese que cantidad desea retirar: ");
                 d = l.nextInt();
                 if(d <= 0 || d > Saldo.saldo){
                     System.out.println("E R R O R");
                 } else {
                     r = saldo - d;
                     MostrarResultado();
                 }
                 break;
             case 3 :
                 Scanner c = new Scanner(System.in);
                 System.out.print("\nIngrese que cantidad desea depositar: ");
                 g = c.nextInt();
                 if(g <= 0){
                     System.out.println("E R R O R");
                 } else {
                     r = saldo + g;
                     MostrarResultado();
                 }
                 break;
             case 4 :
                 System.out.println("\nTenga feliz dia");
                 repite = 1;
                 break;
             
             default:
                 System.out.println("\nError, ingrese un numero adecuado del menu");
             
         }
      }while(repite == 0);
  }
}
    


