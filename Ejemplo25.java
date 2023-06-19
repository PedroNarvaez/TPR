import java.io.*;
public class Ejemplo25{
  public static void main(String[] args){
    BufferedReader entra = new BufferedReader(new InputStreamReader(System.in));
    String msg = "";
    String nombre = "";
    int dia = 0;
    int importe = 0;
    System.out.print("Nombre: ");
    try{
       nombre = entra.readLine();
       System.out.print("\nDias de la Semana\tCantidad Hora");
       System.out.print("\n-----------------\t-------------");
       System.out.print("\nLunes\t\t\t\t");
       dia = Integer.parseInt(entra.readLine());
       System.out.print("\nMartes\t\t\t\t");
       dia += Integer.parseInt(entra.readLine());
       System.out.print("\nCantidad Hora Semana: " + dia);
       System.out.print("\nImporte x hora: "); 
       importe = Integer.parseInt(entra.readLine());
       System.out.print("\nImporte a cobrar: "+ (importe * dia));
    }catch(IOException p){
       System.out.println("Error!");
    }
    
  }
}