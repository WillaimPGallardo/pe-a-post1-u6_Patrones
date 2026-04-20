Refactorización de un God Object aplicando SRP

Descripción general

Este proyecto implementa un proceso de refactorización de software en Java, cuyo objetivo es transformar un **antipatrón God Object** en una arquitectura modular basada en el **Principio de Responsabilidad Única (SRP)**. El sistema simula la gestión de una biblioteca, incluyendo administración de libros, socios, préstamos y reportes.

El desarrollo se realizó siguiendo un enfoque incremental, donde primero se implementó una clase monolítica con múltiples responsabilidades, y posteriormente se descompuso en componentes especializados, manteniendo la funcionalidad original del sistema.



Evidencia de ejecución

 Ejecución inicial (God Object)

El sistema permite:

* Registrar libros
* Registrar socios
* Realizar préstamos
* Generar reportes

Ejecución refactorizada

El sistema mantiene exactamente la misma funcionalidad, validando que la refactorización no altera el comportamiento.

Ejemplo de salida en consola:

```
Libro agregado: Clean Code
Libro agregado: Design Patterns
Socio registrado: Carlos
Prestamo realizado: Clean Code -> socio S01

=== REPORTE BIBLIOTECA ===
Libros registrados : 2
Libros disponibles : 1
Socios registrados : 1
Prestamos activos  : 1
==========================

Libro devuelto: Clean Code

=== REPORTE BIBLIOTECA ===
Libros registrados : 2
Libros disponibles : 2
Socios registrados : 1
Prestamos activos  : 0
==========================
```

<img width="1663" height="1022" alt="image" src="https://github.com/user-attachments/assets/3419714e-6784-4fca-9881-a8e1dba23aef" />


Proceso de desarrollo (commits)

El desarrollo se realizó en tres etapas principales:

1. Implementación del God Object
2. Introducción de clases de dominio
3. Refactorización aplicando SRP

Cada etapa fue registrada mediante commits descriptivos que permiten rastrear la evolución del sistema.



Conclusión

La refactorización permitió transformar un diseño monolítico en una arquitectura modular alineada con principios de ingeniería de software. La aplicación del SRP reduce la complejidad del sistema, mejora la mantenibilidad y facilita futuras extensiones.

Este ejercicio demuestra la importancia de identificar y corregir antipatrones de diseño, aplicando principios formales como los propuestos por Dijkstra y prácticas modernas de desarrollo desacoplado.
