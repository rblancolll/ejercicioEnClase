
package case1;
import static case1.Metodo3Y4.scanner;
import java.util.Scanner;

public class Case1 {
static Scanner scanner=new Scanner (System.in);
    
    public static void main(String[] args) throws InterruptedException {
       
        Metodo1Y2 objetoUno=new Metodo1Y2();
        
        System.out.print("Factorial\n");     
        System.out.println("Ingrese un numero");
        int numero=scanner.nextInt();
        System.out.println("El resultado del factorial es: " + objetoUno.numeroFactorial(numero));
        
        System.out.print("-------------------------------------\n");   
        
        System.out.print("Tabla de Multiplicar\n");     
        System.out.print("Ingrese un número entero:\n");                                                         
        int numero1 =scanner.nextInt();
        System.out.println(objetoUno.tablaMultiplicar(numero1));              
       // Thread.sleep(3000);
                
        
     
        
        Metodo3Y4 objetoDos=new Metodo3Y4();
        
        System.out.println("Digite la cantidad de numero");
         //int cantidad1= scanner.nextInt();
        System.out.println(objetoDos.numerosPares(10));
       
            // if (Terminar<=0){
             //   romper = false;
                //        }else{
               //  System.out.println(" ");
            
           //  }
        // break;
        // }
         
         
        System.out.println("Días de la semana:");
        System.out.print("Elige un dia de la semana");
        System.out.println("\n1.- Lunes.");
        System.out.println("2.- Martes.");
        System.out.println("3.- Miércoles.");
        System.out.println("4.- Jueves.");
        System.out.println("5.- Viernes.");
        System.out.println("6.- Sábado.");
        System.out.println("7.- Domingo.");
        int uno= scanner.nextInt();
        System.out.print(""+objetoDos.semana(uno));
     
    }

}
