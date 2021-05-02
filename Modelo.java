package estacionamentoVFinal;


public class Modelo{

	private String nomeModelo;


	public String getNomeModelo() {
		return nomeModelo;
	}

	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}

	public Modelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}

	public Modelo(Modelo modelo) {
		this.nomeModelo = modelo.nomeModelo;
	}

	@Override
	public String toString() {
		return
				"Modelo: " + nomeModelo;
	}
}