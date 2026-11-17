# Método de Runge Kutta de 4to Orden

# ¿Cómo clonar el repositorio?

Guarda el proyecto en una carpeta de tu preferencia (ej. `Documents`). Luego, debes abrir la línea de comandos en esa ubicación y ejecutar los siguientes comandos. El primero sirve para clonar el repositorio, y el segundo es para entrar al proyecto.

```
git clone https://github.com/brianlewyn/numerical-methods-tec-3th-semester.git
cd numerical-methods-tec-3th-semester
```

# ¿Cómo compilar y ejecutar el proyecto?

El código corre usando la versión 27 de Java. Además, las siguientes líneas se deben ejecutar desde PowerShell. La primera línea es para compilar los archivos Java en archivos .class; la siguiente línea ejecuta esos archivos.

```powershell
javac .\Unidad6\MetodoRungeKutta\*.java
java Unidad6.MetodoRungeKutta.Main
```

Esto es lo que debería imprimir en consola:

```

-------- Método de Runge Kutta (h=0.10) ---------
-------------------------------------------------
n     x          RK4        Exacta     Error   
-------------------------------------------------
0     0.0000     1.0000     1.0000     0.0000    
1     0.1000     1.1103     1.1103     0.0000    
2     0.2000     1.2428     1.2428     0.0000    
3     0.3000     1.3997     1.3997     0.0000    
-------------------------------------------------
(x, y) = (0.3000, 1.3997)

```