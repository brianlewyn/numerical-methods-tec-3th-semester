import numpy as np
import matplotlib.pyplot as plt

# Solución exacta
wd = np.sqrt(0.96)
t_exact = np.linspace(0, 5, 500)
q_exact = np.exp(-0.2*t_exact)*(np.cos(wd*t_exact) + (0.2/wd)*np.sin(wd*t_exact))

# Datos numéricos RK4 (h=0.2)
t_num = np.arange(0, 5.2, 0.2)
y1_num = [1.000000,0.980589,0.925102,0.838436,0.726310,0.594978,0.450946,0.300711,0.150505,0.006080,-0.127475,-0.245878,-0.345757,-0.424711,-0.481323,-0.515142,-0.526624,-0.517047,-0.488396,-0.443236,-0.384566,-0.315673,-0.239982,-0.160915,-0.081762,-0.005562]

# Datos numéricos RK4 (h=0.1)
# t_num = np.arange(0, 2.6, 0.1)
# y1_num = [1.000000,0.995070,0.980587,0.957068,0.925097,0.885319,0.838430,0.785166,0.726302,0.662631,0.594967,0.524129,0.450934,0.376193,0.300698,0.225218,0.150492,0.077222,0.006069,-0.062355,-0.127484,-0.188811,-0.245884,-0.298311,-0.345760,-0.387963]

# Datos numéricos RK4 (h=0.05)
# t_num = np.arange(0, 1.3, 0.05)
# y1_num = 1.000000,0.998759,0.995070,0.988992,0.980587,0.969922,0.957068,0.942100,0.925097,0.906141,0.885319,0.862718,0.838429,0.812547,0.785166,0.756384,0.726301,0.695016,0.662630,0.629246,0.594966,0.559893,0.524128,0.487774,0.450934,0.413706

plt.figure(figsize=(9,5))
plt.plot(t_exact, q_exact, 'b-', linewidth=2, label='q_exacta(t)')
plt.plot(t_num, y1_num, 'ro--', markersize=5, label='y1(t_n) RK4 (h=0.2)') # Variar: 0.2, 0.1, 0.05
plt.xlabel('Tiempo t (s)')
plt.ylabel('Carga q (C)')
plt.title('Circuito RLC: Solución exacta vs. RK4 vectorial')
plt.grid(True, alpha=0.3)
plt.legend()
plt.tight_layout()
plt.show()

# Ejecutar este código en https://python-fiddle.com/ para generar gráficas con python 