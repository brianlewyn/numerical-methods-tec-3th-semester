# Regresion Lineal Simple

La Regresión Lineal Simple es una técnica estadística que modela la relación lineal entre una variable independiente (denotada como `x`) y una variable dependiente (denotada como `y`). Su objetivo es encontrar una ecuación matemática (una línea recta) que permita predecir el comportamiento de `y` a partir de valores conocidos de `x`.

# ¿Cómo clonar el repositorio?

Guarda el proyecto en una carpeta de tu preferencia (ej. `Documents`). Luego, debes abrir la línea de comandos en esa ubicación y ejecutar los siguientes comandos. El primero sirve para clonar el repositorio, y el segundo es para entrar al proyecto.

```
git clone https://github.com/brianlewyn/numerical-methods-tec-3th-semester.git
cd numerical-methods-tec-3th-semester
```

# ¿Cómo compilar y ejecutar el proyecto?

El código corre usando la versión 27 de Java. Además, las siguientes líneas se deben ejecutar desde PowerShell. La primera línea es para compilar los archivos Java en archivos .class; la siguiente línea ejecuta esos archivos.

```powershell
javac .\Unidad5\RegresionLineal\*.java
java Unidad5.RegresionLineal.Main
```

Esto es lo que debería imprimir en consola:

```
--- RESULTADOS DE MINIMOS CUADRADOS Y CORRELACION ---
Sumatorias: n=10, X=55.0, Y=721.0, X2=385.0, Y2=55473.0, XY=4499.0
Pendiente (beta1): 6.4667
Ordenada al origen (beta0): 36.5333
Modelo obtenido: Y = 36.5333 + 6.4667X
Coeficiente de Pearson (r): 0.9944
Coeficiente de Determinacion (r2): 0.9888

Realizar una estimación para X = 5.50
Y(5.50) = 72.10
```