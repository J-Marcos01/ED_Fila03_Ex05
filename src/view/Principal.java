package view;

import br.edu.fateczl.fila.Fila;
import controller.ParqueController;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		Fila<Pessoa> fila = new Fila<>();
		
		for(int i=1;i<31;i++)
		{
			Pessoa pessoa = new Pessoa(); 
			pessoa.setNome("Pessoa "+i);
			pessoa.setIdade((int)((Math.random()*31)+10));
			pessoa.setAltura((float) ((Math.random()*0.66)+1.35));
			fila.insert(pessoa);
		}
		ParqueController parque = new ParqueController();
		
		parque.brinquedo(fila);
	}

}
