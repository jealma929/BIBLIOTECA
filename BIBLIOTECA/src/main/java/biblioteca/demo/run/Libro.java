package biblioteca.demo.run;

public class Libro {
	
	private int isbn;
	private String titulo;
	private String autor;
	private int edicion;
		
	public void darAltaInventario (int i, String t, String a, int e) {
		// metodo utilizado para dar de alta un libro en el inventario
		//como argumentos le tengo que pasar todos los datos del libro
	}
	
	public void darBajaInventario (int i) {
		// metodo utilizado para dar de alta un libro en el inventario
		// como argumento le paso el isbn que es l identificador del libro en DB
	}

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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

}
