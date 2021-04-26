/*
 Programa principal del cajero
 */
package cajeroautomaico;

/**
 *
 * @author jesus
 */
public class Cajero {
    public static void main(String args[]){
       
        Saldo paso = new Consulta();
        paso.OperacionBancaria();
        paso.MostrarResultado();
    }
}
