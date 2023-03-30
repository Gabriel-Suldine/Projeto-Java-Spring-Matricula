package br.edu.ifms.matricula.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

public class EstudanteRequest {
	@Size(max = 80, message = "informe o nome completo")
	@NotBlank(message = "O campo nome não pode ser vazio")
	private String nome;
	
	@NotBlank(message = "O campo CPF não pode ser vazio")
	@Size(min = 11, max=11)
	private String cpf;
	
	@NotBlank(message = "O campo Email não pode ser vazio")
	@Size(max = 150, message = "informe um endereço de email")
	@Email
	
	private String email;
	@NotBlank(message = "O campo Senha não pode ser vazio")
	@Size(max = 50, message = "informe uma senha com até 50 caracteres")
	private String senha;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
