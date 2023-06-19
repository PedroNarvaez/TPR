import javax.swing.*;
public class Ejemplo31{
  public static void main(String[] args){
     int arreglo[];
     arreglo = new int[10];
     String salida = "Indice\tValor\n";
     salida +="------\t-----\n";
     for(int contador=0;contador < arreglo.length;contador++)
        salida += contador + "\t" + arreglo[contador] + "\n";
     
     JTextArea areaSalida = new JTextArea();
     areaSalida.setText(salida);
     JOptionPane.showMessageDialog(null,areaSalida,"Inicializacion",JOptionPane.INFORMATION_MESSAGE);   
  }
}