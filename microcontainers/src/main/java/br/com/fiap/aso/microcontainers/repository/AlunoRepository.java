package br.com.fiap.aso.microcontainers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.aso.microcontainers.modelo.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}