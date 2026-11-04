# InterpolacionNewton - Diferencias Divididas de Newton

## Descripción General

Este proyecto implementa el **método de interpolación de Newton por diferencias divididas** en Java. Dado un conjunto de puntos \((x_i, y_i)\), el programa construye la tabla de diferencias divididas, extrae los coeficientes \(a_k\) del polinomio interpolador de Newton y evalúa dicho polinomio en un valor de \(x\) especificado, devolviendo el valor estimado \(P(x)\).

El proyecto forma parte de la **Unidad 5** del curso y se organiza en dos clases principales:

- `InterpolacionNewton.java`: contiene la lógica del método (construcción de la tabla de diferencias divididas, obtención de los coeficientes y evaluación del polinomio).
- `Main.java`: punto de entrada que define los puntos de ejemplo, invoca el cálculo e imprime la tabla, los coeficientes y el resultado.

---

## Estructura de carpetas

El proyecto se sitúa la siguiente ruta del proyecto `./Unidad5/InterpolacionNewton``:

```sh
InterpolacionNewton/
├── InterpolacionNewton.java
├── Main.java
└── README.md
```

---

## Compilación y ejecución

El proyecto usa la versión `java 27 2026-09-15`.

Situarse en el directorio **padre** que contiene la carpeta `./Unidad5/InterpolacionNewton``.

### 1. Compilar InterpolacionNewton`
```
javac Unidad5/InterpolacionNewton`/*.java
```

### 2. Ejecutar InterpolacionNewton`
```
java Unidad5.InterpolacionNewton`.Main
```

### 3. Resultado de la ejecución
```
--- TABLA DE DIFERENCIAS DIVIDIDAS ---
x_i     f[x_i]  Orden 1 Orden 2
-----------------------------------------------------
1.00    2.0000  1.0000  0.8333
2.00    3.0000  3.5000
4.00    10.0000

--- COEFICIENTES DEL POLINOMIO (a_k) ---
a_0 = 2.0000
a_1 = 1.0000
a_2 = 0.8333

--- RESULTADO DE LA INTERPOLACIÓN ---
El valor estimado en x = 3.00 es P(3.00) = 5.6667
```