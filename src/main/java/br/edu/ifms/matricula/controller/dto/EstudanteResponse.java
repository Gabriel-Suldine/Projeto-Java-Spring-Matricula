package br.edu.ifms.matricula.controller.dto;

import java.time.Instant;
import java.util.UUID;

public class EstudanteResponse {
	private String nome;
	private String cpf;
	private String email;
	private UUID id;
	private Instant dtCadastro;
	private Instant dtAtualizacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Instant getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Instant dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Instant getDtAtualizacao() {
		return dtAtualizacao;
	}

	public void setDtAtualizacao(Instant dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

}
