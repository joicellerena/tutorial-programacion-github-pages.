<div style="background: linear-gradient(135deg, #0F2027, #203A43, #2C5364); padding:40px; border-radius:20px; color:white; box-shadow:0 8px 20px rgba(0,0,0,0.3);">

<h1 style="text-align:center; color:#4FC3F7;"> Tutorial de Programación en Java</h1>

<p style="font-size:18px; text-align:justify;">
Bienvenido a este tutorial educativo diseñado para estudiantes y principiantes que desean aprender programación desde cero. Aquí encontrarás explicaciones detalladas, ejemplos prácticos, ejercicios propuestos y soluciones paso a paso.
</p>

<p style="font-size:18px; text-align:justify;">
El objetivo de este material es proporcionar una guía de estudio clara y didáctica para comprender los conceptos fundamentales de la programación utilizando el lenguaje Java.
</p>

<h2 style="color:#81D4FA;"> Temas que aprenderás</h2>

<ul style="font-size:18px;">
<li> Ciclos (Bucles)</li>
<li> Métodos (Funciones)</li>
<li> Vectores y Matrices</li>
<li> Listas</li>
<li> Manejo de Archivos</li>
</ul>

<p style="text-align:center; font-size:22px;">
 <b>¡Comienza tu aprendizaje y desarrolla tus habilidades como programador!</b>
</p>

</div>

<hr>

<h1>1. Ciclos (Bucles)</h1>

<h2>¿Qué es un ciclo?</h2>

<p>
Un ciclo es una estructura de control que permite repetir un conjunto de instrucciones varias veces sin necesidad de escribir el mismo código repetidamente.
</p>

<h2>¿Para qué sirve?</h2>

<ul>
<li>Repetir tareas automáticamente.</li>
<li>Mostrar listas de datos.</li>
<li>Realizar cálculos repetitivos.</li>
<li>Recorrer vectores y matrices.</li>
</ul>

<h2>Ejemplo</h2>

<pre>
<code>
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
</code>
</pre>

<h2>Explicación</h2>

<ul>
<li><b>int i = 1</b>: Inicializa la variable.</li>
<li><b>i <= 5</b>: Condición del ciclo.</li>
<li><b>i++</b>: Incrementa la variable.</li>
<li><b>System.out.println(i)</b>: Muestra el valor.</li>
</ul>

<h2>Salida</h2>

<pre>
1
2
3
4
5
</pre>

<h2>Ejercicio</h2>

<p>Mostrar los números del 1 al 10.</p>

<h2>Solución</h2>

<pre>
<code>
for(int i = 1; i <= 10; i++){
    System.out.println(i);
}
</code>
</pre>

<p>
<a href="TU_ENLACE_GITHUB"> Ver Ciclos.java</a>
</p>

<hr>

<h1> 2. Métodos (Funciones)</h1>

<h2>¿Qué es un método?</h2>

<p>
Un método es un bloque de código reutilizable que realiza una tarea específica.
</p>

<h2>Ejemplo</h2>

<pre>
<code>
public static int suma(int a, int b){
    return a + b;
}
</code>
</pre>

<h2>Explicación</h2>

<ul>
<li>Recibe dos números.</li>
<li>Los suma.</li>
<li>Devuelve el resultado.</li>
</ul>

<h2>Ejercicio</h2>

<p>Crear un método que multiplique dos números.</p>

<h2>Solución</h2>

<pre>
<code>
public static int multiplicar(int a, int b){
    return a * b;
}
</code>
</pre>

<p>
<a href="TU_ENLACE_GITHUB"> Ver Metodos.java</a>
</p>

<hr>

<h1> 3. Vectores y Matrices</h1>

<h2>¿Qué es un vector?</h2>

<p>
Un vector almacena varios datos del mismo tipo en una sola variable.
</p>

<pre>
<code>
int[] numeros = {1,2,3,4,5};
</code>
</pre>

<h2>¿Qué es una matriz?</h2>

<p>
Una matriz organiza información en filas y columnas.
</p>

<pre>
<code>
int[][] matriz = {
    {1,2},
    {3,4}
};
</code>
</pre>

<h2>Ejercicio</h2>

<p>Crear un vector con cinco nombres.</p>

<h2>Solución</h2>

<pre>
<code>
String[] nombres = {
    "Ana",
    "Luis",
    "Carlos",
    "Pedro",
    "Maria"
};
</code>
</pre>

<p>
<a href="TU_ENLACE_GITHUB"> Ver VectoresMatrices.java</a>
</p>

<hr>

<h1> 4. Listas</h1>

<h2>¿Qué es una lista?</h2>

<p>
Una lista es una colección dinámica que puede aumentar o disminuir de tamaño.
</p>

<pre>
<code>
ArrayList<String> nombres = new ArrayList<>();

nombres.add("Ana");
nombres.add("Luis");
nombres.add("Carlos");
</code>
</pre>

<h2>Ejercicio</h2>

<p>Crear una lista con cinco ciudades.</p>

<h2>Solución</h2>

<pre>
<code>
ArrayList<String> ciudades = new ArrayList<>();

ciudades.add("Ambato");
ciudades.add("Quito");
ciudades.add("Cuenca");
ciudades.add("Loja");
ciudades.add("Guayaquil");
</code>
</pre>

<p>
<a href="TU_ENLACE_GITHUB">Ver Listas.java</a>
</p>

<hr>

<h1> 5. Manejo de Archivos</h1>

<h2>¿Qué es el manejo de archivos?</h2>

<p>
Permite guardar y recuperar información desde archivos de texto.
</p>

<pre>
<code>
FileWriter archivo = new FileWriter("datos.txt");

archivo.write("Hola Mundo");

archivo.close();
</code>
</pre>

<h2>Ejercicio</h2>

<p>Crear un archivo llamado estudiantes.txt y guardar tres nombres.</p>

<h2>Solución</h2>

<pre>
<code>
FileWriter archivo = new FileWriter("estudiantes.txt");

archivo.write("Juan\n");
archivo.write("Maria\n");
archivo.write("Pedro\n");

archivo.close();
</code>
</pre>

<p>
<a href="TU_ENLACE_GITHUB"> Ver ManejoArchivos.java</a>
</p>

<hr>

<h1>Conclusión</h1>

<p>
Los ciclos, métodos, vectores, matrices, listas y manejo de archivos son herramientas fundamentales para desarrollar programas eficientes y organizados.
</p>

<p>
La programación se aprende practicando. Experimenta con los ejemplos, resuelve nuevos ejercicios y continúa aprendiendo para fortalecer tus conocimientos.
</p>
