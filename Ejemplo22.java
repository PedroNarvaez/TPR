public class Ejemplo22{
  public static void main(String[] args){
     int x = 10;
     String msg = "";
     do {
       msg += x;
       x++;
     }while( x < 10);
     System.out.println(msg);
  }
}