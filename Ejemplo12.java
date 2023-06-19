import java.io.*;
public class Ejemplo12{
  public static void main(String[] args){
     BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
     int nro = 0;
     String salida = "";
     System.out.print("Ingrese un valor entero: ");
     try{
        nro = Integer.parseInt(dato.readLine());
     }catch(IOException e){
        System.out.println("Error!");
     }
     salida = ((nro%10) == 0)?"ES MULTIPLO DE 10":"NO ES MULTIPLO DE 10";
     System.out.println(salida);
   }
}