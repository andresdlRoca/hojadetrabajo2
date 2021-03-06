/**
 * Clase de interfaz que tendra los metodos que usara la clase de stack para el almacenamiento
 * de la calculadora. 
 * @author Andres de la Roca
 */

public interface Stack<E> {
    
    /**
     * Permite almacenar dentro del stack un objeto
     * @param data
     * @return 
     */
    public void push(E data);

    /**
     * Permite sacar del stack el ultimo objeto que se ingreso
     * @return
     */
    public E pop();

    /**
     * Devuelve un valor true si el almacenamiento stack esta vacio y false si esta lleno
     * @return
     */
    public boolean empty();

    /**
     * Devuelve el ultimo objeto que se ingreso al stack
     * @return
     */
    public E peek();

    /**
     * Devuelve el tamaño del almacenamiento stack
     * @return
     */
    public int size();

}
