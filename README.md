# 📚 GestorBiblioteca

## 📝 Descripción del sistema y problema a resolver

**GestorBiblioteca** es un sistema en Java que simula la gestión digital de libros. Permite agregar libros en distintos formatos (como PDF), recorrer la colección de forma ordenada y clonar libros existentes como si fueran nuevas ediciones.

### Problema a resolver:
En sistemas reales, los libros pueden estar almacenados en distintos formatos y ser accedidos por múltiples módulos. Se requiere una forma centralizada de gestionarlos, una estructura flexible que permita adaptarlos a una interfaz común, recorrerlos fácilmente y crear duplicados sin construirlos desde cero.

---

## 🧠 Justificación de los patrones de diseño aplicados

### 1. ✅ Singleton (Creacional)
- **¿Por qué?** Queremos un único punto de acceso a la lógica del sistema (gestor de libros).
- **¿Cómo?** A través de una clase `BibliotecaManager` con constructor privado y método `getInstance()`.
- **¿Dónde?** En la clase `BibliotecaManager`, que administra todos los libros y operaciones del sistema.

---

### 2. ✅ Adapter (Estructural)
- **¿Por qué?** Para reutilizar clases existentes o externas (como `PdfLibro`) que no implementan la interfaz común `Libro`.
- **¿Cómo?** Creando un `PdfAdapter` que implementa `Libro` y redirige las llamadas hacia un objeto `PdfLibro`.
- **¿Dónde?** En `PdfAdapter.java`, que permite tratar archivos PDF como libros compatibles.

---

### 3. ✅ Iterator (De comportamiento)
- **¿Por qué?** Para recorrer la colección de libros sin exponer detalles internos de la estructura de datos.
- **¿Cómo?** Utilizando el `for-each` de Java que usa el patrón `Iterator` implícitamente.
- **¿Dónde?** En el `Main.java`, al mostrar la lista de libros con un bucle `for (Libro libro : manager.getLibros())`.

---

### 4. ✅ Prototype (Libre elección)
- **¿Por qué?** Para clonar libros existentes sin crear una nueva instancia desde cero.
- **¿Cómo?** Implementando un método `clonar()` en `LibroConcreto`, que devuelve una copia del objeto con ligeras modificaciones.
- **¿Dónde?** En `LibroConcreto.java`, cuando se clona un libro adaptado para crear una nueva versión.

---

## 🛠️ Instrucciones de compilación y ejecución

### 🔹 Opción 1: Forma rápida (descargando el proyecto)
1. Descarga el proyecto completo desde el enlace proporcionado (archivo .zip o repositorio).
2. Abre NetBeans.
3. Ve a File > Open Project y selecciona la carpeta del proyecto (GestorBiblioteca).
4. Ejecuta el proyecto (F6 o clic derecho > Run).

### 🔹 Opción 2: Crear el proyecto manualmente
1. Abrir el proyecto en **NetBeans** (Java estándar).
2. Crear un nuevo proyecto: **Java > Java Application**.
3. Crear un paquete llamado `biblioteca`.
4. Agregar las siguientes clases dentro del paquete:
   - `Main.java`
   - `BibliotecaManager.java`
   - `Libro.java`
   - `PdfLibro.java`
   - `PdfAdapter.java`
   - `LibroConcreto.java`
5. Asegúrate de que el `main()` esté en `Main.java`.
6. Ejecutar el proyecto desde NetBeans (F6 o clic derecho > Run).


