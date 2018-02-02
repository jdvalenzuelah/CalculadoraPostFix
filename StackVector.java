
/**
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 */

import java.util.Vector;

public class StackVector<E> implements Stack<E> {

	private Vector<E> container;
	
	/**
	 * Constructor de la clase
	 */
	public StackVector() {
		this.container = new Vector<E>();
	}
	
	/**
	 * Constructor de la clase
	 * @param container
	 */
	public StackVector(Vector<E> container) {
		this.container = container;
	}

	/* (non-Javadoc)
	 * @see CalculadoraStack.Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E item) {
		this.container.add(item);
	}

	/* (non-Javadoc)
	 * @see CalculadoraStack.Stack#pop()
	 */
	@Override
	public E pop() {
		return this.container.remove(this.container.size() -1);
	}

	/* (non-Javadoc)
	 * @see CalculadoraStack.Stack#peek()
	 */
	@Override
	public E peek() {
		return ((this.empty()) ? null : this.container.get(this.container.size() -1));
	}

	/* (non-Javadoc)
	 * @see CalculadoraStack.Stack#empty()
	 */
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return ((this.container.size() <= 0) ? true : false);
	}

	/* (non-Javadoc)
	 * @see CalculadoraStack.Stack#size()
	 */
	@Override
	public int size() {
		return this.container.size();
	}


}