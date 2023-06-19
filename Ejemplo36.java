import java.util.Scanner;
public class Ejemplo36{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);   
     // sc.nextBoolean();
     // sc.nextDouble();
     // sc.nextFloat();
     // sc.nextInt();
     // sc.nextLine();
     System.out.print("Ingrese su nombre: ");
     String nombre = sc.nextLine();

     System.out.println("Nombre: " + nombre);

     // sc.hasNextBoolean();
     // sc.hasNextDouble();
     // sc.hasNextLine();
     
     int suma = 0, contador = 0;
     int numero;
     while(sc.hasNextInt()){
        numero = sc.nextInt();
        suma += numero; contador++;
     }
     int promedio = suma / contador;
     System.out.println("La media es: " + promedio);
  }
}