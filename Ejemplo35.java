public class Ejemplo35{
  public static void main(String[] args){
    double x = Double.parseDouble(args[0]);
    int  d = Integer.parseInt(args[1]);
    double i = Math.round(x * Math.pow(10,d)) / Math.pow(10,d);
    System.out.println(i);
   
  }
}