package biblioteca.demo.run;

public class Libro {	//los nombre de las clases empiezan por mayusculas
	
	private int isbn;
	private String titulo;
	private String autor;
	private int edicion;		
	
	// los set y los get se forman clicando dos veces sobre el nombre del metodo en la definicion
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	//defino con public o private -- tipo dato -- nombre del metodo -- datos que se pasan al metodo
	public String getAutor() {	//devuelve un string, el valor del atributo autor de la clase libro
		return autor;
	}							// define el campo del metodo, inicio y final

	public void setAutor(String autor) {
		this.autor = autor;		// asigna el valor que le paso al atributo del metodo cuando lo invoco
	}

	public int getEdicion() { 	// el metodo get devuelve el valor del atributo edicion de la clase libro
		return edicion;			// al ser publico se puede invocar desde fuera de la clase
	}							// al definir el metodo me tiene que devolver un tipo int
								//porque esta definido como entero
	public void setEdicion(int edicion) {	// a este metodo le pasamos parametros y el tipo de retorno es vacio
		this.edicion = edicion;				// no hace falta poner la sentencia return.
	}										//asigna al atributo edicion el valor que le paso como argumento en la
											//llamada metodo
}

// como minimo en cada programa de java tiene que existir una entidad que nos permita comunicarnos con la BD