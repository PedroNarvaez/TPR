public class Ejemplo33{
  public static void main(String[] args){
     String str1 = "El lenguaje Java";
     String str2 = new String("El lenguaje Java");
     if(str1 == str2)
        System.out.println("Los mismos objetos");
     else
        System.out.println("Distintos objetos");

     if(str1.equals(str2))
       System.out.println("El mismo contenido");
     else
       System.out.println("Distintos contenidos");

     int pos = str1.indexOf('a');
     System.out.println("Primera ocurrencia de a: " + pos);
     pos = str1.indexOf('a',pos + 1);
     System.out.println("Siguiente ocurrencia de a: " + pos);
     pos = str1.indexOf('a',pos + 1);
     System.out.println("Tercera ocurrencia de a: " + pos);
     pos = str1.indexOf('a',pos + 1);
     System.out.println("Cuarta ocurrencia de a: " + pos);
  }
}