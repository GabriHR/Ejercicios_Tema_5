# Ejercicios Tema 5. Algoritmia básica: ordenación y búsqueda

LINK: https://github.com/GabriHR/Ejercicios_Tema_5.git

## DESCRIPCIÓN

Un proyecto que recoge todo lo aprendido en el Tema 5, Algoritmia básica: ordenación y búsqueda, de la asignatura de Estructura de Datos. En este proyecto encontraremos pakcage con sus correspondientes clases e interfaces que cumplen todas las funciones de los ejercicios específicados. A su vez estarán la clase Main que ejecuta el código de todo el proyecto y lo muestra por pantalla y ña cñase Exercise para tratar a todas las clases de ejercicio de manera uniforme en el código.

__(EJ1) 10 MINUTOS__

- Ejercicio_1: Esta es la clase principal que implementa la interfaz Exercise. En su método execute(), crea una instancia de RecursiveNaturalNumberSumCalculator y utiliza esta para calcular la suma de los primeros 10 números naturales. Luego, muestra el resultado en una ventana de Swing.  
- NaturalNumberSumCalculator: Esta es una interfaz que define un método calculateSum(int n). Este método está destinado a calcular la suma de los primeros n números naturales.  
   RecursiveNaturalNumberSumCalculator: Esta es una clase que implementa la interfaz NaturalNumberSumCalculator. Implementa el método calculateSum(int n) de una manera recursiva. Si n es menor o igual a 0, devuelve 0. De lo contrario, devuelve n más el resultado de calculateSum(n - 1). Esto efectivamente calcula la suma de los primeros n números naturales.
