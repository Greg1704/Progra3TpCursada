package atributosFormularios;

public class EstudiosCursados {
	private String estudiosCursados;
	private int peso;
	
	public EstudiosCursados(String estudiosCursados,int peso) {
		this.estudiosCursados = estudiosCursados;
		this.peso = peso;
	}

	public String getEstudiosCursados() {
		return estudiosCursados;
	}

	public void setEstudiosCursados(String estudiosCursados) {
		this.estudiosCursados = estudiosCursados;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
}
