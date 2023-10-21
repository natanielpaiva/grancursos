package exemplo;

public class Lista {
	String[] lista = {"Lila", "Antonio", "Clara","Miguel", "João", "Ariane", "Ana"};
	
	public boolean buscar(String nome) {
		for (String aux : lista) {
			if(aux.equals(nome)) {
				return true;
			}
		}
		return false;
	}
}
