import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Ejemplo34{
  public static void main(String[] args){
    Date hoy = new Date();
    System.out.println(hoy);

    Calendar c = new GregorianCalendar();
    String dia, mes, anho;
    dia = Integer.toString(c.get(Calendar.DATE));
    mes = Integer.toString(c.get(Calendar.MONTH));
    anho = Integer.toString(c.get(Calendar.YEAR));

    System.out.println(dia + "/" + mes  + "/" + anho);
  }
}