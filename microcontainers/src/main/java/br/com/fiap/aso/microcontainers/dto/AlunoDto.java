package br.com.fiap.aso.microcontainers.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.fiap.aso.microcontainers.modelo.Aluno;

public class AlunoDto {

	private Long rm;
	private String nome;
	private String email;

	public AlunoDto(Aluno aluno) {
		this.rm = aluno.getRm();
		this.nome = aluno.getNome();
		this.email = aluno.getEmail();
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

	public static List<AlunoDto> converter(List<Aluno> alunos) {
		return alunos.stream().map(AlunoDto::new).collect(Collectors.toList());
	}
}