import java.awt.Frame;

public class MiFrame extends Frame {
	
	public MiFrame(String titulo, int ancho, int alto, int x, int y) {
		this.setSize(ancho, alto);
		this.setTitle(titulo);
		this.setVisible(true);
		this.setLocation(x, y);
	}
	
	public MiFrame(String titulo, int ancho, int alto) {
		this(titulo, ancho, alto, 0, 0);
	}
	
	public MiFrame(String titulo) {
		this(titulo, 400, 200);
	}
	
	public MiFrame() {
		this("Mi ventana", 400, 200);
	}
}
