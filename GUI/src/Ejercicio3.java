
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Pulsas un botos y te dice cual se ha pulsado por ultima vez
 * 
 * @author luis0
 *
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		MiFrame ventana = new MiFrame("Ventana", 300, 100);
		Panel panel1 = new Panel(new FlowLayout());
		Button boton1 = new Button("Primero");
		Button boton2 = new Button("Segundo");
		TextField texto = new TextField(10);
		ventana.add(panel1);
		panel1.add(boton1);
		panel1.add(texto);
		panel1.add(boton2);
		
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(boton1.getLabel());
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(boton2.getLabel());
				
			}
		});
		
	}
}
