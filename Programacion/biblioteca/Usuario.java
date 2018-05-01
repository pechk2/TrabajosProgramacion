





	public class Usuario {

		private String nombre;
		private String apellidos;
		private String direccion;
		private String telefono;
		private String DNI;





		//Método constructor mediante el nombre únicamente
		public Usuario(String nombre) {

			this.nombre = nombre;


		}

		//Método constructor con completado de campos.
		public Usuario(String nombre, String apellidos, String direccion, String telefono, String dNI) {

			this.nombre = nombre;
			this.apellidos = apellidos;
			this.direccion = direccion;
			this.telefono = telefono;
			this.DNI = dNI;


		}

		//Getter and Setters. Obtenedores y Establecedores.
		public String getNombre() {

			return nombre;
		}


		public void setNombre(String nombre) {

			this.nombre = nombre;
		}


		public String getApellidos() {

			return apellidos;
		}


		public void setApellidos(String apellidos) {

			this.apellidos = apellidos;
		}


		public String getDireccion() {

			return direccion;
		}


		public void setDireccion(String direccion) {

			this.direccion = direccion;
		}


		public String getTelefono() {

			return telefono;
		}


		public void setTelefono(String telefono) {

			this.telefono = telefono;
		}


		public String getDNI() {

			return DNI;
		}


		public void setDNI(String dNI) {

			this.DNI = dNI;
		}




		
		public String toString() {
			return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefono="
					+ telefono + ", DNI=" + DNI +  "]";
		}











	}
