import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome que deseja encontrar:");
		String nome = in.nextLine();
		Lista l = new Lista();
		System.out.println(l.buscar(nome) ? "Achou" : "Não Achou");
		in.close();
	}
}
