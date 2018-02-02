//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//David Valenzuela		171001
//Fernando Hengstenberg 17699	
//Calculadora 1.0



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * 
 */


/**
 * @author daval
 *
 */
public class MainCalc {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculadoraStacks calc = new CalculadoraStacks();


		System.out.println("ingrese el nombre del archivo");// le pedimos que ingrese el nombre del archivo
		String nombre = sc.nextLine(); // guardamos el nombre del archivo en la variable nombre
		File datos = new File(nombre);  
		try {
			BufferedReader  reader = new BufferedReader(new FileReader(datos));
			String line = reader.readLine();
			System.out.println(line + " =" + calc.calcular(line));	
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage()); // en caso de algun error 
		}

	}

}
