package teste;

import java.beans.PersistenceDelegate;

import dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class programaTeste01 {

	public static void main(String[] args) {
		/*Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com"); 
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com"); 
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com"); 
		*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		/*em.persist(p1);
		em.persist(p2);   ADICIONA/UPDATE os objetos na tabela
		em.persist(p3);*/
		/*Pessoa p = em.find(Pessoa.class, 2);// MOSTRA/GET o objeto de Id: 2 da tabela "Pessoa"
		System.out.println(p);*/
		Pessoa p = em.find(Pessoa.class, 1);
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto!");
	}

}
