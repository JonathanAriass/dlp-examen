# Diseño de Lenguajes de Programación

![logo escuela](https://ingenieriainformatica.uniovi.es/image/image_gallery?img_id=5435634)

## ¿Qué es?

Este es el proyecto base que servirá para implementar un compilador durante el laboratorio de la asignatura de Diseño de Lenguajes de Programación en la [Universidad de Oviedo](https://unioi.es).

## Guión del proyecto

- [x] [Laboratorio 1 - Diagrama del AST](docs/labs/lab_01.md)
- [x] [Laboratorio 2 - Implementación del AST](docs/labs/lab_02.md)
- [x] [Laboratorio 3 - Analizador léxico](docs/labs/lab_03.md)
- [x] [Laboratorio 4 - Analizador sintáctico](docs/labs/lab_04.md)
- [x] [Laboratorio 5 - Construcción del AST](docs/labs/lab_05.md)
- [x] [Laboratorio 6 - Control & ErrorHandler](docs/labs/lab_06.md)
- [x] [Laboratorio 7 - Identificación de LValue](docs/labs/lab_07.md)
- [x] [Laboratorio 8 - Fase de identificación](docs/labs/lab_08.md)
- [x] [Laboratorio 9 - Comprobación de tipos](docs/labs/lab_09.md)
- [x] [Laboratorio 10 - Cálculo de offsets](docs/labs/lab_10.md)
- [x] [Laboratorio 11 - Generación de código I](docs/labs/lab_11.md)
- [x] [Laboratorio 12 - Generación de código II](docs/labs/lab_12.md)
- [x] [Laboratorio 13 - Generación de código III](docs/labs/lab_13.md)

## Créditos

- Profesor de laboratorio: [Luis Emilio Velasco Sánchez](https://emibloque.me) ([velascoluis@uniovi.es](mailto:velascoluis@uniovi.es))
- Coordinador de la asignatura: [Francisco Ortín Soler](http://www.reflection.uniovi.es/ortin/)

## Como usar
> Compilar un programa y mostrar salida de generacion de codigo por consola

Habra que ejecutar el siguiente comando -> `$ ./bin/xana.sh [programa.xana]`

> Misma operacion pero guardando el resultado en otro otro directorio con mismo nombre de archivo + .xana.mp

Habra que ejecutar el siguiente comando -> `$ ./bin/xana.sh [programa.xana] -d [dir]`

> Ejecutar codigo para un programa con codigo maquina

Habra que ejecutar el siguiente comando -> `$ mono mapl/TextVM.exe [programa.xana.mp]`