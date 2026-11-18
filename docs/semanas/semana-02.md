# 📅 Semana 02 — Estructuras de Control y POO Limpia

**Fechas:** 16/11 al 20/11
**Mes:** 1 (El Núcleo de Kotlin y la Primera Interfaz)
**Dedicación planificada:** 15 horas

---

## 🎯 Objetivo de la semana
Comprender los fundamentos de la Programación Orientada a Objetos (POO). Modelar las entidades principales de GymSaaS (`Usuario`, `Gimnasio`, `Turno`) en memoria, aplicando `data class`, inmutabilidad y encapsulamiento básico.

---

## 🧠 Conceptos a dominar
- [ ] Diferencia entre Clase (plantilla) y Objeto (instancia).
- [ ] Creación de `data class`.
- [ ] Propiedades inmutables (`val`) vs mutables (`var`) en entidades.
- [ ] Acceso a propiedades mediante el operador punto (`.`).
- [ ] El método `toString()` generado automáticamente por las `data class`.
- [ ] Métodos y funciones dentro de una clase.

---

## ✅ Tareas concretas
- [ ] Crear la `data class` `Usuario` en el Playground.
- [ ] Instanciar un objeto de tipo `Usuario` y acceder a sus propiedades.
- [ ] Crear la `data class` `Gimnasio` y `Turno`.
- [ ] Implementar lógica de negocio usando objetos (ej: calcular saldo, verificar acceso).
- [ ] Hacer el commit de fin de semana.

---

## 📓 Diario de la semana
- **Día 1:** Entendí la diferencia entre `class` y `data class`. Creé la entidad `Usuario` con `id`, `nombre` y `saldo` (mutable). Creé la clase `Gimnasio` con el método `reservarTurno(usuario: Usuario)`. Entendí que los métodos pueden interactuar con otras clases. Decidimos implementar un nuevo esquema de estudio (Teoría pura -> Práctica aplicada -> Práctica libre).

---

## 🛠️ Bloqueos / Errores
| Fecha | Error / Bloqueo | ¿Se resolvió? | Cómo |
|-------|-----------------|---------------|------|
|       |                 |               |      |

---

## 🧠 Concepto que NO entendí del todo (para repasar offline)
- 

## 📝 Decisión técnica que tomé esta semana (y por qué)
- 

## 🎯 Próximo paso técnico
- Modelar `Gimnasio` y `Turno`, y empezar a usar objetos dentro de otros objetos (relaciones).
- Teoría de funciones (retornos, parámetros, extensiones) y su aplicación en las entidades de GymSaaS.