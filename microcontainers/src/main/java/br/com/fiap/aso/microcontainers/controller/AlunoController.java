package br.com.fiap.aso.microcontainers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.aso.microcontainers.dto.AlunoDto;
import br.com.fiap.aso.microcontainers.modelo.Aluno;
import br.com.fiap.aso.microcontainers.repository.AlunoRepository;

@RestController
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;

	@RequestMapping("/")
	public String home() {
		return "Bem vindo a API Java com acesso ao BD MySQL - FIAP 50ASO: Microcontainers";
	}

	@GetMapping("/alunos")
	public List<AlunoDto> findAll() {
		List<Aluno> alunos = alunoRepository.findAll();
		return AlunoDto.converter(alunos);
	}
}