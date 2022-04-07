
package case1;
import static case1.Case1.scanner;
import java.util.Scanner;

public class Metodo3Y4 {
    static  Scanner scanner=new Scanner (System.in);
   
       public int numerosPares(int numerosPares){
           
         int cantPar=0, cantImpar=0, Prom, Mayor=0, Terminar, Acum=0, sumaPar=0, sumaImpar=0;
         int cantidad1= scanner.nextInt();
         boolean romper = true;
         
         while (romper) {
             for (int i =1; i<cantidad1; i++){
                 System.out.println("Digite numero" +i);
                 int num = scanner.nextInt();
                 
                 if(num%2==0){
                     cantPar++;
                     sumaPar= sumaPar+num;
                 }else{
                   cantImpar++;                
                   sumaImpar= sumaImpar+num;
                 }
            if(num >=Mayor){
                Mayor = num;
            }
            Acum= sumaImpar+sumaPar;
            
            }
            Prom= cantImpar;
            
              System.out.println("Cantidad de numero pares es :" + cantPar);
              System.out.println("Cantidad de numeros impares es :" + cantImpar);
              System.out.println("La suma total es de :" + Acum);
              System.out.println("El promedio de los numero impares :" + Prom);
              System.out.println("0.Salir ");
              Terminar = scanner.nextInt(); 
              if (Terminar<=0){
              romper = false;
              }else{
              System.out.println(" ");
              }
         }    
        return numerosPares;
       
       }
    
        public int semana(int semana){
       
        switch (semana){
        case 1:
        System.out.println("El día seleccionado es: DÍA LABORAL");
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
        return semana;
 }
    }
         
     
