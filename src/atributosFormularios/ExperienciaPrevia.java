package atributosFormularios;

public class ExperienciaPrevia {
	private String experienciaPrevia;
	private int peso;
	
	public ExperienciaPrevia(String experienciaPrevia,int peso) {
		this.experienciaPrevia = experienciaPrevia;
		this.peso = peso;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
