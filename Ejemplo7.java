public class Ejemplo7{
  public static void main(String[] x){
    String estado = "";
    int nota = Integer.parseInt(x[0]);
    estado = (nota >= 60)?"Aprobado":"Reprobado";  
    System.out.println(estado);
  }
}