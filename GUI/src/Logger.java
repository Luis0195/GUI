import java.io.*; 
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	private FileWriter fw;
	public Logger() {
		createFileWriter();
	}
	
	public void createFileWriter() {
		try {
	         File file = new File("logs\\" +  "texto.txt");
	         file.getParentFile().mkdirs();
	         fw = new FileWriter(file);
		 }catch(IOException ex){
	    	 System.out.println(ex + "Directorio no encontrado");
	     }
	}
	
	public void writeFile(String line) {
		try {
			fw.write(line + "\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeWirter() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}