<div style="background:linear-gradient(135deg,#1e3c72,#2a5298);padding:40px;border-radius:20px;color:white;">

<h1 style="text-align:center;font-size:50px;">
🔄 Ciclos (Bucles) en Java
</h1>

<p style="font-size:20px;text-align:justify;">
Los ciclos son una de las herramientas más importantes de la programación. Permiten repetir instrucciones varias veces sin necesidad de escribir el mismo código repetidamente.
</p>

<p style="font-size:20px;text-align:justify;">
Imagina que deseas mostrar los números del 1 al 100. Sería muy tedioso escribir 100 instrucciones diferentes. Gracias a los ciclos, podemos hacerlo con pocas líneas de código.
</p>

</div>

<hr>

<h2>🤔 ¿Qué es un ciclo?</h2>

<p>
Un ciclo es una estructura de control que repite un bloque de instrucciones mientras se cumpla una condición determinada.
</p>

<p>
Los ciclos ayudan a:
</p>

<ul>
<li>Automatizar tareas repetitivas.</li>
<li>Reducir la cantidad de código.</li>
<li>Mejorar la organización de los programas.</li>
<li>Resolver problemas de forma más eficiente.</li>
</ul>

<hr>

<h2>🌍 Ejemplo de la vida real</h2>

<p>
Imagina que un profesor necesita pasar lista a 30 estudiantes.
</p>

<p>
Sin ciclos tendría que escribir la misma instrucción 30 veces.
</p>

<p>
Con un ciclo, la computadora repite automáticamente la acción hasta completar la lista.
</p>

<hr>

<h2>📚 Tipos de ciclos en Java</h2>

<ul>
<li>for</li>
<li>while</li>
<li>do-while</li>
</ul>

<hr>

<h1>1️⃣ Ciclo For</h1>

<p>
El ciclo <b>for</b> se utiliza cuando conocemos de antemano cuántas veces queremos repetir una acción.
</p>

<h3>Sintaxis</h3>

<pre>
<code>
for(inicializacion; condicion; incremento){
    instrucciones;
}
</code>
</pre>

<h3>Partes del ciclo</h3>

<ul>
<li><b>Inicialización:</b> crea la variable de control.</li>
<li><b>Condición:</b> determina cuándo termina el ciclo.</li>
<li><b>Incremento:</b> modifica la variable en cada repetición.</li>
</ul>

<hr>

<h3>Ejemplo</h3>

<pre>
<code>
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
</code>
</pre>

<h3>Explicación paso a paso</h3>

<ul>
<li>La variable i comienza en 1.</li>
<li>Se verifica si i es menor o igual a 5.</li>
<li>Se muestra el valor.</li>
<li>Se incrementa en 1.</li>
<li>El proceso se repite.</li>
</ul>

<h3>Resultado</h3>

<pre>
1
2
3
4
5
</pre>

<hr>

<h1>2️⃣ Ciclo While</h1>

<p>
El ciclo while se utiliza cuando no sabemos exactamente cuántas repeticiones se realizarán.
</p>

<h3>Sintaxis</h3>

<pre>
<code>
while(condicion){
    instrucciones;
}
</code>
</pre>

<h3>Ejemplo</h3>

<pre>
<code>
int i = 1;

while(i <= 5){
    System.out.println(i);
    i++;
}
</code>
</pre>

<h3>Resultado</h3>

<pre>
1
2
3
4
5
</pre>

<hr>

<h1>3️⃣ Ciclo Do While</h1>

<p>
La diferencia es que este ciclo ejecuta el bloque al menos una vez antes de comprobar la condición.
</p>

<h3>Sintaxis</h3>

<pre>
<code>
do{
   instrucciones;
}
while(condicion);
</code>
</pre>

<h3>Ejemplo</h3>

<pre>
<code>
int i = 1;

do{
    System.out.println(i);
    i++;
}
while(i <= 5);
</code>
</pre>

<hr>

<h2>🎯 Ejercicio Propuesto</h2>

<p>
Crear un programa que muestre los números del 1 al 10 utilizando un ciclo for.
</p>

<h2>✅ Solución</h2>

<pre>
<code>
public class Ciclos {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            System.out.println(i);

        }

    }
}
</code>
</pre>

<hr>

<h2>💻 Código Fuente</h2>

<p>
<a href="ciclos/Ciclos.java" target="_blank">
📄 Ver archivo Ciclos.java
</a>
</p>

<hr>

<h2>📝 Resumen</h2>

<p>
Los ciclos permiten repetir instrucciones automáticamente y son fundamentales en cualquier lenguaje de programación.
</p>

<ul>
<li>For → cuando conocemos el número de repeticiones.</li>
<li>While → cuando depende de una condición.</li>
<li>Do While → ejecuta al menos una vez.</li>
</ul>

<p>
Dominar los ciclos es esencial para resolver problemas de programación de manera eficiente.
</p>

<a href="index.html">🏠 Volver al Inicio</a>
