# MultiSCID

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture10.png">

> CBTis 168 Francisco I. Madero.
>
> - Leonel Iván Fernández Carrillo
> - Alejandra Hernández Celestino
> - Alma Stephania Ibarra Lozano
> - Ángel Ibarra Viveros
> - Bryan Josué López López
> - Ixchel López Santiago

## 1. INTRODUCCIÓN

MultiSCID (Multi Sistema de Control por identificación) es un sistema computarizado compuesto por tres módulos, dos dispositivos electrónicos (MultiSCID Master y MultiSCID IO) y un programa de software que permite el registro de asistencias a un centro educativo y la gestión de préstamos de libros en una biblioteca. El software está dividido en dos partes: MultiSCID escuela y MultiSCID biblioteca. Ambos utilizan la tecnología RFID (identificación por radiofrecuencia) y realizan las siguientes funciones:
- MultiSCID Escuela: Cuando el dispositivo MultiSCID IO (Input Output) detecte algún accesorio del kit MultiSCID (tarjeta, llavero, prenda de vestir, pulsera y/o pines) activado con la tecnología RFID, se registra y se envía un correo al padre de familia o tutor informando sobre la entrada o salida del alumno de la institución educativa.
- MultiSCID Biblioteca: Se encarga de gestionar los préstamos y devoluciones de libros en una biblioteca por medio de la tecnología RFID, de esta manera el libro y el alumno son identificados por MultiSCID Master para administrar los procesos de entradas y salidas de libros prestados a los alumnos en una biblioteca escolar.

MultiSCID cuenta con un submódulo para configurar los datos del centro educativo, así como del personal directivo y comunidad estudiantil. Una investigación realizada en el CBTis No. 168, indica que el Porcentaje de padres de Familia que Conoce (PFC) la hora real en que su hijo entra y sale de la escuela es del 2%.

Por otro lado, la biblioteca registra manualmente el registro de préstamos de libros. Los procesos implementados son: Investigación preliminar, Requerimientos de software y hardware, Diseño, Depuración y Documentación. Los resultados indican que mediante MultiSCID el PFC se incrementa es un 84%, y se puede gestionar los procesos de entrada y salida de libros en una biblioteca.

## 2. PLANTEAMIENTO DEL PROBLEMA

Una investigación realizada en septiembre del 2018 indica que el 92% de los padres de familia no conoce la hora en la cual su hijo entra y sale de la escuela, lo cual puede provocar preocupación ante los altos índices de inseguridad que se tienen actualmente, y por el contrario, solo el __8%__ de los Padres de Familia Conoce (__PFC__) la hora de entrada y salida de sus hijos, debido a que ellos mismos los trasladan de ida y regreso usando transporte propio. Ante tal situación, surge la siguiente pregunta __¿Se puede crear un dispositivo electrónico que permita incrementar el porcentaje de Padres de Familia que Conoce (PFC) la hora de entrada y salida de su hijo en una institución educativa?__ Lo anterior con la finalidad de habilitar un Sistema computarizado para que los padres de familia tengan información en tiempo real sobre la estancia de sus hijos dentro del centro educativo, incorporando el uso de las TIC’s tanto para el registro de entrada y salida de los alumnos como en otras actividades dentro de la escuela. Por otro lado, la biblioteca realiza en forma manual la gestión de entrada y salida de libros ocupando aproximadamente 5 minutos en cada proceso; la pregunta es __¿Se puede crear un software junto con un dispositivo electrónico que gestione los préstamos y devoluciones de libros en una biblioteca en menos de 5 minutos?__

## 3. JUSTIFICACIÓN DE LA INVESTIGACIÓN

Se fomenta el uso de las tecnologías por parte de los estudiantes y de los padres de familia, para lo cual es necesario diseñar un dispositivo electrónico de bajo costo y especializado para registrar la entrada y salida de los alumnos al centro educativo, otra razón que justifica el desarrollo del proyecto es innovar un nuevo mecanismo de comunicación para estar informado sobre la hora en la que un alumno entra y sale de la escuela. Cabe señalar que se pretende comercializar MultiSCID a precio accesible.

## 4. OBJETIVO GENERAL 

Diseñar y desarrollar un sistema computarizado que permita mantener comunicación en tiempo real con los padres de familia para informarles sobre la hora exacta de entrada y salida de sus hijos en la escuela, además gestionar los libros que son prestados y devueltos por los alumnos.
Metas
- Crear una base de datos que reconozca el 100% de los usuarios de MultiSCID.
- Desarrollar un dispositivo electrónico que identifique el 100% de los accesorios del kit MultiSCID.
- Implementar MultiSCID con el 100% de los integrantes del grupo piloto en el proceso experimental.

## 5. HIPÓTESIS

$H_1$: El porcentaje de Padres de Familia que Conoce (PFC) la hora de entrada y salida de su hijo en una institución educativa se puede incrementar mediante la creación e implementación de un dispositivo electrónico diseñado especialmente para ese propósito.

> $$
> H_1 = PFC_1 > PFC
> $$
>
> Donde:
> $PFC_1$ = Porcentaje de Padres de Familia que Conoce(PFC1) la hora de entrada y salida de su hijo en una institución educativa mediante MultiSCID
> $PFC$ = Porcentaje de Padres de Familia que Conoce (PFC) la hora de entrada y salida de su hijo en una institución educativa antes de usar MultiSCID.

$H_2$: El Tiempo Promedio (TP) ocupado en el registro de préstamo y devolución de libros se puede disminuir en menos de un minuto.

> $$
> H_2 = TP < 60 seg.
> $$

## 6. MARCO TEÓRICO

Para la realización del proyecto MultiSCID se utilizan varios elementos entre ellos códigos realizados por autores conocedores de la tecnología arduino además de utilizar componentes de java para manipular las bases de datos en un sistema de software, asimismo se parte de las siguientes aportaciones.

__Raspberry.-__ Alfredo Pascual establece a la Raspberry como un ordenador de tamaño pequeño que cuenta con la posibilidad de poder trabajar con diferentes sistemas operativos y manejar diferentes aplicaciones (Pascual; 2013).

__Tecnología RFID.-__ Zoe Falomir define los sensores de identificación por radio frecuencia como un receptor y transmisor de datos que utiliza ondas de radiofrecuencia a una corta distancia, para ser atendidas por un ordenador, leyendo o escribiendo datos en dispositivos externos que contienen un identificador único en el mundo (Falomir; 2006). Las etiquetas RFID son unos dispositivos pequeños, similares a una pegatina, que pueden ser adheridas o incorporadas a un producto, un animal o una persona. Contienen antenas para permitirles recibir y responder a peticiones por radiofrecuencia desde un emisor-receptor RFID (Shaoni; 2005).

__Motor de bases de datos SQL.-__ Carl Rabeler afirma que un motor de base de datos es el servidor principal para almacenar, procesar y proteger los datos, proporciona acceso controlado y procesamiento de transacciones rápido para cumplir con los requisitos de las aplicaciones. Se pueden crear tablas para almacenar datos y objetos de base de datos como índices, vistas y procedimientos almacenados para ver, administrar y proteger los datos (Rabeler; 2017).

__Lenguaje de programación Java.-__ Java es un lenguaje de programación orientado a objetos creado con la intención de que los programadores escriban el código solo una vez y lo ejecutarán en cualquier dispositivo (Guevara, 2018).

__JDK.-__ JDK posee un compilador que toma nuestro código Java y valida la sintaxis, en caso de que el compilador encuentre algún error en el código muestra un mensaje y si todo está bien el compilador creará un archivo con código byte .class (Guevara, 2018).

__Entorno de desarrollo NetBeans.-__ NetBeans IDE es un entorno de desarrollo integrado (IDE), modular de base estándar (normalizado), escrito en el lenguaje de programación Java. El proyecto NetBeans consiste en un IDE de código abierto y una plataforma de aplicación, las cuales pueden ser usadas como una estructura de soporte general (framework) para compilar cualquier tipo de aplicación (Samarali; 2012).


## 7. DESCRIPCIÓN DE PLANEACIÓN Y DESARROLLO DEL PROYECTO

La planeación se describe en la siguiente gráfica de Gantt.

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture1.png">

Tabla 1: Grafica de Gantt

Para la realización del proyecto MultiSCID se implementaron los siguientes procesos:

## 7.1. Investigación Preliminar

Sobre los requerimientos de materiales.

- Unos de los componentes electrónicos empleados es la plataforma de hardware y software de código abierto. Esté se basa en una sencilla placa con entradas y salidas, analógicas y digitales, en un entorno de desarrollo que está fundamentado en el lenguaje de programación Processing (Amangandi; 2012).
- Placa Raspberry, seleccionada por su tamaño y su compatibilidad con el software y hardware, lo cual facilita el uso para este proyecto.
- Sensor RFID, elegido por precio, tamaño y facilidad para detectar etiquetas RFID.
- El sensor RFID realiza peticiones o preguntas por radiofrecuencia al chip que integran las etiquetas RFID, las cuales emiten una respuesta al recibir las señales del lector, permitiendo la identificación con gran seguridad y precisión en tiempo real (Shaoni; 2005). En este caso utilizamos tarjetas RFID, pulseras de silicon y llaveros.

Sobre la elección del lenguaje de Programación 

- El lenguaje de programación seleccionado es Java utilizando el entorno de desarrollo Netbeans en el proyecto MultiSCID debido a que existe una mayor facilidad en el uso de objetos y gráficos.

Sobre el problema por solucionar

- Por medio de una encuesta realizada a los padres de familia o tutores, el 86.66% no conoce la hora en la cual el alumno entra y sale de la institución, provocando una preocupación social.  

## 7.2. Diseño de la aplicación

A continuación, se describe el diseño de MultiSCID Escuela y MultiSCID Biblioteca.

## 7.2.1. Diseño de MultiSCID Escuela

Cuando el alumno registra una entrada o salida de la escuela, MultiSCID realiza lo siguiente:
- Paso 1: El sensor detecta algún accesorio del Kit MultiSCID que el alumno tenga consigo.
- Paso 2: Al detectar el RFID del alumno, se registra en la base de datos la hora exacta en la que el accesorio RFID pasó por el sensor.
- Paso 3: Se envía un correo electrónico al padre o tutor registrado, notificando que el alumno acaba de entrar o de salir de la escuela.
- Paso 4:  Se generarán estadísticas.

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture2.jpg">

Figura 1: Diseño general de MultiSCID Escuela 
Fuente: Imagen propia

## 7.2.2. Diseño de MultiSCID Biblioteca

Cuando el alumno registra una entrada o salida de un libro de la biblioteca, MultiSCID realiza lo siguiente:
- Paso 1A: El sensor detecta el ID correspondiente a un libro.
- Paso 1B: El sensor detecta algún accesorio del Kit MultiSCID que el alumno traiga consigo para su identificación.
- Paso 2: Al detectar el ID del libro y del alumno, se registrará en la base de datos la hora exacta en que el libro es prestado o devuelto.

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture3.jpg">

Figura 2: Diseño general de MultiSCID Biblioteca
Fuente: Imagen propia

## 7.3. Codificación del programa.

El sistema de software está programado con técnicas de programación basadas en objetos usando el lenguaje Java con entorno de desarrollo en NeatBeans. En el siguiente diagrama se muestra los módulos principales.

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture4.png">

Figura 3: Diagrama jerárquico funcional
Fuente: Imagen Propia.

Mediante el uso de MultiSCID es viable crear un registro de entradas y salidas de alumnos en tiempo real a través de la tecnología RFID con el fin de administrar bases de datos por medio de altas, bajas y modificaciones en los datos previamente obtenidos y en consecuencia crear reportes certeros, asimismo enviar un email reportando la entrada y salida al padre o tutor. Cabe señalar que respecto a MultiSCID Escuela se cuenta con el diagrama ER (Ver anexo 1) y diagrama de clases (Ver anexo 2); y de MultiSCID Biblioteca se tiene el diagrama ER (Ver anexo 3) y diagrama de clases (Ver anexo 4).

## 7.4. Pruebas

Durante el diseño y desarrollo del proyecto, se realizaron pruebas con el propósito de detectar y corregir errores tanto en el dispositivo electrónico como en el sistema de software, de los cuales sobresalen los siguientes:
- Para las pruebas de funcionalidad de los módulos de altas, bajas y cambios de las tablas que conforman la base de datos se realizaron diferentes test para detectar deficiencias, corrigiendo el programa en varias ocasiones para obtener la mayor optimización y rendimiento.
- Para probar el ordenador Raspberry, se descargaron los diferentes sistemas operativos para corroborar cual tenía un mejor rendimiento y compatibilidad, llegamos al acuerdo de que Raspbian es el sistema que se adapta mejor al proyecto, después se descargó el jdk para java y mysql, en ambos se realizaron diferentes pruebas de funcionalidad y respondieron satisfactoriamente.
- En el sensor RFID las pruebas se realizaron en conjunto con el Arduino, se leyeron más de 600 veces diferentes dispositivos RFID para detectar posibles errores y corregirlos en el programa del Arduino.
- Con el fin de evitar posibles errores, se mandaron aproximadamente 40 correos a diferentes direcciones cuando se pasa la tarjeta por el sensor, todos llegaron exitosamente y sin ninguna inexactitud.

## 7.5. PROCESO EXPERIMENTAL

El proceso de implementación de MultiSCID Escuela, implica trabajar con un grupo piloto considerando las siguientes etapas:

__Etapa I:__ Consiste en la recolección de datos mediante la aplicación de una encuesta con firma de consentimiento (Ver ejemplo en anexo 5) de los padres de familia para participar en el grupo piloto.

__Etapa II:__ Consta en administrar el sistema de software al dar de alta los datos recabados en la encuesta de la etapa I.

__Etapa III:__ Se basa en la implementación de MultiSCID con el grupo piloto.

La implementación de MultiSCID Biblioteca considera la base de datos de libros de la especialidad de programación existentes en la biblioteca del plantel y la base de datos de los alumnos del grupo piloto con los cuales se realiza la gestión bibliotecaria.

## 7.6. DOCUMENTACIÓN

La trascendencia de información sobre el desarrollo de este proyecto constó del manual de usuario y técnico. 

## 8. DESCRIPCIÓN DEL GRADO DE INNOVACIÓN

Los procesos de innovación se reflejan en las instituciones educativas al identificar la diferencia que existe entre antes y después de la implementación de MultiSCID. La innovación del proyecto MultiSCID es alta, dado que permite contar con una herramienta computarizada que habilita la posibilidad de establecer comunicación en tiempo real para informar sobre la fecha y hora de entrada/salida de sus hijos al centro educativo con un sistema de software diseñado especialmente para cumplir con este propósito. Además, permite tener el control acerca de cuál alumno toma un libro prestado de la biblioteca y saber cuándo el libro es devuelto.

## 9. DESCRIPCIÓN DEL GRADO DE FACTIBILIDAD (TÉCNICA Y FINANCIERA)

El proyecto es factible desde el punto de vista financiero pues no requiere mucho financiamiento, los componentes electrónicos y las tarjetas tienen un costo en el mercado local de alrededor de $1,960.00 MXN, cada etiqueta RFID cuesta aproximadamente $15.00 MXN, además es la utilización del software libre y completamente gratuito, como lo son los lenguajes de programación Java y Arduino. Cabe señalar que el proyecto es factible técnicamente dado que, ofrece garantías técnicas de seguridad en el manejo, almacenamiento, envío y procesamiento de datos.  

## 10. IMPACTO SOCIAL O TECNOLÓGICO Y/O DESARROLLO SUSTENTABLE
En el CBTis 168, se tienen más de 2000 alumnos, que equivale al igual número de padres de familia que se pueden ver beneficiados con las bondades que ofrece MultiSCID, lo cual indica la magnitud del impacto positivo que puede tener con el proyecto en caso de ser implementado. Además, puede ser reproducido e implementado en otros centros educativos. En cuanto a la sustentabilidad, no hace ningún tipo de daño a la sociedad ni al medio ambiente.

## 11. ANÁLISIS DE RESULTADOS

El proceso de implementación de MultiSCID Escuela, implica trabajar con un grupo piloto considerando las siguientes tres etapas:

__Etapa I:__ Consiste en la recolección de datos mediante la aplicación de una encuesta contestada por un grupo de alumnos junto con sus correspondientes padres de familia o tutor. En dicha encuesta se piden datos proporcionados por el alumno, tales como: Curp, nombre, domicilio, etc. Así como el número telefónico y correo electrónico del padre de familia o tutor, firmado de consentimiento para recibir mensajes informando la hora en la que entra y sale su hijo de la escuela. Obteniendo los siguientes resultados:

| Resultado  de la validación de encuestas  | Los datos están completos y correctos | Sumatoria | Porcentaje |
| ----------------------------------------- | ------------------------------------- | --------- | ---------- |
| Encuestas con firma de consentimiento.    | Sí: 32                                | 32        | 72.73      |
| Encuestas con firma de NO consentimiento. | No: 12                                | 12        | 27.27      |
| Sumas                                     |                                       | 44        | 100        |

Tabla 2: Resultado de validación de encuestas 

__Etapa II__: Consta en administrar el sistema de software, mediante los procesos de añadir, eliminar y modificar los registros de las bases de datos con la información correspondiente a las tablas de Alumnos, Tutores (padres de familia) y Horarios. Cabe señalar que dicha información corresponde a la información obtenida en la etapa I. Los resultados obtenidos en ésta etapa consisten en el llenado de la base de datos con un total de 32 registros, los cuales corresponden a igual número de alumnos que sus correspondientes padres de familia dieron su consentimiento para formar parte de éste proyecto en su etapa experimental.

__Etapa III:__ Se basa en la implementación de MultiSCID Escuela con el grupo piloto de alumnos, obteniendo los siguientes resultados.

|                                                              | Porcentaje |
| ------------------------------------------------------------ | ---------- |
| Porcentaje de padres  de Familia que Conoce (PFC1) al 100% la hora y entrada de sus  hijos. | 71.8       |
| Porcentaje de padres  de Familia que Conoce (PFC1) al 90% la hora y entrada de sus  hijos. | 12.5       |
| Porcentaje de padres  de Familia que Conoce (PFC1) al 80% la hora y entrada de sus  hijos. | 15.6       |

Tabla 3: Tabla de resultados

Al sustituir los datos en la hipótesis estadística $(H_1= PFC_1 > PFC)$, se tiene que efectivamente $PFC_1 > PFC$; por lo tanto, existen elementos para aceptar la hipótesis $H_1$. Respecto a MultiSCID Biblioteca el Tiempo Promedio ($TP$) empleado en el proceso experimental con el grupo piloto es de 21 segundos. Y en base a los datos obtenidos, se puede afirmar que existen elementos para aceptar la $H_2$, dado que  $TP < 60$ segundos.

## 12. CONCLUSIONES

Fue posible diseñar un sistema computarizado que ayuda a incrementar la variable PFC ya que con MultiSCID se puede mantener al tanto a los padres de familia sobre la estancia (entrada y salida) de sus hijos en el plantel educativo, generando satisfacción en los padres de familia. También logra gestionar la información de una biblioteca de forma rápida y concreta, debido a que el sistema registra datos correspondientes a préstamos y entrega de libros en una biblioteca escolar; permitiendo así un fácil manejo de la información.

## 13. ANEXOS

Anexo 1: Diagrama E-R de MiltiSCID Escuela.

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture5.png">

Figura 4: Diagrama ER de MultiSCID Escuela

Anexo 2: Diagrama de clases de MiltiSCID Escuela.

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture6.png">

Figura 5: Diagrama de clases  de MultiSCID Escuela

Anexo 3: Diagrama E-R de MiltiSCID Biblioteca

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture7.png">

Figura 6: Diagrama ER de MultiSCID Biblioteca

Anexo 4: Diagrama de clases de MiltiSCID Biblioteca.

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture8.png">

Figura 7: Diagrama de clases  de MultiSCID Biblioteca

Anexo 5: Formato de encuesta contestada:

<img src="https://raw.githubusercontent.com/LeonelYLuego/MultiSCID/master/Imagenes/Picture9.jpg">

Figura 8: Encuesta contestada

## 14. REFERENCIAS

Amangandi, J. (2012). ARDUINO. Jamangandi. Recuperado de: http://jamangandi2012.blogspot.com/2012/10/que-es-arduino-te-lo-mostramos-en-un.html                                                          Consultado el 13 de Febrero de 2019.

Falomir, F.  L.;  (04 de octubre de 2006). Sensores de identificación por radio frecuencia. Universidad Jaume I. Recuperado de: http://repositori.uji.es/xmlui/bitstream/handle/10234/27825/ICC%202006-10-04.pdf?sequence=1                                                 Consultado el 13 de Febrero de 2019.

Gómez, M. F. (2013). Entorno de desarrollo Netbeans. Felixgm. Recuperado de: https://ants.inf.um.es/~felixgm/docencia/j2me/resources/I-XTema2.pdf     Consultado el 13 de Febrero de 2019.

Guevara, B. A. (2018). ¿Que és Java y por qué aprenderlo?. DevCode. Recuperado de: https://devcode.la/blog/que-es-java/                                            Consultado el 13 de Febrero de 2019.

Marianella, M. (17 febrero de 2018). ¿Qué es un Diagrama Jerárquico? Características Más Importantes. Lifeder. Recuperado de: https://www.lifeder.com/diagrama-jerarquico/Consultado el 13 de Febrero de 2019.

Pascual, A. (22 de noviembre de 2013). Raspberry Pi. El Confidencial. Recuperado de: https://www.elconfidencial.com/tecnologia/2013-11-22/dos-millones-de-razones-para-saber-que-es-exactamente-raspberry-pi_56003/                                  Consultado el 14 de Febrero de 2019.

Ploue Smith, C. (14 noviembre de 2017). Cómo crear un diagrama de Gantt en Excel. smartsheet. Recuperado de: https://es.smartsheet.com/blog/como-crear-un-diagrama-de-gantt-en-excel Consultado el 14 de Febrero de 2019.

Rabeler, C. (25 de Julio de 2017). Motor de base de datos de SQL Server. Microsoft. Recuperado de: https://docs.microsoft.com/es-es/sql/database-engine/sql-server-database-engine-overview?view=sql-server-2017#see-also                                                  Consultado el 14 de Febrero de 2019.

Samarali. (7 de octubre de 2012). Información NetBeans IDE 6.1. NetBeans. Recuperado de: https://netbeans.org/community/releases/61/index_es.html Consultado el 14 de Febrero de 2019.

Shaoni, B. (2005). ¿Qué es tarjeta de proximidad RFID?. Proximidad. Recuperado de: http://www.tarjetashid-mifare-rfid.com/que-es-tarjeta-proximidad-rfid.html Consultado el 14 de Febrero de 2019