package estacionamentoVFinal;


import java.util.ArrayList;

public class Marca extends Modelo{

	private String nome;
	private static ArrayList<Marca> listaMarcas = new ArrayList<Marca>();
	private static ArrayList<Modelo> listaModelo = new ArrayList<Modelo>();


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void addModelo(Modelo modelo){
		listaModelo.add(modelo);
	}

	public static void listarModelos(){
		for (Modelo i : listaModelo) {
			System.out.println(i);
		}
	}

	public static void addMarca(Marca marca){
		listaMarcas.add(marca);
	}

	public static void listarMarcas(){
		for (Marca i : listaMarcas) {
			System.out.println(i);
		}
	}

	public Marca(Modelo modelo, String nome) {
		super(modelo);
		this.nome = nome;
	}

	@Override
	public String toString() {
		return
				"Marca: " + nome + ". " + super.toString();
	}
}