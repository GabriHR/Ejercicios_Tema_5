# Ejercicios Tema 5. Algoritmia básica: ordenación y búsqueda
Proyecto sobre Ejercicios del tema 5 desarrollado por Gabriel Hernanz Rodríguez.
LINK: https://github.com/GabriHR/Ejercicios_Tema_5.git

## DESCRIPCIÓN

Un proyecto que recoge todo lo aprendido en el Tema 5, Algoritmia básica: ordenación y búsqueda, de la asignatura de Estructura de Datos. En este proyecto encontraremos pakcage con sus correspondientes clases e interfaces que cumplen todas las funciones de los ejercicios específicados. A su vez estarán la clase Main que ejecuta el código de todo el proyecto y lo muestra por pantalla y ña cñase Exercise para tratar a todas las clases de ejercicio de manera uniforme en el código.

__(EJ1) 10 MINUTOS__

- Ejercicio_1: Esta es la clase principal que implementa la interfaz Exercise. En su método execute(), crea una instancia de RecursiveNaturalNumberSumCalculator y utiliza esta para calcular la suma de los primeros 10 números naturales. Luego, muestra el resultado en una ventana de Swing.  
- NaturalNumberSumCalculator: Esta es una interfaz que define un método calculateSum(int n). Este método está destinado a calcular la suma de los primeros n números naturales.  
   RecursiveNaturalNumberSumCalculator: Esta es una clase que implementa la interfaz NaturalNumberSumCalculator. Implementa el método calculateSum(int n) de una manera recursiva. Si n es menor o igual a 0, devuelve 0. De lo contrario, devuelve n más el resultado de calculateSum(n - 1). Esto efectivamente calcula la suma de los primeros n números naturales.

__(EJ2) 20MINUTOS__

- Ejercicio_2: Esta es la clase principal que implementa la interfaz Exercise. En su método execute(), crea una instancia de RecursiveNaturalNumberPrinter y utiliza esta para imprimir los números naturales del 1 al 10. Luego, muestra el resultado en una ventana de Swing.  
- NaturalNumberPrinter: Esta es una interfaz que define un método printNumbers(int a, int d). Este método está destinado a imprimir los números naturales en el rango de a a d.  
- RecursiveNaturalNumberPrinter: Esta es una clase que implementa la interfaz NaturalNumberPrinter. Implementa el método printNumbers(int a, int d) de una manera recursiva. Si a es menor o igual a d, añade a a una cadena y luego llama a printNumbersRecursive(a + 1, d, numbers). Esto efectivamente imprime todos los números naturales en el rango de 'a' a 'd'.

__(EJ3) 15 MINUTOS__

- Ejercicio_3: Esta es la clase principal que implementa la interfaz Exercise. En su método execute(), genera números aleatorios con una cantidad aleatoria de dígitos (entre 1 y 10) y los muestra en una ventana de Swing.  
- DigitCounter: Esta es una interfaz que define un método countDigits(int number). Este método está destinado a contar la cantidad de dígitos en un número.  
- RecursiveDigitCounter: Esta es una clase que implementa la interfaz DigitCounter. Implementa el método countDigits(int number) de una manera recursiva. Si number es menor que 10 y mayor que -10, devuelve 1. De lo contrario, devuelve 1 más el resultado de countDigits(number / 10). Esto efectivamente cuenta la cantidad de dígitos en un número.

__(EJ 4) 15 MINUTOS__

- Ejercicio_4: Esta es la clase principal que implementa la interfaz Exercise. En su método execute(), crea una instancia de PowerCalculator y utiliza esta para calcular el resultado de elevar x a la potencia de y (en este caso, 2 al cubo). Luego, muestra el resultado y las operaciones realizadas en una ventana de Swing.  
- Calculator: Esta es una interfaz que define un método calculate(int x, int y). Este método está destinado a realizar algún tipo de cálculo con los dos números enteros proporcionados.  
- PowerCalculator: Esta es una clase que implementa la interfaz Calculator. Implementa el método calculate(int x, int y) de una manera recursiva para calcular el resultado de elevar x a la potencia de y. Si y es 0, devuelve 1. De lo contrario, multiplica x por el resultado de calculate(x, y - 1). Esta clase también mantiene un registro de las operaciones realizadas, que se pueden recuperar con el método getOperations().

__(EJ 5) 20 MINUTOS__

- MaxValueCalculator: Esta es la clase principal que implementa la interfaz Exercise. En su método execute(), genera un array de números aleatorios y encuentra el valor máximo en este array. Luego, muestra el array y su valor máximo en una ventana de Swing.  
-- generateRandomArray(): Este método genera un array de 10 números aleatorios entre 0 y 99.  
-- findMax(int[] array, int index): Este método encuentra el valor máximo en el array de manera recursiva. Comienza en el índice proporcionado y compara el valor en este índice con el valor máximo en el resto del array.  
-- execute(): Este método crea una interfaz de usuario con un área de texto para mostrar el array y su valor máximo, un botón para generar un nuevo array y calcular su valor máximo, y un botón para volver al menú principal. Cuando se hace clic en el botón para calcular el nuevo máximo, se genera un nuevo array, se encuentra su valor máximo y se actualiza el área de texto.

__(EJ 6) 30 MINUTOS__

- Ejercicio_6: Esta es la clase principal que implementa la interfaz Exercise. En su método execute(), crea una interfaz de usuario con un área de texto para mostrar la conversión de un número hexadecimal a decimal, un botón para realizar la conversión, y un botón para volver al menú principal. Cuando se hace clic en el botón para convertir, se muestra un cuadro de diálogo para introducir un número hexadecimal, se convierte a decimal utilizando la clase HexadecimalToDecimalConverter, y se actualiza el área de texto.  
- HexadecimalToDecimalConverter: Esta clase tiene un método convert(String hex, int length) que convierte un número hexadecimal a decimal de manera recursiva. Si la longitud del número hexadecimal es 1, devuelve el valor decimal del carácter. De lo contrario, convierte el último carácter a decimal y lo suma al resultado de convertir el resto del número multiplicado por 16.

__(EJ 7 ) 5 MINUTOS__  

- Ejercicio_7: Esta es la clase principal que implementa la interfaz Exercise. En su método execute(), crea una interfaz de usuario con un área de texto para mostrar el cálculo del coeficiente binomial, un botón para realizar el cálculo, y un botón para volver al menú principal. Cuando se hace clic en el botón para calcular, se muestran cuadros de diálogo para introducir los valores de n y k, se calcula el coeficiente binomial utilizando la clase BinomialCoefficientCalculator, y se actualiza el área de texto.  
- BinomialCoefficientCalculator: Esta clase tiene un método calculate(int n, int k) que calcula el coeficiente binomial de manera recursiva. Si k es 0 o igual a n, devuelve 1. De lo contrario, devuelve la suma de calculate(n - 1, k - 1) y calculate(n - 1, k). Esto efectivamente calcula el coeficiente binomial según la fórmula C(n, k) = C(n-1, k) + C(n-1, k-1).

__(EJ 8) 20 MINUTOS__

- Ejercicio_8: Esta es la clase principal que implementa la interfaz Exercise. En su método execute(), crea una interfaz de usuario con un área de texto para mostrar una cadena de ADN generada aleatoriamente y el número de genes en ella, un botón para generar una nueva cadena de ADN y contar los genes, y un botón para volver al menú principal. Cuando se hace clic en el botón para generar, se genera una nueva cadena de ADN, se cuenta el número de genes (definidos como la secuencia de inicio "ATG") y se actualiza el área de texto.  
-- generateRandomDna(): Este método genera una cadena de ADN de longitud aleatoria (entre 100 y 800) compuesta por las bases de ADN "A", "T", "G" y "C".  
-- countGenes(): Este método cuenta el número de genes en la cadena de ADN. Un gen se define como la secuencia de inicio "ATG".  
-- execute(): Este método crea una interfaz de usuario con un área de texto para mostrar la cadena de ADN y el número de genes, un botón para generar una nueva cadena de ADN y contar los genes, y un botón para volver al menú principal. Cuando se hace clic en el botón para generar, se genera una nueva cadena de ADN, se cuenta el número de genes y se actualiza el área de texto.


__(EJ 9) 20 MINUTOS__


- El código del Ejercicio 9 es una aplicación de escritorio en Java que permite al usuario seleccionar un archivo de texto y ordenar las palabras de cada línea en orden alfabético.
- Cuando se ejecuta, se muestra una ventana con dos botones: "Ordenar archivo" y "Menú Principal".
- Al hacer clic en "Ordenar archivo", se abre un selector de archivos. Una vez que el usuario selecciona un archivo, el programa lee el contenido del archivo y lo muestra en una nueva ventana titulada "Archivo original".
- Luego, en esta ventana, el usuario puede presionar un botón titulado "Archivo ordenado". Al hacerlo, se cierra la ventana "Archivo original" y se abre una nueva ventana titulada "Archivo ordenado". En esta ventana, se muestra el contenido del archivo original, pero con las palabras de cada línea ordenadas en orden alfabético.
- Además, en la ventana "Archivo ordenado", el usuario tiene la opción de seleccionar otro archivo para ordenar, haciendo clic en el botón "Elegir más archivos", o de cerrar todas las ventanas y volver al menú principal, haciendo clic en el botón "Menú Principal".
- Si ocurre un error al leer el archivo, se muestra un cuadro de diálogo con un mensaje de error.

__(EJ 10) 15 MINUTOS__

- El código del Ejercicio 10 es una aplicación de escritorio en Java que permite al usuario buscar una palabra específica en un archivo de texto.
-  Cuando se ejecuta, se muestra una ventana con un campo de texto para ingresar la palabra a buscar, y dos botones: "Buscar en archivo" y "Menú Principal".
-  Al hacer clic en "Buscar en archivo", se abre un selector de archivos. Una vez que el usuario selecciona un archivo, el programa lee el contenido del archivo línea por línea y busca la palabra ingresada en cada línea.
-  Si se encuentra la palabra, se muestra un cuadro de diálogo con el número de línea y la posición en la línea donde se encontró la palabra. Si no se encuentra la palabra, se muestra un cuadro de diálogo que indica que la palabra no fue encontrada.  Si ocurre un error al leer el archivo, se muestra un cuadro de diálogo con un mensaje de error.
-  El botón "Menú Principal" cierra la ventana actual y vuelve al menú principal.


__(EJ 11) 15 MINUTOS__


- El código del Ejercicio 11 es una aplicación de escritorio en Java que permite al usuario buscar una palabra específica en un archivo de texto.  Cuando se ejecuta, se muestra una ventana con un campo de texto para ingresar la palabra a buscar, y dos botones: "Buscar en archivo" y "Menú Principal".
- Al hacer clic en "Buscar en archivo", se abre un selector de archivos. Una vez que el usuario selecciona un archivo, el programa lee el contenido del archivo, divide cada línea en palabras, ordena las palabras y realiza una búsqueda binaria para encontrar la palabra ingresada.
- Si se encuentra la palabra, se muestra un cuadro de diálogo que indica que la palabra fue encontrada. Si no se encuentra la palabra, se muestra un cuadro de diálogo que indica que la palabra no fue encontrada.
- Si ocurre un error al leer el archivo, se muestra un cuadro de diálogo con un mensaje de error.
-  El botón "Menú Principal" cierra la ventana actual y vuelve al menú principal.


__(EJ 12) 20 MINUTOS__

- El código del Ejercicio 12 es una aplicación de escritorio en Java que permite al usuario agregar fechas a una lista y luego listar esas fechas.
- Cuando se ejecuta, se muestra una ventana con un campo de texto para ingresar una fecha, y cuatro botones: "Agregar fecha", "Agregar fecha aleatoria", "Listar fechas" y "Menú Principal".
- Al hacer clic en "Agregar fecha", se intenta parsear la fecha ingresada en el campo de texto y se agrega a la lista de fechas. Si la fecha ingresada no es válida, se muestra un cuadro de diálogo con un mensaje de error.
- Al hacer clic en "Agregar fecha aleatoria", se genera una fecha aleatoria entre el 1 de enero de 1900 y el 31 de diciembre de 2020, y se agrega a la lista de fechas.
- Al hacer clic en "Listar fechas", se muestra un cuadro de diálogo con todas las fechas en la lista, ordenadas en orden ascendente.
- El botón "Menú Principal" cierra la ventana actual y vuelve al menú principal.  Si ocurre un error al parsear la fecha, se muestra un cuadro de diálogo con un mensaje de error.

__(EJ 13) 30 MINUTOS__

- El código del Ejercicio 13 es una aplicación de escritorio en Java que genera fechas aleatorias, las ordena y las muestra al usuario.
- Cuando se ejecuta, se muestra una ventana con cuatro botones: "Ejecutar", "Ordenar y mostrar", "Listar fechas" y "Menú Principal".
- Al hacer clic en "Ejecutar", se generan 10 fechas aleatorias entre el 1 de enero de 1900 y el 31 de diciembre de 2020, y se agregan a una lista de fechas.
- Al hacer clic en "Ordenar y mostrar", se ordenan las fechas en la lista en orden ascendente utilizando el algoritmo de ordenamiento rápido (quick sort), y luego se imprimen en la consola.
- Al hacer clic en "Listar fechas", se muestra un cuadro de diálogo con todas las fechas en la lista, en el orden en que se encuentran actualmente en la lista.
- El botón "Menú Principal" cierra la ventana actual y vuelve al menú principal.
- La clase Mejora_Algoritmos contiene el algoritmo de ordenamiento rápido (quick sort) que se utiliza para ordenar las fechas. Este algoritmo toma un arreglo de fechas y los índices de inicio y fin del segmento del arreglo que se desea ordenar, y ordena las fechas en ese segmento en orden ascendente o descendente, dependiendo del valor del parámetro ascendente.

__INTERFACE 'EXERCISE'__

- La interfaz Exercise es una interfaz simple que define un solo método, execute(). Esta interfaz se utiliza como un contrato para todas las clases que representan un ejercicio en tu proyecto. Cada clase de ejercicio implementa esta interfaz y proporciona su propia implementación del método execute().
- El método execute() no toma ningún argumento y no devuelve ningún valor. Cuando se llama a este método, se espera que la clase de ejercicio realice su tarea principal. En el contexto de tu proyecto, parece que la tarea principal de cada ejercicio es mostrar una interfaz de usuario y realizar alguna operación cuando se interactúa con esa interfaz.


__CLASE MAIN__


- La clase Main es el punto de entrada de la aplicación. Cuando se ejecuta la aplicación, se crea una ventana de JFrame con el título "Ejercicios". Esta ventana tiene un tamaño de 960x760, se cierra cuando se presiona el botón de cierre de la ventana, y tiene un diseño de cuadrícula con 14 filas y 1 columna.
- Se crea un arreglo de objetos Exercise, cada uno de los cuales representa un ejercicio diferente. Cada ejercicio es una instancia de una clase que implementa la interfaz Exercise.
- Para cada ejercicio en el arreglo, se crea un botón con el texto "Ejercicio " seguido del número del ejercicio. Cuando se presiona este botón, se ejecuta el método execute del ejercicio correspondiente.
- Además, se crea un botón "Salir" que, cuando se presiona, cierra la aplicación.
- Finalmente, se establece la ubicación de la ventana en el centro de la pantalla y se hace visible.
- En resumen, la clase Main crea una interfaz de usuario que permite al usuario seleccionar y ejecutar diferentes ejercicios.
