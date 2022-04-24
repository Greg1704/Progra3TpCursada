package atributosFormularios;

public class CargaHoraria {
	private String cargaHoraria;
	private int peso;
	
	public CargaHoraria(String cargaHoraria,int peso) {
		this.cargaHoraria = cargaHoraria;
		this.peso = peso;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	

}
