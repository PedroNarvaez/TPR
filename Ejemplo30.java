public class Ejemplo30{
  public static void main(String[] args){
    int[] edades = new int[100];
    String msg = "";
    for(int i=0; i < edades.length; i++){
      msg += i + " " + edades[i];
    }
    System.out.println(msg);
  }
}