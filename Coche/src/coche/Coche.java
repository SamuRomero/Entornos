package coche;

public class Coche {
	private int id;
	private String matricula;
	private String modelo;
	private String marca;
	private int km;
	private String AtributoNuevo;
	
	public String getAtributoNuevo() {
		return AtributoNuevo;
	}
	public void setAtributoNuevo(String atributoNuevo) {
		AtributoNuevo = atributoNuevo;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Coche(int id, String matricula, String modelo, String marca, int km) {
		this.id = id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.km = km;
	}

	

}
