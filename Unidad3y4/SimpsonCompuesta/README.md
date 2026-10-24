# Simpson Compuesto

Implementación en Java del método de integración numérica **Simpson Compuesto (1/3)** con criterio de paro basado en el error absoluto y duplicación de subintervalos. El programa aproxima la integral de `f(x) = x²` en el intervalo `[0, 2]`, reutilizando la función y el cálculo del paso `h` de la clase `TrapecioCompuesto`. En cada iteración se duplica `n` hasta que la diferencia entre dos aproximaciones sucesivas sea menor a la tolerancia (`0.0001`).

> **Importante:** esta clase depende de `TrapecioCompuesto`, por lo que **ambos paquetes deben compilarse juntos**.

## Compilación

1. Abrir la terminal y ubicarse en el directorio raíz del proyecto (donde se encuentra la carpeta `Unidad3y4`).
2. Compilar ambos paquetes (TrapecioCompuesto y SimpsonCompuesto):

```bash
javac Unidad3y4/TrapecioCompuesto/*.java Unidad3y4/SimpsonCompuesto/*.java
```

## Ejecución desde la terminal

Ejecutar la clase Main del paquete SimpsonCompuesto:

```bash
java Unidad3y4.SimpsonCompuesto.Main
```

## Ejemplo de salida en consola

```bash
Resultado final obtenido: 2.6666666666666665
```