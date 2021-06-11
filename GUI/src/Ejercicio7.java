import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Crea una ventana en la que dandole a unos votones te dice las veces que los has pulsado
 * 
 * @author luis0
 *
 */
public class Ejercicio7 {
	private static int num;
	private static TextField cont;
	public static void main(String[] args) {
		MiFrame ventana = new MiFrame("Contador", 300, 100);
		Panel panel1 = new Panel(new FlowLayout());
		Button boton1 = new Button("Contar");
		Button boton2 = new Button("Contar otra vez");
		cont = new TextField(10);
		num = 0;
		cont.setText("" + num);
		ventana.add(panel1);
		panel1.add(cont);
		panel1.add(boton1);
		panel1.add(boton2);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contar();
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contar();
				
			}
		});
		
	}
	
	public static void contar() {
		num += 1;
		cont.setText("" + num);
	}
}
