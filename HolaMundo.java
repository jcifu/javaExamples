/*
*** Creando mi primera clase Java ***
En la programación orientada a objetos (POO en inglés), una clase es una plantilla para crear un objeto.
Dentro de la clase se especifica el código (formado por atributos y métodos) para que ésta funcione.
Por convención, una clase debe nombrarse iniciando con Mayúsculas y su contenido se encierra entre llaves ({ }).

Por ejemplo: MiClase.java (verifica que el nombre sea igual que el nombre del archivo que has creado o no funcionará)

Otra buena práctica es usar la nomenclatura camelCase. También puedes usar snake_case pero no podrás nombrar

*** Métodos ***
Un método es una función programable, que puede exigir o no una entrada de datos. Piensa en una función matemática como 
		
		f(x) = x + 1 

Esta función necesita un parámetro x, el cual puede tomar cualquier valor. Sin embargo también podría ser así:
		
		f(x) = 25

En este caso, la función no requiere un parámetro de entrada. Lo mismo sucede con los métodos.

		public static void main (String[] args){  

		... contenido

		}

En java existen métodos predefinidos por el lenguaje para facilitar la programación. Por ejemplo println(), te permite
imprimir un mensaje en la consola. Este metodo está incluido en la clase System (por ello es una palabra reservada
y no la podrás ocupar libremente)  
		 
		System.out.println("Holaaaaaaa");
		Entonces este método imprimirá lo que está entre comillas "" en la consola. O sea, imprimirá Holaaaaaaa 

*** Método Main ***
Además para que esta clase se ejecute necesita un método principal, llamado main y se escribe tal cual como se
describe a continuación. Este método recibe cadenas de texto (de tipo String). Apréndela de memoria.

*** Atributos ***
Un atributo o parámetro es un dato variable que contiene información del objeto. Por ejemplo el nombre de una persona

		String nombre = "Javier";

Ahora, corre la aplicación y ve lo que pasa. Luego modifica los datos y ejecutala nuevamente. Puedes ir comentando tu 
código usando

	 	// para comentarios de una línea, 

		o de la manera en que comento todo este texto utilizando /* 

*/

public class HolaMundo {
	public static void main (String[] args){
		
		String nombre="Javier";

		System.out.println("Hola Mundo! Mi nombre es "+ nombre + " y estoy aprendiendo a programar en Java");
		
	}
}