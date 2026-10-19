# Métodos Iterativos: Gauss-Seidel

## Método de Gauss-Seidel
Variante mejorada de Jacobi. A diferencia de Jacobi, **utiliza inmediatamente los valores recién calculados** dentro de la misma iteración (actualización *in-place*). Generalmente converge más rápido y requiere menos memoria, ya que no necesita un vector auxiliar.

**Fórmula:**
```
x_i^(k+1) = (b_i - Σ_{j<i} a_ij · x_j^(k+1) - Σ_{j>i} a_ij · x_j^(k)) / a_ii
```

**Criterio de parada:** se detiene cuando el error máximo absoluto entre dos iteraciones consecutivas (norma infinito) es menor que la tolerancia `tol`, o al alcanzar `maxIter` iteraciones.

---

## Jerarquía de paquetes

```
Unidad3y4/
├── Jacobi/
│   ├── DefMatriz.java      → Define A, b y x0 (datos del sistema)
│   ├── Jacobi.java         → Implementa el método de Jacobi + calcularError()
└── GaussSeidel/
    ├── GaussSeidel.java    → Implementa Gauss-Seidel (reutiliza Jacobi.calcularError)
    └── Main.java           → Ejecuta Gauss-Seidel (reutiliza DefMatriz de Jacobi)
```

> **Nota:** `GaussSeidel` depende del paquete `Jacobi` (importa `Jacobi` y `DefMatriz`), pero `Jacobi` **no** depende de `GaussSeidel`. El paquete `Jacobi` debe compilarse primero.

---

## Compilación y ejecución

Situarse en el directorio **padre** que contiene la carpeta `Unidad3y4/` (es decir, donde empieza la ruta del paquete).

### 1. Compilar Jacobi (primero, porque GaussSeidel lo necesita)
```
javac Unidad3y4/Jacobi/*.java
```

### 2. Compilar Gauss-Seidel
```
javac Unidad3y4/GaussSeidel/*.java
```

### 3. Ejecutar Gauss-Seidel
```
java Unidad3y4.GaussSeidel.Main
```

### Alternativa: compilar todo de una vez
```
javac Unidad3y4/Jacobi/*.java Unidad3y4/GaussSeidel/*.java
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