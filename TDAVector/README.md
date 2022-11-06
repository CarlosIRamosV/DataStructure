# TDAVector
Para compilar y ejecutar el proyecto, ejecuta el comando `./gradlew TDAVector:run` en la raíz del repositorio.
## Clase TDAVector
### Atributos
* `int[] vector` almacena los elementos del vector.
* `int numElem` almacena el número de elementos del vector.

### Métodos
* `TDAVector()` constructor por defecto. Inicializa el vector a 0 elementos con un tamaño de 32.
* `TDAVector(int tamaño)` constructor con parámetro. Inicializa el vector a 0 elementos con un tamaño de `tamaño`.
* `agregarElementoFinal(int elemento)` agrega un elemento al final del vector.
* `eliminarElementoFinal()` elimina el último elemento del vector.
* `insertarElemento(int elemento)` inserta un elemento de forma ordenada en el vector.
* `eliminarElemento(int elemento)` elimina un elemento del vector.
* `getVector()` devuelve el vector en forma de string.
* `burbuja()` ordena el vector de forma ascendente mediante el método de la burbuja.
* `burbujaInvertido()` ordena el vector de forma descendente mediante el método de la burbuja.
* `shell()` ordena el vector de forma ascendente mediante el método de Shell.
* `shellInvertido()` ordena el vector de forma descendente mediante el método de Shell.
* `buscarElemento(int elemento)` busca un elemento en el vector y devuelve su posición.
* `agregarPrimerElemento(int elemento)` agrega un elemento al principio del vector.
* `eliminarPrimerElemento()` elimina el primer elemento del vector.