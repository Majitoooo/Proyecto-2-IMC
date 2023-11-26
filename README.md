# Proyecto-2-IMC
Proyecto 2 de Estructura de datos: Calculador de IMC

DOCUMENTACIÓN:

Estudiantes:
- Juanita Martínez Gutiérrez
- Viviana Andrea Andica Bueno
- Maria José Cordón Vasco

● Descripción del Proyecto:
Este proyecto es una aplicación que permitiría a los usuarios calcular su índice de masa corporal (IMC) y recibir recomendaciones personalizadas para mejorar su calidad de vida. El IMC es una medida que se utiliza para evaluar la relación entre el peso y la altura de una persona y determinar si se encuentra en un rango saludable. Para calcular el IMC, los usuarios deberán ingresar su peso en kilogramos y su altura en metros (con un punto). Después de esto, la aplicación mostrará la clasificación de su IMC, es decir, si se encuentran en bajo peso, peso saludable, sobrepeso u obesidad. Además, la aplicación brindará recomendaciones personalizadas para mejorar los hábitos de vida o la condición de salud de la persona, como sugerencias de ejercicio y hábitos alimenticios. La aplicación también permitirá visualizar esta información a través de gráficos y tablas de referencia, todo gracias a la capacidad del programa para procesar datos y realizar cálculos de manera automatizada.

● Lenguaje de programación y framework utilizados:
En cuanto a la tecnología para desarrollar la aplicación utilizamos, Java que es un lenguaje de programación muy popular y versátil que se utiliza ampliamente para el desarrollo de aplicaciones de escritorio, aplicaciones web y aplicaciones móviles. Java es conocido por su seguridad, portabilidad y facilidad de uso, lo que lo hace ideal para proyectos de este tipo.

● Requisitos para la instalación y ejecución del código:
Para ejecutar nuestro código, necesitas tener instalado de antemano, un entorno de desarrollo (ya fue mencionado anteriormente) 
- Java Development Kit (JDK): Se debe tener instalado un JDK 17 en el sistema. Netbeans es una IDE basada en Java, por lo que se necesita el JDK 17 para compilar y ejecutar el código que va a ser enviado. 
Clonar o Importar el proyecto: Los pasos se van a mostrar más detalladamente en la parte inferior, pero, en cuestión lo que hay que hacer, es descomprimir el archivo Zip que va a ser enviado junto con este archivo de la documentación, al descomprimirlo, lo vamos a guardar en una carpeta (de la cual sepamos su ubicación en nuestro dispositivo), para luego abrir Netbeans, darle en la parte superior llamada File, luego Open Project (Abrir proyecto) y de esta manera, buscar en nuestro dispositivo, el archivo que anteriormente fue descomprimido. De esta manera debería funcionar el programa. 
Ejecutar: Ya abierto el código en Netbeans, se puede ejecutar, debes asegurarte de que la clase principal (en este caso “Calculadora IMC”) esté configurada como la clase principal de la ejecución. 
Interactuar con la aplicación: Al tener el código ya abierto en tu archivo, se debería ver la pantalla de GUI. Ahora ya queda listo el programa y puedes hacer todo lo que sus funcionalidades permiten, en este caso: Calcular tu índice de masa corporal, ver el rango , ver tips saludables de alimentación y rutinas de ejercicio 

● Instrucciones de cómo instalar y ejecutar el programa:
- Se envía un link el cual está subido en github 
- Le daremos click en “<>code”
- Inmediatamente se descargará el archivo y se nos va a guardar el archivo comprimido en nuestro equipo 
- Para descomprimir el archivo le damos en extraer todo
- Le damos click en extraer
- Le damos en Examinar y ya se mira en qué carpeta se desea guardar el archivo (se debe recordar porque luego debe ser abierta).
- Ya después de que queda guardado el archivo, nos vamos para el programa netbeans
- Para abrir el archivo le damos en File
- Damos click en open project
- Nos aparecerá esta pestaña, buscaremos el archivo donde lo guardamos, al encontrarlo le daremos en Open project. 
- Al darle Open Project inmediatamente se abre el archivo con el código
- Y aparecerá el código 
- Luego debemos darle click en la fecha donde está Source Packages 
- Luego se abrirán dos Java Packages
- Le daremos click en proyecto_2
- Le daremos click en la flecha del Java Package nombrado proyecto_2
- Se abrirá un archivo llamado CalculadoraIMC
- Aquí ya tendremos el código y el programa listo para la ejecución

● Ejecución del programa:
- A la hora de ejecutar el programa podemos poner en el teclado Shift+F6 o pararnos en la primera línea de código y darle esto a continuación mostraremos como hacerlo
Damos click derecho y no aparecerá la opción de run file 
- Le daremos Click En Run File
- Inmediatamente nos saldrá para ejecutar el programa
- Seguiremos con la ejecución del programa haciendo su respectiva prueba 
- Comenzaremos ingresando nuestro nombre, nuestro peso y nuestra altura (Esta se debe poner con un punto por ejemplo 1.98) 
- Le daremos calcular IMC 
- nos saldrá un anuncio el cual si la persona esta en bajo peso, un peso normal, sobrepeso u obesidad 
- le daremos “ok”
- nos saldrá esta nueva ventana donde nos dirá cual es nuestro IMC y el rango en el que estamos 
- luego nos aparecerán los botones de vida saludable, alimentación, ejercicio, ver gráficos y tablas, y también ver historial
- Le daremos click en vida saludable 
- Nos aparecerá una nueva ventana que esto son los consejos de vida saludable 
- Le daremos click en alimentación
- Nos aparecerá una nueva ventana que esto son  los consejos para alimentación 
- Le daremos click en ejercicio 
- Nos aparecerá una nueva ventana que esto son  los consejos para hacer ejercicio
- Le daremos click en ver historial
- Inmediatamente nos aparecerá el historial de todos los consejos que se dieron
- Luego le daremos click en ver gráficos y tablas 
- Nos aparecerá la tabla y el gráfico del rango en el el que estamos 
- Le damos en el botón regresar y se finaliza las ejecución del código 

● Descripción de las funcionalidades:
- La lista enlazada que se utiliza en el código, es una estructura de datos que se utiliza para almacenar una colección de elementos en orden. En este caso, se utiliza una lista enlazada para almacenar objetos de la clase RegistroIMC. Cada objeto RegistroIMC contiene información sobre una persona, su IMC y un consejo de salud personalizado. La lista enlazada se utiliza para almacenar todos los registros de IMC que se han calculado. Cada vez que se calcula el IMC de una persona, se crea un nuevo objeto RegistroIMC y se agrega al principio de la lista enlazada. De esta manera, se puede mantener un historial de todos los registros de IMC que se han calculado.

- Botón vida saludable
En el método btnSaludableActionPerformed se utiliza para generar recomendaciones personalizadas para los usuarios que se encuentran en la categoría de peso saludable. Cuando se hace clic en el botón “Saludable”, se muestra un mensaje emergente que contiene las recomendaciones personalizadas para una vida saludable. Estas recomendaciones incluyen comer porciones más grandes, ingerir alimentos con más frecuencia y agregar refrigerios nutritivos a la dieta, como batidos de frutas, nueces y barras de granola. Después de mostrar el mensaje emergente, se agrega la recomendación al historial de recomendaciones personalizadas utilizando la lista enlazada historialRecomendaciones.
- Botón Alimentación
En el método btnAlimentacionActionPerformed, se generan recomendaciones personalizadas para los usuarios que buscan mejorar su alimentación. Cuando se hace clic en el botón “Alimentación”, se muestra un mensaje emergente que contiene las recomendaciones personalizadas para priorizar los alimentos altos en nutrientes. Estas recomendaciones incluyen frutas, verduras, proteínas y grasas saludables. Después de mostrar el mensaje emergente, se agrega la recomendación al historial de recomendaciones personalizadas utilizando la lista enlazada.
- Botón ejercicio
En el método btnEjercicioActionPerformed, se generan recomendaciones personalizadas para los usuarios que buscan mejorar su estado físico a través del ejercicio. Cuando se hace clic en el botón “Ejercicio”, se muestra un mensaje emergente que contiene las recomendaciones personalizadas para hacer ejercicio. Estas recomendaciones incluyen realizar ejercicios de fuerza para desarrollar músculo y aumentar la masa corporal, implementar ejercicios cardiovasculares en la rutina, realizar una rutina de 150 minutos, visitar a un nutricionista y seguir las recomendaciones de tu médico. Después de mostrar el mensaje emergente, se agrega la recomendación al historial de recomendaciones personalizadas utilizando la lista enlazada historialRecomendaciones.
- Botón ver Historial
En el método btnHistorialActionPerformed, se utiliza una lista enlazada para almacenar todas las recomendaciones personalizadas que se han generado para cada usuario. Cuando se hace clic en el botón “Historial”, se recorre la lista enlazada historialRecomendaciones y se construye un mensaje que contiene todas las recomendaciones que se han generado hasta el momento. Si no se han generado recomendaciones, se muestra un mensaje que indica que no se ha oprimido ningún botón. Finalmente, se muestra un cuadro de diálogo que contiene el mensaje construido utilizando la función JOptionPane.showMessageDialog.
- Botón ver gráficos y tablas
En el código es una clase que se utiliza para mostrar tablas de referencia para los usuarios que se encuentran en la categoría de peso bajo. Peso normal. Sobre Peso y obesidad. Cuando se crea un objeto como por ejemplo TablasBajo, se muestra una tabla que contiene información sobre los rangos de IMC para la categoría de peso bajo. La tabla también puede incluir información adicional, como recomendaciones personalizadas para mejorar la salud y el bienestar de la persona. La función setVisible(true) se utiliza para hacer visible la tabla en la pantalla del usuario.

● Link del video con prueba del código:
https://clipchamp.com/watch/GEM6dpitHH1



  
  
