package ar.com.arquitectura.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	private String password;
	private Boolean adm;
	
	@OneToMany(mappedBy="usuario")
	private List<Imagenes> imagenes = new ArrayList<>();
	
	@OneToMany(mappedBy="usuario")
	private List<Contacto> contacto = new ArrayList<>();
	
	public Usuario(){}

	public Usuario(Long id, String email, String password, Boolean adm, List<Imagenes> imagenes,List<Contacto> contacto) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.adm = adm;
		this.imagenes = imagenes;
		this.contacto = contacto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAdm() {
		return adm;
	}

	public void setAdm(Boolean adm) {
		this.adm = adm;
	}

	public List<Imagenes> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<Imagenes> imagenes) {
		this.imagenes = imagenes;
	}

	public List<Contacto> getContacto() {
		return contacto;
	}

	public void setContacto(List<Contacto> contacto) {
		this.contacto = contacto;
	}
	
	
	
}
