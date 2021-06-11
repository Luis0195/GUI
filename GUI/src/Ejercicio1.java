import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

/**
 * Crea una ventana con distintos tipos de layouts
 * 
 * @author luis0
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		MiFrame ventana = new MiFrame("Ventana", 500, 500);
		Panel panel1 = new Panel(new GridLayout(4, 5));
		Panel panel2 = new Panel(new GridLayout(2, 2));
		Panel panel3 = new Panel(new GridLayout(1, 2));
		Panel panel4 = new Panel(new GridLayout(3, 1));
		Panel panel5 = new Panel(new GridLayout(1, 2));
		Panel panel6 = new Panel(new GridLayout(1, 2));
		Panel panel8 = new Panel(new GridLayout(3, 1));
		Panel panel9 = new Panel(new BorderLayout());
		Panel panel10 = new Panel(new GridLayout(1, 2));
		
		ventana.add(panel1);
		panel1.add(panel2);
		panel2.add(new Button("A"));
		panel2.add(new Button("B"));
		panel2.add(new Button("C"));
		panel2.add(new Button("D"));
		panel1.add(new Button("2"));
		panel1.add(new Button("3"));
		panel1.add(new Button("4"));
		panel1.add(panel3);
		panel3.add(new Button("A"));
		panel3.add(new Button("B"));
		panel1.add(new Button("6"));
		panel1.add(panel4);
		panel4.add(new Button("A"));
		panel4.add(new Button("B"));
		panel4.add(new Button("C"));
		panel1.add(new Button("8"));
		panel1.add(new Button("9"));
		panel1.add(panel5);
		panel5.add(new Button("A"));
		panel5.add(new Button("B"));
		panel1.add(new Button("11"));
		panel1.add(new Button("12"));
		panel1.add(panel8);
		panel8.add(new Button("A"));
		panel8.add(new Button("B"));
		panel8.add(new Button("C"));
		panel1.add(new Button("14"));
		panel1.add(panel6);
		panel6.add(new Button("A"));
		panel6.add(new Button("B"));
		panel1.add(new Button("17"));
		panel1.add(new Button("18"));
		panel1.add(new Button("19"));
		panel1.add(panel9);
		panel9.add(new Button("A"), BorderLayout.NORTH);
		panel9.add(new Button("B"), BorderLayout.EAST);
		panel9.add(new Button("C"), BorderLayout.CENTER);
		panel9.add(new Button("D"), BorderLayout.WEST);
		panel9.add(new Button("E"), BorderLayout.SOUTH);
		panel1.add(panel10);
		panel10.add(new Button("A"));
		panel10.add(new Button("B"));
	}

}
