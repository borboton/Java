##### Vector arrayList String[] int[] String... 
```java
public static Inmueble creoInmueble(TipoInmueble imueble) {

		switch (imueble) {
		case CASA:
			return new Casa();
		case DEPARTAMENTO:
			return new Departamento();
		case PH:
			return new PH();
		case LOTE:
			return new Lote();
		}
		return null;
	}

```

##### Enum static 

##### Operador instanceOf

##### Captura de Excepciones
```
    Throwable 
       | 
  +----+-----+ 
  |          | 
Error    Exception 
  |          |
 ···   +-----+-----+
       |           |
      ···   RuntimeException 
```
Creamos una clase que extienda de Exception, llamada en este caso MiExcepcion y que contenga el tratamiento de la excepción:
```java
package local.modelo;
 
public class MiExcepcion extends Exception{
    // Constructor
    public MiExcepcion(){};
    
    // Excepcion: Error Provocado
    public String excErrorPersonalizado(){
        return "Error provocado.";
    }
}
```

```java
package local.vista;
    public static void main(String[] args) {        
        try{
            System.out.println("Provocando un error en 3, 2, 1...");
            throw new MiExcepcion();
        }catch(MiExcepcion ex){
            System.out.println(ex.excErrorPersonalizado());
        }
    }
}
```
Try Catch y debugger


##### Herencia y polimorfismo
La herencia es el mecanismo por el que se crean nuevos objetos definidos en términos de objetos ya existentes. Por ejemplo, si se tiene la clase Ave, se puede crear la subclase Pato, que es una especialización de Ave.
```java
    class Pato extends Ave {
        int numero_de_patas;
    }
```
La palabra clave extends se usa para generar una subclase (especialización) de un objeto. Un Pato es una subclase de Ave. Cualquier cosa que contenga la definición de Ave será copiada a la clase Pato, además, en Pato se pueden definir sus propios métodos y variables de instancia. Se dice que Pato deriva o hereda de Ave.
Por ejemplo, de la clase aparato con motor y de la clase animal no se puede derivar nada, sería como obtener el objeto toro mecánico a partir de una máquina motorizada (aparato con motor) y un toro (aminal). En realidad, lo que se pretende es copiar los métodos, es decir, pasar la funcionalidad del toro de verdad al toro mecánico, con lo cual no sería necesaria la herencia múltiple sino simplemente la compartición de funcionalidad que se encuentra implementada en Java a través de interfaces.

Subclases

Como ya se ha indicado en múltiples ocasiones en esta sección, cuando se puede crear nuevas clases por herencia de clases ya existentes, las nuevas clases se llaman subclases, mientras que las clases de donde hereda se llaman superclases.

Cualquier objeto de la subclase contiene todas las variables y todos los métodos de la superclase y sus antecesores.

Todas las clases en Java derivan de alguna clase anterior. La clase raíz del árbol de la jerarquía de clases de Java es la clase Object, definida en el paquete java.lang. Cada vez que se desciende en el árbol de jerarquía, las clases van siendo más especializadas.

Cuando se desee que nadie pueda derivar de una clase, se indica que es final; y lo mismo con los métodos, si no se desea que se puedan sobreescribir, se les antepone la palabra clave final.

Lo contrario de final es abstract. Una clase marcada como abstracta, únicamente está diseñada para crear subclases a partir de ella, no siendo posible instanciar ningún objeto a partir de una clase abstracta.

En casos en que se vea involucrada la herencia, los constructores toman un significado especial porque lo normal es que la subclase necesite que se ejecute el constructor de la superclase antes que su propio constructor, para que se inicialicen correctamente aquellas variables que deriven de la superclase. En C++ y Java, la sintaxis para conseguir esto es sencilla y consiste en incluir en el cuerpo del constructor de la subclase como primera línea de código la siguiente sentencia:

```java
  super( parametros_opcionales );
```

Esto hará que se ejecute el constructor de la superclase, utilizando los parámetros que se pasen para la inicialización. 
Esto hará que se ejecute el constructor de la superclase, utilizando los parámetros que se pasen para la inicialización. En el código del ejemplo siguiente, java508.java, se ilustra el uso de esta palabra clase para llamar al constructor de la superclase desde una subclase.

```java 
class SuperClase {
    int varInstancia;
      
    // Es necesario proporcionar el constructor por defecto,que
    // es aquel que no tiene parametros de llamada
    SuperClase(){}
      
    // Este es el constructor parametrizado de la superclase
    SuperClase( int pDato ) {
        System.out.println( 
            "Dentro del constructor de la SuperClase" ); 
        varInstancia = pDato; 
        }
      
    void verVarInstancia() {
        System.out.println( "El Objeto contiene " + varInstancia );
        }
    }
```
```java      
class SubClase extends SuperClase {
    // Este es el constructor parametrizado de la subclase
    SubClase( int bDato ) {    
        // La siguiente sentencia println no compila, la llamada
        // a super() debe estar al principio de un metodo en caso de
        // que aparezca
        // System.out.println( "En el constructor de la SubClase" ); 
      
        // Llamamos al constructor de la superclase
        super( bDato );
        System.out.println( 
            "Dentro del constructor de la SubClase" );
        }
    }
```
```java   
class java508 {
    public static void main( String args[] ) {
        System.out.println( "Lanzando la aplicacion" );
      
        // Instanciamos un objeto de este tipo llamando al
        // constructor de defecto 
        java508 obj = new java508();
        // Llamamos a la funcion pasandole un constructor de la
        // subclase parametrizado como parametro
        obj.miFuncion( new SubClase( 100 ) );
        }
      
        // Esta funcion recibe un objeto y llama a uno de sus metodos
        // para presentar en pantalla el dato que contiene el objeto,
        // en este caso el metodo es heredado de la SuperClase
        void miFuncion( SubClase objeto ) {
            objeto.verVarInstancia();
        }
    }
```
Si super no aparece como primera sentencia del cuerpo de un constructor, el compilador Java inserta una llamada implícita, super(), al constructor de la superclase inmediata. Es decir, el constructor por defecto de la superclase es invocado automáticamente cuando se ejecuta el constructor para una nueva subclase, si no se especifica un constructor parametrizado para llamar al constructor de la superclase.


##### Extends
La instrucción extends indica de qué clase desciende la nuestra. Si se omite,
Java asume que desciende de la superclase [Object.](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
Cuando una clase desciende de otra, significa que hereda sus atributos y sus
métodos. Esto quiere decir que, a menos que los redefinamos, sus métodos serán los
mismos que los de la clase madre y podrán utilizarse en forma transparente, siempre y
cuando no sean privados en la clase madre, o protegidos o propios del paquete para
subclases de otros paquetes.
##### Sobrecarga

Cuando en una clase, se definen un mismo método, con diferente número de parámetros, o bien con el mismo numero de parámetros pero diferenciándose en la definición, en la cual, al menos un parámetro sea de diferente tipo, cuando esto sucede, se dice que el método está sobrecargado.
```java
package com.utn.modelo;

public class Auto extends Vehiculo {

	private boolean luneta;
	
	public Auto(Motor motor) {
		super(motor);
	}

	public Auto(Motor motor, String marca, String modelo) {
		super(motor, marca, modelo);
	}
}

-------------
package com.utn.modelo;

public class Vehiculo {

	private Motor motor;
	private String marca;
	private String modelo;

	public Vehiculo(Motor motor) {
		this.motor = motor;
	}

	public Vehiculo(Motor motor, String marca, String modelo) {
		this.motor = motor;
		this.marca = marca;
		this.modelo = modelo;
	}
}

-------------
package com.utn.modelo;

public class Motor {

	
	private long cc;
	private String combustible;
	private String numSerie;

	// sobre carga de constructor vacio
	public Motor() {
		// TODO Auto-generated constructor stub
	}
	
	public Motor(long cc, String combustible) {
		this.cc = cc;
		this.combustible = combustible;
	}
	
	// sobrecarga de constructores
	// el mismo contrato pero distinta firma
	public Motor(String combustible, long cc) {
		this.cc = cc;
		this.combustible = combustible;
	}
	
	// sobre carga con 2 string
	public Motor(String numMotor, String combustible) {
		this.numSerie = numMotor;
		this.combustible = combustible;
	}

```

##### Clases Public, Final, Abstract
Una clase contiene elementos, llamados miembros, que pueden ser datos, llamados
atributos, y funciones que manipulan esos datos llamados métodos.

Definir una clase como pública (public) significa que puede ser usada por
cualquier clase en cualquier paquete (package) Si no lo es, solamente puede ser
utilizada por clases del mismo paquete (un paquete, básicamente, es un grupo de
Clases e interfaces relacionadas, como los paquetes de biblioteca incluidos con
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

 

##### Constructores
Un Constructor  es una función, método, etc,  de las clases, la cual es llamada automáticamente cuando se crea un objeto de esa clase.
Por ser métodos, los constructores también aceptan parámetros. Cuando en una clase no especificamos ningún tipo de constructor, el compilador añade uno público por omisión sin parámetros, el cual NO hace nada.
##### Características de los Constructores
```
1.Un constructor, tiene el mismo nombre de la clase a la cual pertenece.
2.No puede ser Heredado.
3.No retorna ningún valor (Ni void), por lo cual no debe especificarse ningún tipo de dato.
4.Debe declararse como public, sólo en casos realmente extraordinarios será de otro tipo.
```
-------------

##### Clases
Si la clase es abstracta no podrá ser 
instanciada sino a partir de sus clases derivadas.

-------------

##### Ciclo de Vida de los Objetos
Cuando se ejecuta un programa orientado a objetos ocurren tres sucesos.
1. Los objetos se crean a medida que se necesitan.
2. Los mensajes se mueven de un objeto a otro (o del usuario a un objeto) a medida que el programa procesa información o responde a la entrada del usuario.
3. Cuando los objetos ya no se necesitan, se borran y se libera la memoria.

##### El objeto actual (puntero this)
Nunca se puede llamar una función miembro de una clase a menos que se asocie
con un objeto (una instancia de la clase). ¿Cómo sabe una función miembro cuál es la
instancia de una clase (el objeto específico) asociada con ella?.
El método utilizado por Java es añadir un argumento extra oculto a las
funciones miembro. Este argumento es un puntero al objeto de la clase que los enlaza
con la función asociada y recibe un nombre especial denominado this.
Dentro de una función miembro, this apunta al objeto asociado con la invocación
de la función miembro. Normalmente, el programador no necesita preocuparse por este
puntero, ya que el lenguaje realiza la operación automáticamente transparente a las
funciones miembro que la utilizan.

-------------



##### Sobrescritura 
```java
@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", titular="
				+ titular + "]";
	} 
```



-------------

##### Types of Variable

static variables
se dice que son atributos de clase si se usa la palabra clave static: en ese caso la
variable es única para todas las instancias (objetos) de la clase (ocupa un único lugar en memoria). Cuando usamos “static final” se dice que creamos una constante de clase, un atributo común a todos los objetos de esa clase. 

final: en este contexto indica que una variable es de tipo constante: no admitirá cambios
 después de su declaración y asignación de valor. final determina que un atributo no puede ser sobrescrito o redefinido. O sea: no funcionará como una variable “tradicional”, sino como una constante. 
Toda constante declarada con final ha de ser inicializada en el mismo momento de
 declararla. final también se usa como palabra clave en otro contexto: una clase final (final) es aquella que no puede tener clases que la hereden.

##### Control de Acceso

El control de acceso también tiene un significado especial cuando se trata de constructores. Aunque en otra sección se trata a fondo el tela del control de acceso en Java, con referencia a los constructores se puede decir que el control de acceso que se indique determina la forma en que otros objetos van a pode instanciar objetos de la clase. En la siguiente descripción, se indica cómo se trata el control de acceso cuando se tienen entre manos a los constructores:

1. private
Ninguna otra clase puede instanciar objetos de la clase. La clase puede contener métodos públicos, y estos métodos pueden construir un objeto y devolverlo, pero nadie más puede hacerlo.
2. protected
Solamente las subclases de la clase pueden crear instancias de ella.
3. public
Cualquier otra clase puede crear instancias de la clase.
-------------

##### Patrones de diseño 
GOF patrones de diseño 
Singleton patrones de diseño 

Modelo: Esta capa representa todo lo que tiene que ver con el acceso a datos: guardar, actualizar, obtener datos, además todo el código de la lógica del negocio, básicamente son las clases Java y parte de la lógica de negocio.
Clases : "Cuenta.java Persona.java"
Vista: La vista tiene que ver con la presentación de datos del modelo y lo que ve el usuario, por lo general una vista es la representación visual de un modelo (POJO o clase java). Clase : "Test.java"
Por ejemplo el modelo usuario que es una clase en Java y que tiene como propiedades, nombre y apellido debe pertenecer a una vista en la que el usuario vea esas propiedades.
Controlador: El controlador es el encargado de conectar el modelo con las vistas, funciona como un puente entre la vista y el modelo, el controlador recibe eventos generados por el usuario desde las vistas y se encargar de direccionar al modelo la petición respectiva. Clase : "Contenedor.java" 
Por ejemplo el usuario quiere ver los clientes con apellido Álvarez, la petición va al controlador y el se encarga de utilizar el modelo adecuado y devolver ese modelo a la vista.
Si te das cuenta en ningún momento interactúan directamente la vista con el modelo, esto también mantiene la seguridad en una aplicación.

##### ArrayList

ArrayList en Java, es una clase que permite almacenar datos en memoria de forma similar a los Arrays, con la ventaja de que el numero de elementos que almacena, lo hace de forma dinámica, es decir, que no es necesario declarar su tamaño como pasa con los Arrays.

Métodos para trabajar con los ArrayList son los siguientes:
// Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
```java
ArrayList<String> nombreArrayList = new ArrayList<String>();// Añade el elemento al ArrayList
nombreArrayList.add("Elemento");// Añade el elemento al ArrayList en la posición 'n'
nombreArrayList.add(n, "Elemento 2");// Devuelve el numero de elementos del ArrayList
nombreArrayList.size();// Devuelve el elemento que esta en la posición '2' del ArrayList
nombreArrayList.get(2);// Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
nombreArrayList.contains("Elemento");// Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
nombreArrayList.indexOf("Elemento");// Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
nombreArrayList.lastIndexOf("Elemento");// Borra el elemento de la posición '5' del ArrayList   
nombreArrayList.remove(5);// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
nombreArrayList.remove("Elemento");//Borra todos los elementos de ArrayList   
nombreArrayList.clear();// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
nombreArrayList.isEmpty(); // Copiar un ArrayList 
ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();// Pasa el ArrayList a un Array 
Object[] array = nombreArrayList.toArray();// Pasa el ArrayList a un Array 
```
##### Controller Clase ClubController 

```java
package edu.utn.controller;
import java.util.ArrayList;
import edu.utn.model.Club;

public class ClubController {
	private ArrayList<Club> listaClubes;

	public ClubController() {
		this.listaClubes = new ArrayList<Club>();
	}

	public ArrayList<Club> getListaClubes() {
		return listaClubes;
	}

	public void addClub(Club club) {
		this.listaClubes.add(club);
	}	
}
```
##### ForEach
```java
for (Jugador jugador : club1.getListaJugadores()) {
			System.out.println(jugador);
		}
```
