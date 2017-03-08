#include <stdio.h>
#include <stdlib.h>

typedef struct _Nodo {
  int dato;
  struct _Nodo *siguiente;
} Nodo;
 
void crearNodo(Nodo* n, int d);
void cambiarDato(Nodo* n, int d);

/* En la nota, la primera parte de este código hace modificación
 * del apuntador que tenemos como parámetro y, la segunda parte,
 * modifica la estructura a la que se refiere el apuntador.
 */
int main()
{
	// ================== PRIMERA PARTE ================== 
	Nodo *nuevo = NULL;
	crearNodo(nuevo, 4);

	if (nuevo == NULL) {
	    printf("No se creo el nodo :(\n");
	}
	else {
	    printf("Nodo creado con exito :D\n");
	}
	// ================ FIN PRIMERA PARTE ================


	// ================== SEGUNDA PARTE ==================
	Nodo nd = {5, NULL};
	printf("Dato inicial: %d\n", nd.dato);
	 
	cambiarDato(&nd, 8);
	printf("Dato nuevo: %d\n", nd.dato);
	// ================ FIN SEGUNDA PARTE ================

	return 0;
}

void crearNodo(Nodo* n, int d) {
    n = malloc(sizeof(Nodo));
    n->dato = d;
    n->siguiente = NULL;
}

void cambiarDato(Nodo* n, int d) {
    n->dato = d;
}