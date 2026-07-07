package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Main {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		//Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		//Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // serve para instanciar o EntityManager passando a persistencia
		EntityManager em = emf.createEntityManager(); // faz a conexão e acesso a dados
		
		Pessoa p = em.find(Pessoa.class, 2); // função que busca o objeto pelo id
		System.out.println(p);
		
		em.getTransaction().begin();
		em.remove(p); // remover dado da tabela
		em.getTransaction().commit();
		//em.getTransaction().begin(); // iniciar uma nova trasação
		// persistir dados
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		//em.getTransaction().commit(); // confirmar as auterações
		
		
		System.out.println("Pronto! ");
		em.close();
		emf.close();
	}

}
