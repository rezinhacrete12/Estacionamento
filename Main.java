package estacionamentoVFinal;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Menu do Estacionamento");
			System.out.println("[1] cadastrar carro");
			System.out.println("[2] listar carros");
			System.out.println("[3] listar vagas");
			System.out.println("[4] encerrar carro");
			System.out.println("[5] Sair");
			
			System.out.print("opcao: ");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
				Scanner registro_marca = new Scanner(System.in);
				System.out.println("Digite a marca: ");
				String novamarca = registro_marca.nextLine();
				
				Scanner registro_modelo = new Scanner(System.in);
				System.out.println("Digite o modelo: ");
				String novomodelo = registro_modelo.nextLine();
				
				
			case 2:
				Modelo modelo = new Modelo("Corsa");
				Modelo modelo1 = new Modelo("Civic");

				Marca.addModelo(modelo);
				Marca.addModelo(modelo1);

				Marca marca = new Marca(modelo,"Chevrolet");
				Marca marca1 = new Marca(modelo1,"Honda");

				Marca.addMarca(marca);
				Marca.addMarca(marca1);

				Marca.listarMarcas();
				Marca.listarModelos();
			
			case 5:
				System.exit(0);
			
			default:
				System.out.println("Opcao inexistente!");
				break;
			}
		} while (opcao!=0);
			
				
			
				
			}
		

	}
