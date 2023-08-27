# Practica 2
## Ejercicio 1
- Momento de la verificación:
En Objective-C, la verificación de tipos es principalmente dinámica en tiempo de ejecución. Esto significa que los errores de tipo pueden no ser detectados hasta que el programa se esté ejecutando.

---
- Declaratividad de los tipos:
Objective-C es un lenguaje tipado de forma débil y dinámica. Esto significa que no es necesario declarar explícitamente el tipo de una variable al declararla. Las variables se pueden asignar a diferentes tipos en tiempo de ejecución.
---
- Identificación de los tipos:
En Objective-C, los tipos de objetos son identificados mediante el uso de punteros a objetos precedidos por el símbolo ```*```.
## Ejercicio 2
- Momento de la verificación:
Ruby realiza la verificación de tipos en tiempo de ejecución. Esto significa que los errores de tipo, como llamar a un método que no existe en un objeto o realizar operaciones no válidas en un tipo de datos, se detectan cuando se ejecuta el programa.
---
- Declaratividad de los tipos:
Ruby es un lenguaje de tipado dinámico, lo que significa que no es necesario declarar explícitamente el tipo de una variable al asignarle un valor. El tipo de una variable se determina en tiempo de ejecución según el valor que contiene en ese momento. 
---
- Identificación de los tipos:
En Ruby, los tipos de datos se determinan dinámicamente en tiempo de ejecución. Esto significa que el tipo de un objeto se conoce cuando se crea o se le asigna un valor. Ruby utiliza la reflexión y la introspección para identificar los tipos de objetos y determinar si los métodos y propiedades son aplicables a esos objetos.
---

## Ejecicio 3
- Momento de la verificación:
Scala es un lenguaje de tipado estático, lo que significa que la verificación de tipos se realiza en tiempo de compilación. Los errores de tipo deben resolverse antes de que el programa se ejecute. Esto ayuda a detectar errores de tipo antes de que puedan causar problemas en tiempo de ejecución.
---
- Declaratividad de los tipos:
Scala es conocido por su sistema de tipos expresivo y flexible. Permite declarar tipos de datos de manera concisa y expresiva, lo que facilita la lectura y escritura de código. 
---
- Identificación de los tipos:
En Scala, los tipos son explícitos y se declaran en las definiciones de clases, objetos y métodos. El compilador de Scala utiliza inferencia de tipos para deducir automáticamente los tipos en muchos casos, lo que reduce la necesidad de especificar tipos de manera redundante. 

## Ejercicio 4
Considere los tipos “A”, “B”, “C” y “D”, y que existen los valores “a”, “b”, “c” y “d”, donde “a”
es de tipo “A”, “b” es de tipo “B”, “c” de tipo “C” y “d” de tipo “D”. Además, tenga en consideración las siguientes relaciones de subtipado:
- B es subtipo de A
- C es subtipo de A
- D es subtipo de C

Luego, indique cuáles de estas asignaciones son válidas y cuáles no:
- a. var x : A := a

Válida: Se asigna un valor de tipo "A" a una variable de tipo "A".
- b. var x : B := a

No válida: No se puede asignar un valor de tipo "A" a una variable de tipo "B" sin una conversión explícita.
- c. var x : C := a

No válida: No se puede asignar un valor de tipo "A" a una variable de tipo "C" sin una conversión explícita.
- d. var x : D := a

No válida: No se puede asignar un valor de tipo "A" a una variable de tipo "D" sin una conversión explícita.
- e. var x : A := b

Válida: Se asigna un valor de tipo "B" a una variable de tipo "A" debido a la relación de subtipado (B es subtipo de A).
- f. var x : B := b

Válida: Se asigna un valor de tipo "B" a una variable de tipo "B".
- g. var x : C := b

No válida: No se puede asignar un valor de tipo "B" a una variable de tipo "C" sin una conversión explícita.
- h. var x : D := b

No válida: No se puede asignar un valor de tipo "B" a una  variable de tipo "D" sin una conversión explícita.
- i. var x : A := c

Válida: Se asigna un valor de tipo "C" a una variable de tipo "A" debido a la relación de subtipado (C es subtipo de A).
- j. var x : B := c

Válida: Se asigna un valor de tipo "C" a una variable de tipo "B" debido a la relación de subtipado (C es subtipo de A, y B es subtipo de A).
- k. var x : C := c

Válida: Se asigna un valor de tipo "C" a una variable de tipo "C".
- l. var x : D := c

No válida: No se puede asignar un valor de tipo "C" a una variable de tipo "D" sin una conversión explícita.
- m. var x : A := d

No válida: No se puede asignar un valor de tipo "D" a una  variable de tipo "A" sin una conversión explícita.
- n. var x : B := d
 
 No válida: No se puede asignar un valor de tipo "D" a una variable de tipo "B" sin una conversión explícita.
- o. var x : C := d
 
No válida: No se puede asignar un valor de tipo "D" a una variable de tipo "C" sin una conversión explícita.
- p. var x : D := d
 
Válida: Se asigna un valor de tipo "D" a una variable de tipo "D".

## Ejercicio  5

- Parking[Thing]:

No es una instancia válida. El tipo Thing no está en el rango [Bicycle, Vehicle]
- Parking[Car]:

Sí es una instancia válida. El tipo Car está dentro del rango [Bicycle, Vehicle].
- Parking[Vehicle]:

Sí es una instancia válida. El tipo Vehicle está dentro del rango [Bicycle, Vehicle].
- Parking[Bicycle]:

 Sí es una instancia válida. El tipo Bicycle está dentro del rango [Bicycle, Vehicle].
- Parking[Tricycle]:

No es una instancia válida. Aunque Tricycle es una subclase de Bicycle, no cumple con la restricción A <: Vehicle, ya que Tricycle no es una subclase directa de Vehicle.