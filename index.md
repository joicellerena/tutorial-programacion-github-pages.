<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Proyecto Java - Tutorial</title>

<style>
body{
    margin:0;
    font-family:Arial;
    background:linear-gradient(135deg,#141e30,#243b55);
    color:white;
}

/* HEADER */
header{
    text-align:center;
    padding:25px;
}

header h1{
    margin:0;
}

/* BOTONES */
.menu{
    display:flex;
    flex-wrap:wrap;
    justify-content:center;
    gap:10px;
    padding:10px;
}

.menu button{
    padding:10px 15px;
    border:none;
    border-radius:8px;
    cursor:pointer;
    font-weight:bold;
    color:white;
    transition:0.3s;
}

.menu button:hover{
    transform:scale(1.05);
}

.c1{background:#ff6b6b;}
.c2{background:#6c5ce7;}
.c3{background:#00b894;}
.c4{background:#fdcb6e;}
.c5{background:#0984e3;}

/* SECCIONES */
.seccion{
    display:none;
    background:white;
    color:black;
    width:85%;
    margin:15px auto;
    padding:20px;
    border-radius:12px;
    box-shadow:0 5px 15px rgba(0,0,0,0.3);
}

h2{
    color:#222;
}

code{
    display:block;
    background:#eee;
    padding:10px;
    border-radius:8px;
}

/* FOOTER */
footer{
    text-align:center;
    padding:15px;
}
</style>
</head>

<body>

<header>
<h1>💻 Proyecto: Tutorial de Java</h1>
<p>Página educativa interactiva</p>
</header>

<div class="menu">
<button class="c1" onclick="mostrar('inicio')">Inicio</button>
<button class="c2" onclick="mostrar('ciclos')">Ciclos</button>
<button class="c3" onclick="mostrar('metodos')">Métodos</button>
<button class="c4" onclick="mostrar('estructuras')">Vectores y Listas</button>
<button class="c5" onclick="mostrar('conclusion')">Conclusión</button>
</div>

<!-- INICIO -->
<div id="inicio" class="seccion" style="display:block;">
<h2>📌 Introducción</h2>
<p>
Este proyecto es un tutorial interactivo sobre programación en Java.
Su objetivo es aprender los conceptos básicos de forma sencilla y práctica.
</p>

<h3>💡 ¿Qué pensamos?</h3>
<p>
Pensamos que Java es un lenguaje importante porque ayuda a crear programas, aplicaciones y sistemas.
</p>
</div>

<!-- CICLOS -->
<div id="ciclos" class="seccion">
<h2>🔄 Ciclos</h2>

<p><b>¿Para qué sirve?</b></p>
<p>Sirve para repetir instrucciones varias veces sin escribir mucho código.</p>

<p><b>¿Cómo funciona?</b></p>
<p>Ejecuta un bloque de código mientras se cumpla una condición.</p>

<h3>Ejemplo:</h3>
<code>
for(int i=1;i<=5;i++){
    System.out.println(i);
}
</code>

<h3>📝 Ejercicio:</h3>
<p>Imprime los números del 1 al 10.</p>
</div>

<!-- METODOS -->
<div id="metodos" class="seccion">
<h2>⚙️ Métodos</h2>

<p><b>¿Para qué sirve?</b></p>
<p>Para organizar el código y reutilizarlo.</p>

<p><b>¿Cómo funciona?</b></p>
<p>Es un bloque que se puede llamar cuando se necesite.</p>

<h3>Ejemplo:</h3>
<code>
public static void saludar(){
    System.out.println("Hola");
}
</code>

<h3>📝 Ejercicio:</h3>
<p>Crea un método que imprima tu nombre.</p>
</div>

<!-- VECTORES Y LISTAS -->
<div id="estructuras" class="seccion">
<h2>📊 Vectores y 📋 Listas</h2>

<p><b>Vectores:</b> almacenan datos fijos.</p>
<code>
int[] v = {1,2,3};
</code>

<p><b>Listas:</b> almacenan datos dinámicos.</p>
<code>
ArrayList<String> lista = new ArrayList<>();
lista.add("Hola");
</code>

<h3>📝 Ejercicio:</h3>
<p>Crea una lista con 3 nombres.</p>
</div>

<!-- CONCLUSION -->
<div id="conclusion" class="seccion">
<h2>🏁 Conclusión</h2>

<p>
Java es un lenguaje muy útil para aprender programación porque permite crear programas organizados y potentes.
</p>

<p>
Este tutorial nos ayudó a entender mejor los ciclos, métodos y estructuras de datos.
</p>

<h3>✨ Reflexión final</h3>
<p>
La programación siempre tiene solución si practicas y sigues aprendiendo.
</p>
</div>

<footer>
<p>Joice Llerena - Proyecto Java</p>
</footer>

<script>
function mostrar(id){
    document.querySelectorAll('.seccion').forEach(s=>s.style.display='none');
    document.getElementById(id).style.display='block';
}
</script>

</body>
</html>
