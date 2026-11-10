# 🗺️ Plan Maestro de Capacitación en Ingeniería de Software

Este documento unifica la visión de carrera, las bases metodológicas, el programa de la **Fase 1 (Primeros 4 Meses)** y el mapeo completo de la **Fase 2 (Hacia dónde apunto a largo plazo)**. Está diseñado para ser el contexto absoluto para el estudiante y sus tutores de IA (DeepSeek y Gemini).

---

## 👁️ Visión de Carrera y Filosofía del Estudiante
- **Enfoque Técnico:** Desarrollador con perfil hacia la Ingeniería de Software (*Software Engineer*). Robustez en el modelado de datos, diseño de APIs seguras y dominio del núcleo de Kotlin con miras a la soberanía Multiplataforma (KMP), manteniendo a Rust y Zig en el horizonte ideal a largo plazo.
- **Ecosistema de Trabajo:** Máquina local (macOS/Unix), Git y Terminal como base cotidiana.

---

## 🛠️ Reglas de Juego para la IA (Directrices Socráticas y Uso de Agentes)
1. **Método Socrático con DeepSeek (Tutor de Lógica):** Prohibido pedirle soluciones directas de código de lógica. Ante un error de compilación, se le provee el *stack trace*. DeepSeek debe explicar el porqué del error y hacer preguntas guía para que el estudiante lo resuelva de forma empírica.
2. **Uso de Gemini en el IDE (Copiloto de Sintaxis y Entorno):** Se permite su uso para consultar sintaxis rápida o destrabar fricciones de configuración de herramientas (Postgres, terminal, etc.). **El código de la lógica de negocio se tipea línea por línea**, prohibido el autocompletado de bloques lógicos enteros.
   - <!-- AJUSTE --> **Regla de auditoría:** Si Gemini sugiere un bloque de más de 3 líneas de lógica, el estudiante debe reescribirlo a mano en un archivo aparte antes de pegarlo. La regla solo cuenta si es verificable.
3. **Delegación Estratégica en Agentes (El Rol de Mánager):** El estudiante se enfocará en la **teoría y diseño**. Se permite usar agentes autónomos de IA para generar el código repetitivo (*boilerplate*) de las pantallas en Compose y escribir la estructura de los tests unitarios, habiendo el estudiante diseñado previamente los escenarios y casos extremos (*edge cases*).
4. **Simulacro Offline (Viernes de Soberanía):** Los viernes a la tarde se estudia con el Wi-Fi apagado. Solo el estudiante, su compilador y su conocimiento local, para romper la dependencia de la IA.
5. **Freno de Mano Anti-Burnout (Regla de los 45 minutos):** Si el estudiante pasa 45 minutos trabado en un bug sin avanzar y empieza a castigarse, **cierra la notebook**. Anota el error en `estado.md` y se retira. El cerebro procesará el problema en segundo plano.

---

## 📅 Fase 1: El Plan de Choque (Primeros 4 Meses)
* **Meta Laboral:** Desarrollar habilidades listas para el mercado laboral junior de Backend/Fullstack Kotlin en Argentina/Exterior, destacando en el uso estratégico de IA y diseño de arquitectura.
* **Dedicación:** 15 horas semanales (3 horas al día, 5 días a la semana). Días libres flexibles para descanso mental.
* **Lenguaje Exclusivo:** **Kotlin** (Aprovechando la JVM y compilación nativa a futuro).
* **Proyecto Conductor:** *GymSaaS* — Sistema de asignación de turnos e ingresos Multi-Tenant (Multi-inquilino) para múltiples gimnasios, parametrizable según las reglas de cada administrador (Caja manual, deudores y caída automática de turnos).

### Ejes de la Fase 1 (Cronograma Semana a Semana):

#### 🟦 MES 1: El Núcleo de Kotlin y la Primera Interfaz (Slices 1 y 2)
- **Semana 1: Configuración e Inmutabilidad.** Setup del entorno (JDK, IntelliJ). Variables `val` vs `var`. Primer "Hola Mundo" y comandos básicos de Git por terminal (init, commit, branch).
- **Semana 2: Estructuras de Control y POO Limpia.** Modelado de entidades de *GymSaaS* (`Usuario`, `Gimnasio`, `Turno`) en memoria. Estructuras `when`, `if` como expresiones y Null Safety.
- **Semana 3: El Primer Botón (Compose Desktop) y Accesibilidad Semántica.**
  - <!-- AJUSTE --> **Objetivo mínimo viable (MVP):** ventana simple con un botón que, al presionarlo, liste los usuarios de la memoria. Compose Desktop básico.
  - <!-- AJUSTE --> **Objetivo stretch (si el tiempo lo permite):** implementación de propiedades semánticas (`contentDescription`), semántica estructural y orden de foco por teclado. Si la semana se va a 10 horas, la accesibilidad se inyecta en la Semana 4 sobre una UI que ya funciona.
  - Se permite usar la IA para acelerar el maquetado visual brutalista.
- **Semana 4: Colecciones y Lógica en la UI.** Funciones de orden superior (`map`, `filter`). Crear una interfaz gráfica rústica (lista y formulario) para agregar y ver gimnasios en tiempo real. <!-- AJUSTE --> **Aquí se completa la accesibilidad semántica** que no se haya alcanzado en la Semana 3.

#### 🟪 MES 2: Persistencia, SQL Estándar y Arquitectura Multi-Tenant (Slice 3)
- **Semana 5: SQL Estándar y Modelado.** Instalación de PostgreSQL. Comandos estándar (`SELECT`, `JOIN`, `INSERT`). Diseñar las tablas de *GymSaaS* asegurando el aislamiento por ID de gimnasio.
- **Semana 6: Persistencia desde Kotlin (JDBC/Exposed).** Conectar la base de datos con Kotlin usando SQL limpio. Mitigación absoluta de inyecciones SQL (*Prepared Statements*).
- **Semana 7: Reglas de Negocio Multi-Tenant.** Implementar la lógica: leer la configuración de cada gimnasio (ej. tiempos de cancelación) y evaluar si un usuario puede o no operar.
- **Semana 8: Conexión e Ingeniería de Prompts.**
  - <!-- AJUSTE --> **Regla arquitectónica clave:** la UI **no habla directamente con la base de datos**. La UI habla con una capa de repositorio en Kotlin (`interface GymRepository`) que a su vez habla con Exposed/JDBC. Esto prepara el terreno para reemplazar la implementación por llamadas HTTP en el Mes 3 sin tocar la UI (patrón Repository + Inversión de Dependencias, sin decirlo todavía).
  - Usar agentes de IA para hacer un *Code Review* del sistema buscando fallas de redundancia o memoria.

#### 🟩 MES 3: Arquitectura de Servidor (APIs) y Autenticación (Slice 4)
- **Semana 9: Introducción a Ktor.** Crear un servidor web básico. Entender el protocolo HTTP, métodos (GET, POST, PUT, DELETE) y códigos de estado.
- **Semana 10: Diseño de la API RESTful.** Crear los endpoints de *GymSaaS* (ej: `/api/v1/gyms`, `/api/v1/turns`). Serialización de datos en formato JSON de manera eficiente.
- **Semana 11: Seguridad Básica y JWT.** Implementar contraseñas seguras (hasheadas con BCrypt) y manejo de tokens JWT simples para que un usuario solo acceda a los datos de su gimnasio.
- **Semana 12: La UI como Cliente Independiente.**
  - <!-- AJUSTE --> **Semana de un solo objetivo:** refactor de transporte. Crear `HttpGymRepository : GymRepository` que consume la API de Ktor. La UI no cambia una línea de lógica; solo se reemplaza la implementación del repositorio al arrancar la app.
  - **No introducir conceptos nuevos esta semana.** Es una semana de refactor, no de aprendizaje teórico.

#### 🟨 MES 4: Diseño de QA con Agentes, Robustez de Caja y Despliegue Real
- **Semana 13: Diseño de QA Avanzado y Agentes.** Estudio teórico de Testing Unitario y Edge Cases. Diseñar la matriz de pruebas para blindar las reglas del gimnasio. Usar agentes de IA para que escriban el código de los archivos de prueba en JUnit/MockK basados en tu diseño.
- **Semana 14: Lógica de Caja y Penalizaciones.** Desarrollar la función del administrador para marcar deudores. Escribir los tests y el código para que, al marcar un usuario en mora, el backend dé de baja automáticamente todos sus turnos futuros.
- **Semana 15: Refactor, Deuda Técnica y Documentación.**
  - <!-- AJUSTE --> **Contenido reemplazado.** En lugar de profiling JVM (que se mueve a Fase 2), esta semana se dedica a: limpiar el código de los 3 meses, aplicar nombres claros, extraer funciones, revisar el `estado.md` completo, escribir un `README.md` decente del proyecto con instrucciones de instalación y arquitectura. Esto es lo que un reclutador junior valora más que saber qué es `@JvmInline`.
- **Semana 16: El Gran Despliegue (Deploy).** Subir el Backend de Ktor y la base de datos PostgreSQL a un servicio en la nube (Railway o Render). Probar la aplicación conectándose al servidor remoto en internet. El portafolio está listo para ser mostrado al mercado.

---

## 🚀 Fase 2: Hoja de Ruta Expandida (Hacia dónde apunto)

> **Nota:** Este mapa representa mi horizonte técnico a largo plazo. Está sujeto a adaptaciones según las oportunidades del mercado laboral, manteniendo siempre el foco en la Ingeniería de Software.
> 
> 
Este es el mapa total basado en los intereses del estudiante seleccionados de *roadmap.sh*. La Fase 1 dejará los cimientos listos para profundizar en estos pilares:

<!-- AJUSTE --> **Orden sugerido por empleabilidad y dependencias técnicas** (el orden original se mantiene como contenido, pero se reorganiza la secuencia):

### 1. Ingeniería de APIs y Arquitectura de Software (PRIORIDAD 1)
- **Diseño de APIs Modernas:** RESTful avanzado, GraphQL y gRPC para comunicación de alta velocidad.
- **Arquitectura de Software (Software Architect):** Patrones de diseño de software (SOLID, Clean Architecture, DDD), sistemas distribuidos y diseño de sistemas a gran escala (System Design Roadmap).
- **QA e Ingeniería de Pruebas (QA Engineer):** Pruebas unitarias robustas, pruebas de integración y automatización de pruebas para asegurar la resiliencia del software de manera automatizada y delegada.
- <!-- AJUSTE --> **Optimización de código (movida desde Fase 1, Semana 15):** Profiling básico de JVM, clases de valor/inline de Kotlin para aplanar objetos en memoria.

### 2. Infraestructura, Entorno y Seguridad (PRIORIDAD 2)
- **Linux a Fondo:** Administración de servidores, seguridad del sistema de archivos y redes.
- **Scripting y Automatización:** Dominio profundo de Bash, automatización de tareas de sistema y despliegue (DevOps básico).
- **Ciberseguridad (Cyber Security Expert):** Principios de autenticación segura, encriptación en tránsito/reposo, mitigación de ataques a servidores y protección de la infraestructura PyME.

### 3. Algoritmia y Ciencia de la Computación (PRIORIDAD 3)
- **Estructuras de Datos Avanzadas:** Grafos, árboles, tablas hash y manipulación de bytes en memoria.
- **Algoritmos:** Análisis de complejidad (Big O notation), ordenamiento, búsqueda y optimización matemática.
- **Diseño del Lenguaje:** Comprensión profunda de la orientación a objetos tradicional frente al aplanamiento de datos en memoria (Project Valhalla, Inline/Value Classes en Kotlin).
- <!-- AJUSTE --> **Nota estratégica:** este bloque se aprende mejor **en paralelo a proyectos reales**, no como bloque previo. Ideal para intercalar con las prioridades 1 y 2.

### 4. Rendimiento Extremo y Optimización Quirúrgica (PRIORIDAD 4)
- **Backend Performance:** Prácticas avanzadas de optimización de bases de datos, concurrencia (Corrutinas de Kotlin en profundidad), perfiles de memoria (profiling), balanceo de carga y sistemas de caché (Redis).
- **Frontend Performance:** Optimización de renderizado en tiempo real, WebAssembly (Wasm) y reducción de latencia en la UI.
- **Segundo Lenguaje (Rendimiento del 1%):** **Rust** como herramienta de bajo nivel absoluto para desarrollo de herramientas de sistema, sistemas embebidos y optimizaciones críticas donde la JVM no sea suficiente. (Y exploración futura de Zig para control quirúrgico del procesador).

### 5. Proyectos Avanzados e Ideas de Producto (PRIORIDAD 5 — Recompensa y Portfolio)
- **Editor de Markdown Ultra-Ligero:** Enfoque en eficiencia de renderizado dual asincrónico (evitando la fatiga visual del usuario al escribir y ver la pantalla simultáneamente).
- **Procesador de Audio en Front-end con IA:** Separación de canales de audio (voz principal, notas) procesado localmente en el dispositivo utilizando Rust/Wasm/KMP, transformando señales de audio a partituras en tiempo real sin saturar el servidor.

---

## 📚 Biblioteca Offline (Nutrición Mental sin Pantallas)

### 💻 Eje Técnico de Bajo Nivel (Para cuando hay energía mental alta)
- *Organización de Computadoras* – Andrew S. Tanenbaum. (Para entender el procesador, la memoria caché y los bytes).
- *Sistemas Operativos Modernos* – Andrew S. Tanenbaum. (Para entender cómo el software administra los recursos del hardware).

### 🧘 Eje de Foco y Humanidades (Para leer con un mate en el sillón)
- *Minimalismo Digital* – Cal Newport. (Estratégico para blindar la atención contra la arborización y el hipervínculo destructivo).
- *Las venas abiertas de América Latina* – Eduardo Galeano. (Para alimentar la visión de soberanía, identidad y desarrollo de soluciones locales frente a los monopolios).

---

## 🤖 Directrices de Rol para las IA (Gemini y DeepSeek)

*Aviso general para la IA:* Estoy utilizando un sistema dual de aprendizaje. Voy a interactuar en paralelo con Gemini y con DeepSeek, manteniendo sincronizado el avance mediante este archivo de estado. No asumas que conozco el contexto de las charlas que tengo en la otra plataforma; guíate estrictamente por este documento.

### 🧠 Instrucciones específicas para DEEPSEEK (Mi Tutor de Laboratorio)
1. **Tu Rol:** Sos mi profesor estricto de ingeniería, lógica y código.
2. **Tu Estilo:** Explotá tu capacidad de razonamiento profundo. Desglosá los problemas de bajo nivel, la gestión de memoria y la optimización paso a paso.
3. **Restricción:** Aplicá el método socrático. Si mi código falla, no me des la solución. Explicame el error de compilación (Stack Trace) y haceme preguntas para que yo descubra cómo arreglarlo.

### 🎨 Instrucciones específicas para GEMINI (Mi Colega de Banco y Conceptos)
1. **Tu Rol:** Sos mi compañero de estudio avanzado, mi puente conceptual y mi validador de documentación.
2. **Tu Estilo:** Mantené tu tono humano, ameno, empático y cercano. Cuando acuda a vos para destrabar un concepto complejo que vi con DeepSeek, bajalo a tierra.
3. **Tu Tarea:** Traducí la teoría abstracta usando analogías del mundo del arte, el deporte o la vida cotidiana. Ayudame a buscar bibliografía formal y documentación oficial actualizada en la web para profundizar mis conocimientos sin mirar tanto la pantalla.

---

## 📄 Plantilla para el Archivo de Sincronización: `estado.md`
*(Para mantener informados a DeepSeek y Gemini al inicio de cada sesión)*

```markdown
# 🔄 Estado de Capacitación de Kotlin / Sistemas

## 🗓️ Contexto Actual
- **Semana:** Semana 1 (Introducción y Primeros Pasos en Consola)
- **Proyecto Conductor:** Inicialización del repositorio y esqueleto del gestor en consola.
- **Conceptos Clave del Día:** Tipos primitivos, flujo de control básico, inicialización de Git.

## 📌 Progreso y Tareas
- [ ] Configurar el entorno de desarrollo local (JDK, IntelliJ/Terminal).
- [ ] Crear el primer programa "Hola Mundo" en Kotlin usando solo la terminal.
- [ ] Hacer el primer Commit y Push a un repositorio privado de GitHub.
- [ ] Definir las variables iniciales para almacenar los datos del gimnasio de prueba en memoria.

## 🛠️ Bloqueos / Últimos Errores
- Ninguno por el momento. Listo para arrancar el método socrático.

## 🧠 Concepto que NO entendí del todo (para repasar offline)
- 

## 📝 Decisión técnica que tomé esta semana (y por qué)
- 

## 🎯 Próximo Paso Técnico
- Inicializar la rama de desarrollo y estructurar el paquete de entidades principales del gimnasio.
