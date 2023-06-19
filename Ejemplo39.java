public class Ejemplo39{
  public static void main(String[] args){
     int b = 0;
     int n;
     String s = null;
     try{
        String nombre = args[0];
        //s.equals("QQQQ");
        //n = 23 / b;
        System.out.println(nombre);
     }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error en indice en un array");
     }catch(ArithmeticException e){
        System.out.println("Error de Aritmetica");
     }
     catch(Exception e){
        System.out.println("ERROR!");
     }finally{
        System.out.println("HAYA O NO ERROR");
     }
     
     
  }
}