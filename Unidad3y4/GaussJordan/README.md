# Método de Gauss-Jordan en Java

Implementación del método de eliminación de Gauss-Jordan para resolver sistemas de ecuaciones lineales, organizada en módulos dentro del paquete `Unidad3y4.GaussJordan`.

---

## Estructura modular del proyecto

El proyecto está dividido en tres clases principales, cada una con una responsabilidad específica:

| Archivo | Responsabilidad |
|---------|-----------------|
| `DefMatriz.java` | Define la matriz aumentada del sistema (coeficientes + términos independientes) y proporciona métodos para imprimir la matriz y los resultados. |
| `GaussJordan.java` | Contiene la lógica del método: primero escalona la matriz (eliminación gaussiana) y luego la reduce a su forma identidad (Gauss-Jordan). |
| `Main.java` | Punto de entrada del programa. Obtiene la matriz, ejecuta el método y muestra los resultados por consola. |

> **Nota:** `GaussJordan.java` reutiliza la clase `Gauss` del paquete `Unidad3y4.Gauss` para la fase de escalonamiento, lo que permite separar la eliminación gaussiana clásica del proceso de reducción de Gauss-Jordan.

---

## Compilación y ejecución

### Requisitos previos

- Tener instalado el **JDK** (Java Development Kit), versión 8 o superior.
- Verificar la instalación con:

```bash
java -version
javac -version
```

### Estructura de directorios esperada

El proyecto debe respetar la jerarquía de paquetes:

```text
Unidad3y4/
├── Gauss/
│   └── Gauss.java
└── GaussJordan/
    ├── DefMatriz.java
    ├── GaussJordan.java
    └── Main.java
```

### Pasos para compilar

1. Abre una terminal y ubícate en el directorio **raíz** del proyecto (donde se encuentra la carpeta `Unidad3y4`).

2. Compila todas las clases necesarias:

```bash
javac Unidad3y4/Gauss/*.java Unidad3y4/GaussJordan/*.java
```

### Pasos para ejecutar

Desde el mismo directorio raíz, ejecuta la clase `Main` usando su nombre completamente calificado:

```bash
java Unidad3y4.GaussJordan.Main
```

---

## Ejemplo de prueba

### Sistema de ecuaciones

El programa resuelve por defecto el siguiente sistema (definido en `DefMatriz.java`):

```text
 3.0x₁ - 0.1x₂ - 0.2x₃ =   7.85
 0.1x₁ + 7.0x₂ - 0.3x₃ = -19.3
 0.3x₁ - 0.2x₂ + 10.0x₃ =  71.4
```

Matriz aumentada inicial:

```text
|   3.00  -0.10  -0.20 |   7.85 |
|   0.10   7.00  -0.30 | -19.30 |
|   0.30  -0.20  10.00 |  71.40 |
```

### Salida esperada por consola

```text
Matriz original:
|   3.00  -0.10  -0.20 |   7.85 |
|   0.10   7.00  -0.30 | -19.30 |
|   0.30  -0.20  10.00 |  71.40 |

Matriz Identidad Reducida:
|   1.00   0.00   0.00 |   3.00 |
|   0.00   1.00   0.00 |  -2.50 |
|   0.00   0.00   1.00 |   7.00 |

Solución:  x1 = 3.00  x2 = -2.50  x3 = 7.00
```

### Interpretación

Los valores obtenidos son:

- **x₁ = 3.00**
- **x₂ = -2.50**
- **x₃ = 7.00**

La matriz resultante es la **matriz identidad** en la parte izquierda, con los valores de las incógnitas en la última columna, lo que confirma que el método de Gauss-Jordan se aplicó correctamente.

---

## Notas adicionales

- La comparación `Math.abs(matriz[i][i] - 1.0) > 1e-10` en `reducirMatriz` evita divisiones innecesarias cuando el pivote ya es 1 (considerando tolerancia numérica).
- El formato de impresión usa `%6.2f`, por lo que los números se muestran con **dos decimales** y ancho fijo de 6 caracteres.
- Si deseas probar con otro sistema, modifica el arreglo `matriz` dentro de `DefMatriz.java`.