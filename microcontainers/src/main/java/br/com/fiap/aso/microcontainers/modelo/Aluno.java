package br.com.fiap.aso.microcontainers.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {

	@Id
	private Long rm;

	private String nome;

	private String email;

	public Aluno() {
	}

	public Aluno(Long rm, String nome, String email) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rm == null) ? 0 : rm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (rm == null) {
			if (other.rm != null)
				return false;
		} else if (!rm.equals(other.rm))
			return false;
		return true;
	}

	public Long getRm() {
		return rm;
	}

	public void setRm(Long rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}