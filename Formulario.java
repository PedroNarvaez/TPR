import java.awt.*;
import java.awt.event.*;
public class Formulario extends Frame implements ActionListener{
  private Button boton;
  private TextArea area;
  public Formulario(String titulo){
     super(titulo);
     setLayout(new FlowLayout());
     boton = new Button("Aceptar");
     area = new TextArea();
     add(boton);
     add(area);
     show();
     pack();
     addWindowListener(new AdaptadorVentana());
     boton.addActionListener(this);
     area.addMouseListener(new AdaptadorRaton());
  }
  public void actionPerformed(ActionEvent evento){
     System.out.println("Buenas Noches");
  }
  public static void main(String[] args){
    Formulario miForm = new Formulario("Manejo de Eventos");
  }
  class AdaptadorRaton extends MouseAdapter{
    public void mouseEntered(MouseEvent evento){
        area.setText("El raton ha ingresado");
    }
    public void mouseExited(MouseEvent evento){
       area.setText("El raton ha salido");
    }
  }
  class AdaptadorVentana extends WindowAdapter{
    public void windowClosed(WindowEvent evento){
       System.out.println("El formulario se ha cerrado");
       System.exit(0);
    }
    public void windowIconified(WindowEvent evento){
       System.out.println("Minimizado");
    }
    public void windowDeiconified(WindowEvent evento){
       System.out.println("Ya no estoy Minimizado");
    }
    public void windowClosing(WindowEvent evento){
       dispose();
    }
  }
}