public class Ejemplo21{
  public static void main(String[] args){
    int x = 10;
    String msg = "";
    while ( x < 10){
      //msg = msg + x + "\n";
      msg += x + "\n";
      //x = x + 1;
      x++;
    }
    System.out.println(msg);
  }
}