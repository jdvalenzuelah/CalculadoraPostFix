//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//David Valenzuela		171001
//Fernando Hengstenberg 17699	
//Calculadora 1.0

//importar bibliotecas
import java.util.Vector;

public class StackVector<E> implements Stack<E> {

	private Vector<E> container;
	
	public StackVector() {
		this.container = new Vector<E>();
	}
	
	/**
	 * @param container
	 */
	public StackVector(Vector<E> container) {
		this.container = container;
	}

	@Override
	public void push(E item) {
		this.container.add(item);
		
		
	}

	@Override
	public E pop() {
		return this.container.remove(this.container.size() -1);
	}

	@Override
	public E peek() {
		return ((this.empty()) ? null : this.container.get(this.container.size() -1));
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return ((this.container.size() <= 0) ? true : false);
	}

	@Override
	public int size() {
		return this.container.size();
	}


}
