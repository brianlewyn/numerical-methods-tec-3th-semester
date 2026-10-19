# Métodos Iterativos: Jacobi

## Método de Jacobi
Método iterativo para resolver sistemas de ecuaciones lineales **Ax = b**. En cada iteración calcula el nuevo vector solución **completamente a partir del vector anterior**, es decir, no utiliza los valores recién calculados dentro de la misma iteración. Es fácil de paralelizar pero suele converger más lentamente.

**Fórmula:**
```
x_i^(k+1) = (b_i - Σ_{j≠i} a_ij · x_j^(k)) / a_ii
```

**Criterio de parada:** se detiene cuando el error máximo absoluto entre dos iteraciones consecutivas (norma infinito) es menor que la tolerancia `tol`, o al alcanzar `maxIter` iteraciones.

---

## Jerarquía de paquetes

```
Unidad3y4/
└── Jacobi/
    ├── DefMatriz.java      → Define A, b y x0 (datos del sistema)
    ├── Jacobi.java         → Implementa el método de Jacobi
    └── Main.java           → Ejecuta Jacobi
```

---

## Compilación y ejecución

Situarse en el directorio **padre** que contiene la carpeta `Unidad3y4/` (es decir, donde empieza la ruta del paquete).

### 1. Compilar Jacobi (primero, porque GaussSeidel lo necesita)
```bash
javac Unidad3y4/Jacobi/*.java
```

### 2. Ejecutar Jacobi
```bash
java Unidad3y4.Jacobi.Main
```

---

## Sistema de prueba (definido en `DefMatriz`)

```
A = | 5  1  1 |      b = | 7 |
    | 1  4  1 |          | 6 |
    | 1  2  5 |          | 8 |

x0 = [0, 0, 0]     tol = 1e-4     maxIter = 100
```

**Salida esperada (aproximada):** `x ≈ [1.0, 1.0, 1.0]` — el sistema es diagonalmente dominante, por lo que el método converge.