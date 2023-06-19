public class Ejemplo6{
   public static void main(String[] x){
      // Double.parseDouble("10.55");
      String estado = "";    // Integer.parseInt("10")
      String ced = x[1];
      int nota = Integer.parseInt(x[0]); 
      estado = (nota >= 60)? "Aprobado": "Reprobado";
      System.out.println(estado + " Cedula: " + ced);
  }
}