
public class PasoDeVariable {
  
  public static void main(String[] args) {
    
    /* Se crea el objeto Persona en memoria dinámica y se nos regresa
     * una referencia que almacenamos en la variable "vecino".
     * Para fines prácticos trataremos a la referencia como una 
     * dirección de memoria PERO es muy importante saber que 
     * una referencia NO ES UNA DIRECCIÓN DE MEMORIA.
     */
    Persona vecino = new Persona("Hugo");
    
    /* Mostramos el nombre en pantalla accediendo directamente
     * al campo "nombre".
     */
    System.out.println("-> " + vecino.nombre);
    
    /* Llamamos al método "cambiarNombre(Persona p)" pasando
     * por referencia al objeto "vecino" que creamos (pasa a 
     * la definición del método para conocer su funcionamiento).
     */
    cambiarNombre(vecino);    
    
    /* Mostramos de nuevo el nombre en pantalla y notaremos que 
     * no hubo cambio alguno.
     */
    System.out.println("-> " +vecino.nombre);
  }
  
  /* A este método se le pasa por valor la referencia de un objeto
   * de tipo "Persona". Al entrar en acción, el método crea una
   * nueva variable (llamada "p") que será la encargada de almacenar
   * una copia de la "dirección" que hemos pasado a dicho método.
   */
  public static void cambiarNombre(Persona p) {
    
    /* ¡Aquí surge el problema!
     * En esta instrucción creamos un nuevo objeto "Persona", Java
     * nos otorga una nueva "dirección" para dicho objeto y enseguida 
     * hacemos que la variable "p" guarde esta nueva "dirección".
     * Como "p" es una variable local a la función, el cambio que hemos
     * efectuado se pierde al salir y, la variable original, permanecerá
     * intacta.
     */
    p = new Persona("Miguel");
    
    /* La historia sería muy diferente si escribiéramos algo como 
     * lo siguiente: 
     *
     * p.nombre = "Miguel"
     * 
     * En dicho caso, no estamos afectando a la variable "p" sino
     * al objeto al que se está refiriendo. No olvides que estamos
     * pasando al objeto por referencia pero la referencia está
     * siendo pasada por valor.
     */
  }
}

class Persona {
  public String nombre;
  public Persona(String nombre) {
    this.nombre = nombre;
  }
}