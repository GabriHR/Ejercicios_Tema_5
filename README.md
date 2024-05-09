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
