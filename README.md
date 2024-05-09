# Ejercicios Tema 5. Algoritmia básica: ordenación y búsqueda

LINK: https://github.com/GabriHR/Ejercicios_Tema_5.git

## DESCRIPCIÓN

Un proyecto que recoge todo lo aprendido en el Tema 5, Algoritmia básica: ordenación y búsqueda, de la asignatura de Estructura de Datos. En este proyecto encontraremos pakcage con sus correspondientes clases e interfaces que cumplen todas las funciones de los ejercicios específicados. A su vez estarán la clase Main que ejecuta el código de todo el proyecto y lo muestra por pantalla y ña cñase Exercise para tratar a todas las clases de ejercicio de manera uniforme en el código.

__INTERFACE EXERCISE__

- La interfaz Exercise es una interfaz simple que define un solo método, execute(). Esta interfaz se utiliza como un contrato para todas las clases que representan un ejercicio en tu proyecto. Cada clase de ejercicio implementa esta interfaz y proporciona su propia implementación del método execute().
- El método execute() no toma ningún argumento y no devuelve ningún valor. Cuando se llama a este método, se espera que la clase de ejercicio realice su tarea principal. En el contexto de tu proyecto, parece que la tarea principal de cada ejercicio es mostrar una interfaz de usuario y realizar alguna operación cuando se interactúa con esa interfaz.

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

  
