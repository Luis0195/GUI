
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Crea una ventana donde puedes introducir dos numeros y te dice cual es el mayor
 * Si metes letras o cualquier cosa que no sea un numero se interpretara como un 0
 * @author luis0
 *
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		MiFrame ventana = new MiFrame("Ventana", 500, 200);
		Panel panel1 = new Panel(new FlowLayout());
		Button boton1 = new Button("Comparar");
		TextField num1 = new TextField(10);
		TextField num2 = new TextField(10);
		TextField resultado = new TextField(20);
		ventana.add(panel1);
		panel1.add(new Label ("Primer numero:"));
		panel1.add(num1);
		panel1.add(new Label ("Segundo numero:"));
		panel1.add(num2);
		panel1.add(boton1);
		panel1.add(resultado);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1, n2;
				try {
					   n1 = Integer.parseInt(num1.getText());
					}
					catch (NumberFormatException e1)
					{
					   n1 = 0;
					}
				try {
					   n2 = Integer.parseInt(num2.getText());
					}
					catch (NumberFormatException e1)
					{
					   n2 = 0;
					}
				if (n1 > n2) {
					resultado.setText("El numero mayor es el: " + n1);
				}
				else if (n1 == n2) {
					resultado.setText("Los numeros son iguales");
				}
				else {
					resultado.setText("El numero mayor es el: " + n2);
				}
			}
		});
		
	}
}
