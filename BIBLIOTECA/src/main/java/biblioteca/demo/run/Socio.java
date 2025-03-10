package biblioteca.demo.run;

public class Socio {
	
	private int numSocio;
	private String fechaNac;
	private String nombreCompleto;
	private int trabajador;
	private String masInfor;
	
	// hacemos los set y los get de los atributos de la clase.
	public int getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
		public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	public int getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(int trabajador) {
		this.trabajador = trabajador;
	}
	
	public String getMasInfor() {
		return masInfor;
	}
	public void setMasInfor(String masInfor) {
		this.masInfor = masInfor;
	}	
}
