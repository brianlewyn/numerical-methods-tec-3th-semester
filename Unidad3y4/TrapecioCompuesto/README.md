# Trapecio Compuesto

Implementación en Java del método de integración numérica **Trapecio Compuesto** con criterio de paro basado en el error absoluto y duplicación de subintervalos. El programa aproxima la integral de `f(x) = x²` en el intervalo `[0, 2]`, duplicando `n` en cada iteración hasta que la diferencia entre dos aproximaciones sucesivas sea menor a la tolerancia (`0.0001`).

## Compilación

1. Abrir la terminal y ubicarse en el directorio raíz del proyecto (donde se encuentra la carpeta `Unidad3y4`).
2. Compilar las clases del paquete TrapecioCompuesto:

```bash
javac Unidad3y4/TrapecioCompuesto/*.java
```

## Ejecución desde la terminal

Ejecutar la clase Main del paquete:

```bash
java Unidad3y4.TrapecioCompuesto.Main
```

## Ejemplo de salida en consola

```bash
--- ITERACIONES (TRAPECIO COMPUESTO) ---
n = 2 | Integral = 3.0
n = 4 | Integral = 2.75 | Error = 0.25
n = 8 | Integral = 2.6875 | Error = 0.0625
n = 16 | Integral = 2.671875 | Error = 0.015625
n = 32 | Integral = 2.66796875 | Error = 0.00390625
n = 64 | Integral = 2.6669921875 | Error = 9.765625E-4
n = 128 | Integral = 2.666748046875 | Error = 2.44140625E-4
n = 256 | Integral = 2.66668701171875 | Error = 6.103515625E-5

Resultado final obtenido: 2.66668701171875
```
