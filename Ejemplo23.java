import javax.swing.*;
public class Ejemplo23{
  public static void main(String[] args){
     int i;
     double suma = 0.0;
     String msg = "";
     for(i = 0; i < 10; i++){
       msg += i + "\n";
       suma += Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor"));
     }
     System.out.println(i);
     System.out.println(msg);
  }
}