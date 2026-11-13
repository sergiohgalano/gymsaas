# 🔄 Estado de Capacitación de Kotlin / Sistemas

## 🗓️ Contexto Actual
- **Semana:** Semana 1 (Viernes de Soberanía - Completado)
- **Proyecto Conductor:** Lógica de acceso a GymSaaS (interactiva por consola).
- **Conceptos Clave de Hoy:** Lectura por consola (`readln()`), conversión de tipos (`.toInt()`, `.toDouble()`), evaluación de Strings vacíos (`.isBlank()`), `when` sin variable y lógica de negocio.

## 📌 Progreso y Tareas
- [x] Configurar el entorno de desarrollo local (JDK 25, IntelliJ/Gradle).
- [x] Crear el primer programa "Hola Mundo" en Kotlin.
- [x] Hacer el primer Commit y Push a un repositorio de GitHub.
- [x] Definir las variables iniciales para almacenar los datos del gimnasio de prueba en memoria.
- [x] Practicar con tipos de datos y operadores aritméticos.
- [x] Implementar lógica condicional (`if`, `when`) y manejo de nulos (Null Safety).
- [x] Superar el desafío offline (Viernes de Soberanía) sin ayuda de la IA.

## 🛠️ Bloqueos / Últimos Errores
- El operador Elvis (`?:`) no es aplicable directamente a `readln()` porque este nunca devuelve `null`, sino un String vacío (`""`). Solucionado usando `if/else` (o `.ifBlank`).

## 🧠 Concepto que NO entendí del todo (para repasar offline)
- 

## 📝 Decisión técnica que tomé esta semana (y por qué)
- **Usar la consola para Git:** Para ganar control real sobre los commits y prepararme para entornos Linux.
- **Usar OpenJDK 25:** Porque es LTS, forzando la actualización a Kotlin 2.x.
- **Tipar explícitamente las variables (Long, Int, Byte):** Para mayor seguridad y eficiencia en el uso de memoria.
- **Uso de `when` sin variable:** Para evaluar múltiples condiciones de rechazo de forma más limpia que anidando múltiples `if/else`.

## 🎯 Próximo Paso Técnico
- Introducción a Programación Orientada a Objetos (POO): Creación de `data class` para modelar `Usuario`, `Gimnasio` y `Turno`.