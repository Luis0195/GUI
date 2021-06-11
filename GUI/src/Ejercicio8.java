import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Crea una ventana donde tu escribes y dandole al boton de guardarte guarda el texto en un archivo.
 * Cuidado porque este archivo se sobreescribe
 * 
 * @author luis0
 *
 */

public class Ejercicio8 {
	private static Logger guardador;
	
	public static void main(String[] args) {
		guardador = new Logger();
		MiFrame ventana = new MiFrame("Archivos", 500, 500);
		Panel panel1 = new Panel(new BorderLayout());
		Panel panel2 = new Panel(new FlowLayout());
		Button boton1 = new Button("Guardar");
		TextArea text = new TextArea();
		ventana.add(panel1);
		panel1.add(text, BorderLayout.CENTER);
		panel2.add(boton1);
		panel1.add(panel2, BorderLayout.SOUTH);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardador.writeFile(text.getText());
			}
		});
	}
}
