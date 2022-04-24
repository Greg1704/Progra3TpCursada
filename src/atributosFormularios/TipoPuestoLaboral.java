package atributosFormularios;

public class TipoPuestoLaboral {
	private String tipoPuestoLaboral;
	private int peso;
	
	public TipoPuestoLaboral(String tipoPuestoLaboral,int peso) {
		this.tipoPuestoLaboral = tipoPuestoLaboral;
		this.peso = peso;
	}

	public String getTipoPuestoLaboral() {
		return tipoPuestoLaboral;
	}

	public void setTipoPuestoLaboral(String tipoPuestoLaboral) {
		this.tipoPuestoLaboral = tipoPuestoLaboral;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
