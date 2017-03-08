/* En Java no existe una forma de realizar una función de "intercambio()"
 * como en C, C++ o algún otro lenguaje. Una forma de acercarse a este
 * comportamiento es utilizando la referencia de un objeto para afectar
 * su estado. Te muestro a continuación un ejemplo.
 */

public class SolucionIntercambio {  
  /* Declaramos los elementos que vamos a intercambiar como
   * campos de esta clase.
   */
  private int x;
  private int y;
  
  /* Creamos un constructor para inicializar los campos que
   * declaramos antes.
   */
  public SolucionIntercambio(int x, int y) {
      this.x = x;
      this.y = y;
  }
  
  /* Creamos nuestro método de intercambio. Como puedes observar,
   * este método no recibe ningún parámetro y prácticamente solo puede
   * ser utilizado por esta clase ya que solo afecta a sus propios campos.
   */
  public void intercambio() {
      int temp = x;
      x = y;
      y = temp;
  }
  
  /* Aquí es simplemente un método de utilidad para mostrar los cambios 
   * que hemos realizado.
   */
  public void mostrarValores(){
      System.out.println("x: " + x);
      System.out.println("y: " + y);
      System.out.println();
  }
}

class SolucionIntercambioPrueba {
	public static void main(String[] args) {
		/* Instanciamos nuestra clase y le damos los valores que nosotros
		 * queramos.
		 */
		SolucionIntercambio si = new SolucionIntercambio(4, 8);

		/* Ahora solo mostramos sus valores originales, realizamos
		 * el intercambio haciendo uso de su método y verificamos
		 * que se efectuó dicho cambio.
		 */
		System.out.println("-- Antes --");
		si.mostrarValores();

		si.intercambio();
		System.out.println("-- Después --");
		si.mostrarValores();

		/* Como te decía al inicio, lamentablemente no existe una forma 
		 * para lograr un "intercambio()" que funcione en cualquier caso.
		 * Aún así, puedes acceder al siguiente link y ver otras formas
		 * curiosas de intentar recrear esta funcionalidad: 
		 * http://stackoverflow.com/questions/2393906/how-do-i-make-my-swap-function-in-java
		 */
	}
}