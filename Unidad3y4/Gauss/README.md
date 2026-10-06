# Eliminación Gaussiana en Java

Implementación del método de Eliminación Gaussiana con sustitución regresiva para resolver sistemas de ecuaciones lineales de la forma `Ax = b`.

---

## Lenguaje de programación utilizado

- **Java** (versión 8 o superior recomendada).

El proyecto consta de tres archivos dentro del paquete `Unidad3y4.Gauss`:

| Archivo | Descripción |
|---------|-------------|
| `DefMatriz.java` | Define la matriz aumentada `[A \| b]` del sistema. |
| `Gauss.java` | Contiene los métodos de triangulación y sustitución regresiva. |
| `Main.java` | Punto de entrada que ejecuta el programa e imprime las soluciones. |

---

## Pasos para compilar y ejecutar el programa

### 1. Estructura de carpetas

Asegúrate de tener la siguiente estructura:

```
Unidad3y4/
└── Gauss/
    ├── DefMatriz.java
    ├── Gauss.java
    └── Main.java
```

### 2. Compilar

Desde la carpeta raíz (la que contiene a `Unidad3y4`), ejecuta:

```bash
javac Unidad3y4/Gauss/*.java
```

### 3. Ejecutar

Desde la misma carpeta raíz, ejecuta:

```bash
java Unidad3y4.Gauss.Main
```

También puedes compilar y ejecutar desde un IDE (Eclipse, IntelliJ IDEA, NetBeans) ejecutando la clase `Main`.

---

## Ejemplo de prueba y salida por consola

### Matriz de entrada

El programa usa por defecto la siguiente matriz aumentada definida en `DefMatriz.java`:

```
[ 3.0  -0.1  -0.2 |  7.85 ]
[ 0.1   7.0  -0.3 | -19.3 ]
[ 0.3  -0.2  10.0 |  71.4 ]
```

Que corresponde al sistema:

```
 3x₁ - 0.1x₂ - 0.2x₃ =  7.85
0.1x₁ +  7x₂  - 0.3x₃ = -19.3
0.3x₁ - 0.2x₂ +  10x₃ =  71.4
```

### Salida esperada en consola

```
Soluciones del sistema:
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
```

> Las soluciones son `x₁ = 3`, `x₂ = -2.5` y `x₃ = 7`. Diferencias mínimas en los decimales son normales por la precisión de punto flotante (`double`).