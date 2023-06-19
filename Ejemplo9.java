import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejemplo9{
  public static void main(String[] args){
    BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
    String nombre = "";
    String ape = "";
    int cedula = 0;
    System.out.print("Ingrese su nombre: ");
    try{
       nombre = dato.readLine();
       System.out.print("Ingrese su Apellido: ");   
       ape = dato.readLine();	
       System.out.print("Ingrese su cedula: ");
       cedula = Integer.parseInt(dato.readLine());
    }catch(IOException e){
       System.out.println("Error!");
    }
    System.out.println("HOLA " + nombre + " "+ ape + "Cedula: " + cedula +"!");
  }
}