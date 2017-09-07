es e interfaces relacionadas, como los paquetes de biblioteca incluidos con
Java).
Una clase final (final) es aquella que no puede tener clases que la hereden.
Esto se utiliza básicamente por razones de seguridad (para que una clase no pueda ser
reemplazada por otra que la herede), o por diseño de la aplicación.
Una clase abstracta (abstract) es una clase que puede tener derivadas, pero no
puede ser instanciada. Es literalmente abstracta. ¿Para qué sirve? Para modelar
conceptos. Por ejemplo, la clase Number es una clase abstracta que representa
cualquier tipo de números (y sus métodos no están implementados: son abstractos); las
clases descendientes de ésta, como Integer o Float, sí implementan los métodos de la
madre Number, y se pueden instanciar.
Por todo lo dicho, una clase no puede ser final y abstract a la vez (ya que la
clase abstract requiere descendientes).

###### ArrayList

ArrayList en Java, es una clase que permite almacenar datos en memoria de forma similar a los Arrays, con la ventaja de que el numero de elementos que almacena, lo hace de forma dinámica, es decir, que no es necesario declarar su tamaño como pasa con los Arrays.

Métodos para trabajar con los ArrayList son los siguientes:
// Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
ArrayList<String> nombreArrayList = new ArrayList<String>();
// Añade el elemento al ArrayList
nombreArrayList.add("Elemento");
// Añade el elemento al ArrayList en la posición 'n'
nombreArrayList.add(n, "Elemento 2");
// Devuelve el numero de elementos del ArrayList
nombreArrayList.size();
// Devuelve el elemento que esta en la posición '2' del ArrayList
nombreArrayList.get(2);
// Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
nombreArrayList.contains("Elemento");
// Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
nombreArrayList.indexOf("Elemento");
// Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
nombreArrayList.lastIndexOf("Elemento");
// Borra el elemento de la posición '5' del ArrayList   
nombreArrayList.remove(5); 
// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
nombreArrayList.remove("Elemento");
//Borra todos los elementos de ArrayList   
nombreArrayList.clear();
// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
nombreArrayList.isEmpty();  
// Copiar un ArrayList 
ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
// Pasa el ArrayList a un Array 
Object[] array = nombreArrayList.toArray();   


###### Sobrecarga

Cuando en una clase, se definen un mismo método, con diferente número de parámetros, o bien con el mismo numero de parámetros pero diferenciándose en la definición, en la cual, al menos un parámetro sea de diferente tipo, cuando esto sucede, se dice que el método está sobrecargado.
###### Sobrescritura 


-------------

###### Constructores
Un Constructor  es una función, método, etc,  de las clases, la cual es llamada automáticamente cuando se crea un objeto de esa clase.
Por ser métodos, los constructores también aceptan parámetros. Cuando en una clase no especificamos ningún tipo de constructor, el compilador añade uno público por omisión sin parámetros, el cual NO hace nada.
###### Características de los Constructores
```
1.Un constructor, tiene el mismo nombre de la clase a la cual pertenece.
2.No puede ser Heredado.
3.No retorna ningún valor (Ni void), por lo cual no debe especificarse ningún tipo de dato.
4.Debe declararse como public, sólo en casos realmente extraordinarios será de otro tipo.
```
-------------
###### Clases
Si la clase es abstracta no podrá ser 
instanciada sino a partir de sus clases derivadas.

-------------

###### Types of Variable

static variables
se dice que son atributos de clase si se usa la palabra clave static: en ese caso la
variable es única para todas las instancias (objetos) de la clase (ocupa un único lugar en memoria). Cuando usamos “static final” se dice que creamos una constante de clase, un atributo común a todos los objetos de esa clase. 

final: en este contexto indica que una variable es de tipo constante: no admitirá cambios
 después de su declaración y asignación de valor. final determina que un atributo no puede ser sobrescrito o redefinido. O sea: no funcionará como una variable “tradicional”, sino como una constante. 
Toda constante declarada con final ha de ser inicializada en el mismo momento de
 declararla. final también se usa como palabra clave en otro contexto: una clase final (final) es aquella que no puede tener clases que la hereden.

###### Static Methods
Static blocks of code.
```
public  = todos acceden 
private = Acceden  ... 
protected = solo dentro del mismo package 
```
-------------

###### Patrones de diseño 
GOF patrones de diseño 
Singleton patrones de diseño 

Modelo: Esta capa representa todo lo que tiene que ver con el acceso a datos: guardar, actualizar, obtener datos, además todo el código de la lógica del negocio, básicamente son las clases Java y parte de la lógica de negocio.
Clases : "Cuenta.java Persona.java"

Vista: La vista tiene que ver con la presentación de datos del modelo y lo que ve el usuario, por lo general una vista es la representación visual de un modelo (POJO o clase java). Clase : "Test.java"

Por ejemplo el modelo usuario que es una clase en Java y que tiene como propiedades, nombre y apellido debe pertenecer a una vista en la que el usuario vea esas propiedades.

Controlador: El controlador es el encargado de conectar el modelo con las vistas, funciona como un puente entre la vista y el modelo, el controlador recibe eventos generados por el usuario desde las vistas y se encargar de direccionar al modelo la petición respectiva. Clase : "Contenedor.java" 

Por ejemplo el usuario quiere ver los clientes con apellido Álvarez, la petición va al controlador y el se encarga de utilizar el modelo adecuado y devolver ese modelo a la vista.

Si te das cuenta en ningún momento interactúan directamente la vista con el modelo, esto también mantiene la seguridad en una aplicación.
