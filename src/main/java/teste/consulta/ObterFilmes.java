package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class ObterFilmes {

	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		// List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);
		//List<Filme> filmes = dao.consultar("obterFilmesComNotaIgual", "nota", 7.5);
		
		List<Filme> filmes = dao.consultar("ObterFilmesComNotaMenorQue", "nota", 10D);
		
		for(Filme filme : filmes) {
			System.out.println("Filme:");
			System.out.println(filme.getNome() + " -> " + filme.getNota());
			
			System.out.println("Atores:");
			for(Ator ator : filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}
}
