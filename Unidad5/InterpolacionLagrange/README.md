# InterpolacionLagrange - Interpolación de Lagrange

## Descripción General

Este proyecto implementa el **método de interpolación de Lagrange** en Java. Dado un conjunto de puntos \((x_i, y_i)\), el programa construye el polinomio interpolador de Lagrange y evalúa dicho polinomio en un valor de \(x\) especificado, devolviendo el valor estimado \(P(x)\).

El proyecto forma parte de la **Unidad 5** del curso y se organiza en dos clases principales:

- `InterpolacionLagrange.java`: contiene la lógica del método (cálculo de los polinomios base \(L_i(x)\) y evaluación del polinomio interpolador).
- `Main.java`: punto de entrada que define los puntos de ejemplo, invoca el cálculo e imprime el resultado.

---

## Estructura de carpetas

El proyecto se sitúa en la siguiente ruta del proyecto `./Unidad5/InterpolacionLagrange`:

```sh
InterpolacionLagrange/
├── InterpolacionLagrange.java
├── Main.java
└── README.md
```

---

## Compilación y ejecución

El proyecto usa la versión `java 27 2026-09-15`.

Situarse en el directorio **padre** que contiene la carpeta `./Unidad5/InterpolacionLagrange`.

### 1. Compilar InterpolacionLagrange
```
javac Unidad5/InterpolacionLagrange/*.java
```

### 2. Ejecutar InterpolacionLagrange
```
java Unidad5.InterpolacionLagrange.Main
```

### 3. Resultado de la ejecución
```
--- RESULTADO DE LA INTERPOLACIÓN ---
El valor estimado en x = 3.00 es P(3.00) = 5.6667
```