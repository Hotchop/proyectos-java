=======> IMPLEMENTACION DE CLASE PARA LA PERSISTENCIA DE DATOS EN ARCHIVOS !

El archivo FilePersistence es una clase de tipo Abstracta y Genérica que contiene 
2 métodos que no hace falta implementar ni modificar en absoluto. 

COMO SE COMPONE DE SOLO 2 METODOS:
=====================================================================================

void WriteIntoFile( List<T> objectArray, String fileName)

	Método para escribir en un archivo, abstrayéndose del tipo de dato o tipos de 
	datos que contiene el objectArray.

	ObjectArray: Listado de cualquier tipo de objeto a guardar.
       	fileName nombre del archivo (NO RUTA NI PATH, Solo nombre)

=====================================================================================

List<T> ReadFromFile (String fileName)
       	Método que retorna una Lista de Objetos de cualquier Tipo (No hace falta indicar el Tipo)
	Solo con un Cast se obtiene la lista completa.

	fileName nombre del archivo [NO RUTA NI PATH, Solo nombre]

Por ejemplo:
	List<Person> list = (ArrayList<Person>) exampleFile.ReadFromFile("Persons");
      
=====================================================================================

****************************   IMPORTANTE   ****************************

PARA PODER IMPLEMENTAR ES NECESARIO QUE LAS CLASES QUE ESPERAMOS SEAN PERSISTIDAS,
CONTENGAN LA IMPLEMENTACION DE LA INTERFACE SERIALIZABLE (implements Serializable)
SIN NADA QUE REDEFINIR, SOLO A MODO DE ANOTACION PARA QUE LA CLASE SE ENCARGUE DE 
PERSISTIRLO CORRECTAMENTE.



ESPERO LES SIRVA, CUALQUIER COSA NO DUDEN EN CONSULTAR.

SEBASTIAN, SALUDOS.

