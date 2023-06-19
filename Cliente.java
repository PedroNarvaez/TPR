public class Cliente extends Perso{
   private int idcliente;
   public Cliente(String n, int c, int ic){
     super(n,c);
     idcliente = ic;
   }
   public void cargaId(int ic){
     idcliente = ic;
   }
   public int recuId(){
     return idcliente;
   }
}