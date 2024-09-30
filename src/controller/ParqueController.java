package controller;
import br.edu.fateczl.fila.Fila;
import model.Pessoa;
public class ParqueController {

	public ParqueController() {
		super();
	}
	public void brinquedo(Fila<Pessoa>fila)
	{
		while (!fila.isEmpty()) {
			try {
				Pessoa p = fila.remove();
				if(p.getAltura() >= 1.60 && p.getIdade() >= 16) {
					System.out.println(p.getNome() + " passou para dentro do brinquedo. Idade: " + p.getIdade() + ", Altura: " + p.getAltura());
				} else if (p.getAltura() < 1.60 && p.getIdade() < 16) {
					System.out.println(p.getNome() + " não pôde entrar por não ter a altura nem a idade necessária. Idade: " + p.getIdade() + ", Altura: " + p.getAltura());
				} else if (p.getIdade() < 16) {
					System.out.println(p.getNome() + " não pôde entrar por não ter a idade necessária. Idade: " + p.getIdade());					
				} else {
					System.out.println(p.getNome() + " não pôde entrar por não ter a altura necessária. Altura: " + p.getAltura());
				}
				System.out.println();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

		}
		
	}
}
