# Practica 2
## Ejercicio 1

## Ejercicio 2
- Momento de la verificación:
Ruby realiza la verificación de tipos en tiempo de ejecución. Esto significa que los errores de tipo, como llamar a un método que no existe en un objeto o realizar operaciones no válidas en un tipo de datos, se detectan cuando se ejecuta el programa.
---
- Declaratividad de los tipos:
Ruby es un lenguaje de tipado dinámico, lo que significa que no es necesario declarar explícitamente el tipo de una variable al asignarle un valor. El tipo de una variable se determina en tiempo de ejecución según el valor que contiene en ese momento. En el código proporcionado, no se declaran tipos de datos para las clases ni para los métodos.
---
- Identificación de los tipos:
En Ruby, los tipos de datos se determinan dinámicamente en tiempo de ejecución. Esto significa que el tipo de un objeto se conoce cuando se crea o se le asigna un valor. Ruby utiliza la reflexión y la introspección para identificar los tipos de objetos y determinar si los métodos y propiedades son aplicables a esos objetos.
---

## Ejecicio 3
- Momento de la verificación:
Scala es un lenguaje de tipado estático, lo que significa que la verificación de tipos se realiza en tiempo de compilación. Los errores de tipo deben resolverse antes de que el programa se ejecute. Esto ayuda a detectar errores de tipo antes de que puedan causar problemas en tiempo de ejecución.
---
- Declaratividad de los tipos:
Scala es conocido por su sistema de tipos expresivo y flexible. Permite declarar tipos de datos de manera concisa y expresiva, lo que facilita la lectura y escritura de código. En el código proporcionado, se utilizan los tipos de datos definidos por el usuario, como case class, para crear estructuras de datos con campos tipados de manera explícita.
---
- Identificación de los tipos:
En Scala, los tipos son explícitos y se declaran en las definiciones de clases, objetos y métodos. El compilador de Scala utiliza inferencia de tipos para deducir automáticamente los tipos en muchos casos, lo que reduce la necesidad de especificar tipos de manera redundante. En el código dado, las clases Post y Address declaran sus campos con tipos específicos.

## Ejercicio 4
Considere los tipos “A”, “B”, “C” y “D”, y que existen los valores “a”, “b”, “c” y “d”, donde “a”
es de tipo “A”, “b” es de tipo “B”, “c” de tipo “C” y “d” de tipo “D”. Además, tenga en consideración las siguientes relaciones de subtipado:
- B es subtipo de A
- C es subtipo de A
- D es subtipo de C

Luego, indique cuáles de estas asignaciones son válidas y cuáles no.
- a. var x : A := a
- b. var x : B := a
- c. var x : C := a
- d. var x : D := a
- e. var x : A := b
- f. var x : B := b
- g. var x : C := b
- h. var x : D := b
- i. var x : A := c
- j. var x : B := c
- k. var x : C := c
- l. var x : D := c
- m. var x : A := d
- n. var x : B := d
- o. var x : C := d
- p. var x : D := d