import javax.swing.JOptionPane;
public class Ejemplo15{
  public static void main(String[] args){
     int punto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota"));
     String msg = "";
     switch(punto){
        case 100:
           msg = "Excelente!";
           break;
        case 90:
           msg = "Buen Trabajo!";
           break;
         case 80:
           msg = "Estudiar mas!";
           break;
          default:
            msg = "Lo siento, Fallaste.";
     }
     JOptionPane.showMessageDialog(null, msg);
  }
www
}