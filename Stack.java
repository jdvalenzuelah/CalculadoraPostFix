
/**
 * 
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @param <E>
 */

public interface Stack<E> 
{

    /**
     * Guardar un elemento en el stack.
    * @param item Elemento a guardar
    */
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
    /**
     * Elimina el ultimo elemento agrgado al stack
    * @return Elemento que ha sido eliminado
    */
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   /**
    * Ultimo elemento agregado al stack, siguiente en pop
    * @return Ultimo elemento agregado
    */
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   /**
    * Tsack lleno o vacio
    * @return True si y solo si el stack esta vacio.
    */
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   /**
    * Numero de elementos dentro del stack
    * @return tamaño del stack
    */
   public int size();
   // post: returns the number of elements in the stack

}

