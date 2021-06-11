import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Crea una ventana que simula un telefono
 * 
 * @author luis0
 *
 */

public class Ejercicio6 {
	static boolean call;
	
	public static void main(String[] args) {
		call = false;
		MiFrame ventana = new MiFrame("Telefono", 500, 600);
		Panel panel = new Panel(new BorderLayout());
		ventana.add(panel);
		TextArea texto = new TextArea(1, 1);
		panel.add(texto, BorderLayout.NORTH);
		Panel teclas = new Panel(new GridLayout(4, 3));
		panel.add(teclas, BorderLayout.CENTER);

		Button boton1 = new Button("1");
		Button boton2 = new Button("2");
		Button boton3 = new Button("3");
		Button boton4 = new Button("4");
		Button boton5 = new Button("5");
		Button boton6 = new Button("6");
		Button boton7 = new Button("7");
		Button boton8 = new Button("8");
		Button boton9 = new Button("9");
		Button clear = new Button("CLEAR");
		Button boton0 = new Button("0");
		Button hangUp = new Button("CALL");
		
		teclas.add(boton1);
		teclas.add(boton2);
		teclas.add(boton3);
		teclas.add(boton4);
		teclas.add(boton5);
		teclas.add(boton6);
		teclas.add(boton7);
		teclas.add(boton8);
		teclas.add(boton9);
		teclas.add(clear);
		teclas.add(boton0);
		teclas.add(hangUp);
		
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("1");
			}
		});
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("2");
			}
		});
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("3");
			}
		});
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("4");
			}
		});
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("5");
			}
		});
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("6");
			}
		});
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("7");
			}
		});
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("8");
			}
		});
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("9");
			}
		});
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("");
			}
		});
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.append("0");
			}
		});
		hangUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!call) {
					hangUp.setLabel("HANG UP");
					call = true;
				} else {
					hangUp.setLabel("CALL");
					call = false;
					texto.setText("");
				}
			}
		});

	}
}
