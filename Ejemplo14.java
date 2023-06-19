import javax.swing.JOptionPane;
public class Ejemplo14{
  public static void main(String[] args){
     double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese de nota de TPR"));
     String msg = "";
     if(nota >= 90){
        msg = "Excelente!";
     }else if(nota >= 80){
        msg = "Buen Trabajo!";
     }else if(nota >= 60){
        msg = "Estudiar mas!";
     }else{
        msg = "Lo siento, Fallaste.";	
     }
     
     JOptionPane.showMessageDialog(null, msg);
  }
}