import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Crea una ventana donde hay una vemtana y un boton, le das al boton y suma uno al contador
 * 
 * @author luis0
 *
 */

public class Ejercicio5 {
	private static int num;
	public static void main(String[] args) {
		MiFrame ventana = new MiFrame("Contador", 200, 200);
		Panel panel1 = new Panel(new FlowLayout());
		Button boton1 = new Button("Contar");
		TextField cont = new TextField(10);
		num = 0;
		cont.setText("" + num);
		ventana.add(panel1);
		panel1.add(cont);
		panel1.add(boton1);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num += 1;
				cont.setText("" + num);
			}
		});
	}
}