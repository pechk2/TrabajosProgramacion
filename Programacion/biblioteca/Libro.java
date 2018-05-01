

public class Libro {
	private String titulo;
	private String escritor;
	private String categoria;
	private String editorial;
	private String edicion;
	private String ISBN;
	private int cantidad = 0;
	private int cantidadPrestados = 0;

	//Método constructor mediante título
	public Libro(String titulo) {
		this.titulo = titulo;

	}

	//Método constructor de campo completo.
	public Libro(String titulo, String escritor, String categoria, String editorial, String edicion, String ISBN, int cantidad) {

		this.titulo = titulo;
		this.escritor = escritor;
		this.categoria = categoria;
		this.editorial = editorial;
		this.edicion = edicion;
		this.ISBN = ISBN;

		this.cantidad = cantidad;

	}

	//Obtenedores y Establecedores. Getters and Setters.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEscritor() {
		return escritor;
	}

	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}




	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad += cantidad;
	}









	public int getCantidadPrestados() {
		return cantidadPrestados;
	}

	public void setCantidadPrestados(int cantidadPrestados) {
		this.cantidadPrestados += cantidadPrestados;
	}

	public String toString() {
		return "Libro [titulo=" + titulo + ", escritor=" + escritor + ", categoria=" + categoria + ", editorial="
				+ editorial + ", edicion=" + edicion + ", ISBN=" + ISBN + ", cantidad=" + cantidad
				+ ", cantidadPrestados=" + cantidadPrestados +  "]";
	}








}
