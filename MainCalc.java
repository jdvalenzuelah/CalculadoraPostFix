import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */


/**
 * @author daval
 *
 */
public class MainCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculadoraStacks calc = new CalculadoraStacks();
		File datos = new File("datos.txt");
		try {
			BufferedReader  reader = new BufferedReader(new FileReader(datos));
			String line = reader.readLine();
			System.out.println(line + " =" + calc.calcular(line));
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
