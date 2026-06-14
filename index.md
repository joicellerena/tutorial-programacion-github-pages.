# Tutorial de Programación

## 1. Ciclos (Bucles)

Los ciclos permiten repetir instrucciones varias veces.

### Ejemplo

for(int i=1; i<=5; i++){
    System.out.println(i);
}

### Ejercicio

Mostrar los números del 1 al 10.

### Solución

for(int i=1; i<=10; i++){
    System.out.println(i);
}
Código fuente: ciclos/Ciclos.java
## 2. Métodos (Funciones)

Los métodos permiten reutilizar código.

### Ejemplo

public static int suma(int a, int b){
    return a+b;
}

### Ejercicio

Crear un método que multiplique dos números.

### Solución

public static int multiplicar(int a, int b){
    return a*b;
}
Código fuente: metodos/Metodos.java
## 3. Vectores y Matrices

Los vectores almacenan varios datos del mismo tipo.

### Ejemplo

int[] numeros = {1,2,3,4,5};

### Ejercicio

Mostrar todos los elementos del vector.

### Solución

for(int i=0; i<numeros.length; i++){
    System.out.println(numeros[i]);
}
Código fuente: vectores_matrices/VectoresMatrices.java
## 4. Listas

Las listas permiten almacenar elementos dinámicamente.

### Ejemplo

ArrayList<String> nombres = new ArrayList<>();

### Ejercicio

Agregar tres nombres a una lista.

### Solución

nombres.add("Ana");
nombres.add("Luis");
nombres.add("Carlos");
Código fuente: listas/Listas.java
## 5. Manejo de Archivos

Permite guardar y leer información desde archivos.

### Ejemplo

FileWriter archivo = new FileWriter("datos.txt");

### Ejercicio

Crear un archivo y escribir tu nombre.
### Solución
FileWriter archivo = new FileWriter("nombre.txt");
archivo.write("Joice");
archivo.close();
Código fuente: archivos/ManejoArchivos.java
