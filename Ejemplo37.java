public class Ejemplo37{
  public static void main(String[] args){
     
     Cliente c1 = new Cliente(args[0],
                              Integer.parseInt(args[1]),
                              Integer.parseInt(args[2]));
  
     System.out.println("Nombre: " + c1.recuNombre() + 
                         " Cedula: " + c1.recuCedula() + 
                         "Id Cliente: " + c1.recuId());
  }
}