public class Perso{
   private String nombre;
   private int cedula;
   public Perso(String n, int c){
     nombre = n;
     cedula = c;
   }
   public void cargaNombre(String n){
      nombre = n;
   }
   public void cargaCedula(int c){
      cedula = c;
   }
   public String recuNombre(){
     return nombre;
   }
   public int recuCedula(){
     return cedula;
   }
}