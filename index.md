<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Tutorial Java - GitHub Pages</title>

<style>
body{
    margin:0;
    font-family:Arial;
    background:linear-gradient(135deg,#141e30,#243b55);
    color:white;
}

header{
    text-align:center;
    padding:20px;
}

.menu{
    display:flex;
    flex-wrap:wrap;
    justify-content:center;
    gap:10px;
    padding:10px;
}

.menu button{
    padding:10px;
    border:none;
    border-radius:8px;
    cursor:pointer;
    font-weight:bold;
    color:white;
}

.c1{background:#ff6b6b;}
.c2{background:#6c5ce7;}
.c3{background:#00b894;}
.c4{background:#fdcb6e;}
.c5{background:#0984e3;}

.seccion{
    display:none;
    background:white;
    color:black;
    width:85%;
    margin:15px auto;
    padding:20px;
    border-radius:10px;
}

.activa{display:block;}

a{
    color:blue;
}
</style>
</head>

<body>

<header>
<h1>💻 Tutorial de Programación en Java</h1>
<p>GitHub Pages - Proyecto educativo</p>
</header>

<div class="menu">
<button class="c1" onclick="mostrar('inicio')">Inicio</button>
<button class="c2" onclick="mostrar('ciclos')">Ciclos</button>
<button class="c3" onclick="mostrar('metodos')">Métodos</button>
<button class="c4" onclick="mostrar('estructuras')">Estructuras</button>
<button class="c5" onclick="mostrar('archivos')">Archivos</button>
</div>

<!-- INICIO -->
<div id="inicio" class="seccion activa">
<h2>📌 Introducción</h2>
<p>Este tutorial enseña los fundamentos de Java con ejemplos y ejercicios.</p>
</div>

<!-- CICLOS -->
<div id="ciclos" class="seccion">
<h2>🔄 Ciclos</h2>

<pre>
for(int i=1;i<=10;i++){
    System.out.println(i);
}
</pre>

<p>🔗 Código:</p>
<a href="https://github.com/TUUSUARIO/tutorial-java/blob/main/ciclos/Ciclos.java" target="_blank">
Ver Ciclos en GitHub
</a>
</div>

<!-- MÉTODOS -->
<div id="metodos" class="seccion">
<h2>⚙️ Métodos</h2>

<pre>
public static void saludar(){
    System.out.println("Hola");
}
</pre>

<a href="https://github.com/TUUSUARIO/tutorial-java/blob/main/metodos/Metodos.java" target="_blank">
Ver Métodos en GitHub
</a>
</div>

<!-- ESTRUCTURAS -->
<div id="estructuras" class="seccion">
<h2>📊 Listas y Matrices</h2>

<pre>
ArrayList<String> lista = new ArrayList<>();
</pre>

<pre>
int[][] matriz = {{1,2},{3,4}};
</pre>

<a href="https://github.com/TUUSUARIO/tutorial-java/blob/main/listas/Listas.java" target="_blank">
Listas
</a>
<br>
<a href="https://github.com/TUUSUARIO/tutorial-java/blob/main/matrices/Matrices.java" target="_blank">
Matrices
</a>
</div>

<!-- ARCHIVOS -->
<div id="archivos" class="seccion">
<h2>📁 Manejo de Archivos</h2>

<pre>
File archivo = new File("datos.txt");
</pre>

<a href="https://github.com/TUUSUARIO/tutorial-java/blob/main/archivos/Archivos.java" target="_blank">
Ver Archivos en GitHub
</a>
</div>

<script>
function mostrar(id){
    document.querySelectorAll('.seccion').forEach(s=>s.classList.remove('activa'));
    document.getElementById(id).classList.add('activa');
}
</script>

</body>
</html>
