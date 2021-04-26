/*
Programa en donde se hara el menu y estructura logica del cajero
 */
package cajeroautomaico;
import java.util.Scanner;
/**
 * @author jesus
 */
public abstract class Saldo {
    
    protected static int saldo = 500;
    protected int opcion,r;
    
    public abstract void OperacionBancaria(); //Metodo de operaciones d cada opcion
    
    public void MostrarResultado(){//Metodo que muestra el resultado de la operacion del cajero
        System.out.println("\nSu saldo actual es: "+r+"$");
    }
}
