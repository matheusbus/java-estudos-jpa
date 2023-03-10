package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		Usuario usuario = em.find(Usuario.class, 1L);
		System.out.println(usuario);
		usuario.setUsername("Matheus Arruda");
		
		em.getTransaction().begin();
		
		//em.merge(usuario); Altera mesmo sem chamar o método merge
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
	}
	
}
