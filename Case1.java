
package case1;
import java.util.Scanner;

public class Case1 {
static Scanner scanner=new Scanner (System.in);
    
    public static void main(String[] args) {
       
        Metodo1Y2 objetoUno=new Metodo1Y2();
        
        System.out.println("Ingrese un numero");
        int numero=scanner.nextInt();
        System.out.println("El resultado del factorial es: " + objetoUno.numeroFactorial(numero));
        
        
        System.out.print("Ingrese un número entero: ");                                                         
        int numero1 = scanner.nextInt();
        System.out.println("El resulato es: "+objetoUno.tablaMultiplicar(numero1));              
        
                
        
        
        
      
        System.out.println("Días de la semana:");
        int dia;
        System.out.println("1.- Luness.");
        System.out.println("2.- Martes.");
        System.out.println("3.- Miércoles.");
        System.out.println("4.- Jueves.");
        System.out.println("5.- Viernes.");
        System.out.println("6.- Sábado.");
        System.out.println("7.- Domingo.");
        dia = scanner.nextInt();
    
        switch (dia) {
        case 1:
        System.out.println("El día seleccionado es: ");
        break;
        case 2:
        System.out.println("El día seleccionado es: DÍA LABORAL");
        break;
        case 3:
        System.out.println("El día seleccionado es: DÍA LABORAL");
        break;
        case 4:
        System.out.println("El día seleccionado es: DÍA LABORAlL");
        break;
        case 5:
        System.out.println("El día seleccionado es: DÍA LABORAL");
        break;
        case 6:
        System.out.println("El día seleccionado es: DÍA NO LABORAL");
        break;
        case 7:
        System.out.println("El día seleccionado es: DÍA NO LABORAL");
        break;
        default:
        System.out.println("ERROR: número incorrecto.");
        
     }
  }
}
