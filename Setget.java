package minis;

public class Setget {

	int id,an,pas;
	float prec,peso;
	String marca,modelo,motor,transmision,dimensiones,combus,
	rendimiento,suspenciones,neumaticos,seguridad,tecnologia;
	
	
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	public int getPas() {
		return pas;
	}
	public void setPas(int pas) {
		this.pas = pas;
	}
	public float getPrec() {
		return prec;
	}
	public void setPrec(float prec) {
		this.prec = prec;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getTransmision() {
		return transmision;
	}
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	public String getCombus() {
		return combus;
	}
	public void setCombus(String combus) {
		this.combus = combus;
	}
	public String getRendimiento() {
		return rendimiento;
	}
	public void setRendimiento(String rendimiento) {
		this.rendimiento = rendimiento;
	}
	public String getSuspenciones() {
		return suspenciones;
	}
	public void setSuspenciones(String suspenciones) {
		this.suspenciones = suspenciones;
	}
	public String getNeumaticos() {
		return neumaticos;
	}
	public void setNeumaticos(String neumaticos) {
		this.neumaticos = neumaticos;
	}
	public String getSeguridad() {
		return seguridad;
	}
	public void setSeguridad(String seguridad) {
		this.seguridad = seguridad;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	
	
	data dc=null;
	
	public Setget() {
		dc=new data();
	}
	
	
	
	public data getDc() {



		return dc;



	}
	public void setDc(data dc) {



		this.dc = dc;



	}
	
	
	
	
	
	public boolean consult() {
		if (dc.consultarUsuari(this)) {
			return true;
		} else {
			return false;
		}
	}

	
	
	
	
	
	
	
	
}
