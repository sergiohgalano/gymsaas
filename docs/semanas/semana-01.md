# 📅 Semana 01 — Configuración e Inmutabilidad

**Fechas:** 09/11 al 13/11
**Mes:** 1 (El Núcleo de Kotlin y la Primera Interfaz)
**Dedicación planificada:** 15 horas

---

## 🎯 Objetivo de la semana
Configurar el entorno de desarrollo, entender la diferencia entre `val` y `var`, escribir el primer programa en Kotlin y hacer el primer commit a GitHub. Al final de la semana debo poder explicar **por qué Kotlin prioriza la inmutabilidad** y tener el repo `gymsaas` inicializado.

---

## 🧠 Conceptos a dominar
- [x] JDK, JVM y por qué Kotlin corre sobre la JVM.
- [x] `val` vs `var` — inmutabilidad y sus implicancias.
- [x] Tipos primitivos y tipos por referencia en Kotlin.
- [x] Flujo de control básico (`if`, `when` como expresión).
- [x] `main()` y estructura de un archivo `.kt`.
- [x] Git por terminal: `init`, `status`, `add`, `commit`, `log`, `push`.
- [x] Qué es un `README.md` y por qué importa.

---

## ✅ Tareas concretas
- [x] Instalar JDK 25 y verificar con `java -version` en terminal.
- [x] Instalar IntelliJ IDEA Community y crear un proyecto Kotlin vacío.
- [x] Crear el repo privado `gymsaas` en GitHub.
- [x] `git init` local + conectar con remoto.
- [x] Escribir `Main.kt` con `println("GymSaaS — Semana 1")`.
- [x] Primer commit: `"chore: initial setup with Kotlin main file"`.
- [x] Escribir `README.md` con la presentación del proyecto.
- [x] Copiar `plan-maestro.md` y `estado.md` a `docs/`.

---

## 📓 Diario de la semana
- **Día 1:** Configuración exitosa. Peleé con Vim y los tokens de GitHub, pero logré subir todo el proyecto y el README. Entendí cómo funciona el flujo básico de Git por consola.
- **Día 2:** Práctica de variables y tipos de datos en el Playground. Entendí a fondo la diferencia entre Stack y Heap, cómo funciona la JVM y los Hilos Virtuales (¡y charlamos de Rust!). 
- **Día 3:** Aprendí estructuras de control (if, when), operadores lógicos y Null Safety. El compilador me salvó de un NullPointerException antes de ejecutar, demostrando la robustez de Kotlin.

---

## 🛠️ Bloqueos / Errores
| Fecha | Error / Bloqueo | ¿Se resolvió? | Cómo |
|-------|-----------------|---------------|------|
| 09/11 | IntelliJ no reconocía la versión de Kotlin con JDK 25. | Sí | Se actualizó la versión de Kotlin a la 2.3.0 en el `build.gradle.kts`. |
| 09/11 | Conflicto de ramas `master` (local) y `main` (remoto). | Sí | Se renombró la rama local con `git branch -M main` y se hizo un merge con `--allow-unrelated-histories`. |
| 09/11 | La terminal se quedó trabada en el editor Vim. | Sí | Se cerró la pestaña de la terminal y se usó `git merge --abort` para cancelar la fusión. |

---

## 🧠 Concepto que NO entendí del todo (para repasar offline)
- 

## 📝 Decisión técnica que tomé esta semana (y por qué)
- **Usar la consola para Git:** Para ganar control real sobre los commits (evitando el `git add .` ciego) y prepararme para entornos Linux del mundo laboral.
- **Actualizar a OpenJDK 25:** Porque es LTS y estable, forzando la actualización a Kotlin 2.x.
- **Ignorar carpeta `.idea/`:** Para mantener el repositorio limpio de configuraciones locales de la máquina.

---

## 🎯 Próximo paso técnico
- - Introducción a POO: Clases y Objetos (Usuario, Gimnasio, Turno).