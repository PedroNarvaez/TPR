public class Ejemplo32{
  public static void main(String[] args){
     //int double byte short long boolean String
     String str = "El lenguaje Java";
     String str1 = new String("El lenguaje Java");
     String b1 = "";
     String b2 = new String();
     int longitud = str.length();
     System.out.println("Longitud del str: " + longitud);
     boolean resultado = str.startsWith("El");
     System.out.println("Busca si empieza con El:" + resultado);
     resultado = str.endsWith("El");
     System.out.println("Busca si termina con El:" + resultado);
     // toUpperCase()
     // toLowerCase()
     System.out.println("Convertir a mayusculas: " + str.toUpperCase());
     
  }
}