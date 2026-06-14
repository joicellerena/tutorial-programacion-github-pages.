# Tutorial de Programación

## Introducción

Bienvenido a este tutorial de programación. Aquí aprenderás conceptos fundamentales utilizados en el desarrollo de software.

---

# 1. Ciclos (Bucles)

Los ciclos permiten repetir instrucciones varias veces.

## Ejemplo

```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

## Ejercicio

Mostrar los números del 1 al 10.

## Solución

```java
for(int i = 1; i <= 10; i++){
    System.out.println(i);
}
```

### Código fuente

[Ver Ciclos.java](https://github.com/joicellerena/tutorial-programacion-github-pages./blob/main/ciclos/Ciclos.java)

---

# 2. Métodos (Funciones)

Los métodos permiten reutilizar código.

## Ejemplo

```java
public static int suma(int a, int b){
    return a + b;
}
```

## Ejercicio

Crear un método que multiplique dos números.

## Solución

```java
public static int multiplicar(int a, int b){
    return a * b;
}
```

### Código fuente

[Ver Metodos.java](https://github.com/joicellerena/tutorial-programacion-github-pages./blob/main/metodos/Metodos.java)

---

# 3. Vectores y Matrices

Los vectores almacenan varios datos del mismo tipo.

## Ejemplo

```java
int[] numeros = {1,2,3,4,5};

for(int i = 0; i < numeros.length; i++){
    System.out.println(numeros[i]);
}
```

## Ejemplo de Matriz

```java
int[][] matriz = {
    {1,2},
    {3,4}
};
```

## Ejercicio

Crear un vector con cinco nombres.

## Solución

```java
String[] nombres = {
    "Ana",
    "Luis",
    "Carlos",
    "Pedro",
    "Maria"
};

for(String nombre : nombres){
    System.out.println(nombre);
}
```

### Código fuente

[Ver VectoresMatrices.java](https://github.com/joicellerena/tutorial-programacion-github-pages./blob/main/vectores_matrices/VectoresMatrices.java)

---

# 4. Listas

Las listas permiten almacenar elementos dinámicamente.

## Ejemplo

```java
ArrayList<String> nombres = new ArrayList<>();

nombres.add("Ana");
nombres.add("Luis");
nombres.add("Carlos");
```

## Ejercicio

Crear una lista con cinco ciudades.

## Solución

```java
ArrayList<String> ciudades = new ArrayList<>();

ciudades.add("Ambato");
ciudades.add("Quito");
ciudades.add("Cuenca");
ciudades.add("Loja");
ciudades.add("Guayaquil");
```

### Código fuente

[Ver Listas.java](https://github.com/joicellerena/tutorial-programacion-github-pages./blob/main/listas/Listas.java)

---

# 5. Manejo de Archivos

Permite guardar y leer información desde archivos.

## Ejemplo

```java
FileWriter archivo = new FileWriter("datos.txt");

archivo.write("Hola Mundo");

archivo.close();
```

## Ejercicio

Crear un archivo llamado estudiantes.txt y guardar tres nombres.

## Solución

```java
FileWriter archivo = new FileWriter("estudiantes.txt");

archivo.write("Juan\n");
archivo.write("Maria\n");
archivo.write("Pedro\n");

archivo.close();
```

### Código fuente

[Ver ManejoArchivos.java](https://github.com/joicellerena/tutorial-programacion-github-pages./blob/main/archivos/ManejoArchivos.java)

---

# Conclusión

Los ciclos, métodos, vectores, matrices, listas y manejo de archivos son herramientas fundamentales para desarrollar programas eficientes y organizados.

La práctica constante permite fortalecer los conocimientos adquiridos.
