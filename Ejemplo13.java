import javax.swing.JOptionPane;
public class Ejemplo13{
  public static void main(String[] args){
     String nombre = "";
     nombre = JOptionPane.showInputDialog("Ingrese su nombre");
     String msg = "Hola " + nombre + "!";
     JOptionPane.showMessageDialog(null,msg);
  }
}