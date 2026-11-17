# 🔄 Estado de Capacitación de Kotlin / Sistemas

## 🗓️ Contexto Actual
- **Semana:** Semana 2 (Día 1)
- **Proyecto Conductor:** Introducción a POO. Modelado de la entidad `Usuario` como `data class`.
- **Conceptos Clave de Hoy:** Clase vs Objeto, `data class`, inmutabilidad de la identidad y mutabilidad del estado.

## 📌 Progreso y Tareas
- [x] Completar Semana 1 (Variables, Lógica, Null Safety y Desafío de Soberanía).
- [x] Crear y comprender el uso de `data class` (entidad Usuario).
- [x] Instanciar objetos y acceder a sus propiedades.
- [ ] Completar el modelado de las entidades `Gimnasio` y `Turno`.

## 🛠️ Bloqueos / Últimos Errores
- Ninguno. El entorno y el flujo de Git están funcionando correctamente.

## 🧠 Concepto que NO entendí del todo (para repasar offline)
- 

## 📝 Decisión técnica que tomé esta semana (y por qué)
- **Usar `data class` para las entidades:** Porque generan automáticamente métodos útiles como `toString()` y `equals()`.
- **Inmutabilidad de la identidad:** El `id`, `nombre` y `edad` son `val` porque no cambian durante la vida del objeto. El `saldo` es `var` porque es un estado dinámico que se modifica con el uso.

## 🎯 Próximo Paso Técnico
- Agregar funcionalidad (métodos) a la clase `Usuario` y crear la entidad `Gimnasio`.