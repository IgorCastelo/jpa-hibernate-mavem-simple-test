package dominio;

import java.io.Serializable;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
@Entity
public class Pessoa implements Serializable { 
	private static final long serialVersionUID = 1L; 
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id; 
	//@Column(name = "nomecompleto")
	private String nome; 
	private String email;
	
	
	public Pessoa() {
		
	}
	
	

	public Pessoa(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}



	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	} 
	
	
	

}
