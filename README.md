# Actividada-Java-ESTDATOS

Ejercicio académico de la asignatura de Estructura de Datos: gestor de recibos de agua en Java con interfaz por `JOptionPane`.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-007396?style=for-the-badge&logo=java&logoColor=white)

## Contexto

Actividad pequeña de la asignatura de Estructura de Datos. La aplicación permite registrar recibos de agua (número de referencia, estrato, consumo en m³ y valor a pagar), listarlos y calcular totales y promedios básicos. Los datos se guardan en memoria dentro de un `ArrayList` durante la ejecución, sin persistencia.

> Nota: el nombre del repositorio contiene un typo (`Actividada` en vez de `Actividad`). GitHub permite renombrarlo sin romper clones existentes gracias al redirect automático.

## Tecnologías

- Java SE (JDK 8 o superior)
- `javax.swing.JOptionPane` para los diálogos de entrada/salida
- `java.util.ArrayList` como estructura de datos en memoria

## Ejecución

Clonar el repositorio y compilar los dos archivos Java:

```bash
git clone https://github.com/JeanCaicedo/Actividada-Java-ESTDATOS
cd Actividada-Java-ESTDATOS
javac -d . ReciboAgua.java pryreciboagua.java
java pryreciboagua.pryreciboagua
```

Ambas clases pertenecen al paquete `pryreciboagua`, así que la compilación genera la carpeta `pryreciboagua/` con los `.class` correspondientes.

## Estructura

```
Actividada-Java-ESTDATOS/
├── ReciboAgua.java       # clase modelo (referencia, estrato, m³, valor)
├── pryreciboagua.java    # clase principal con el menú JOptionPane
└── README.md
```

El menú ofrece: agregar recibo, mostrar recibos, total de recibos, total de m³ consumidos, valor promedio a pagar y salir.

## Autor

Jean Caicedo — [@JeanCaicedo](https://github.com/JeanCaicedo)
