package br.com.fiap.beans;

public class Oficina {

	private String nomeOficina;
	private String telefone;
	private Endereco endereco;

	// vazio
	public Oficina() {
		super();
	}

	// cheio
	public Oficina(String nomeOficina, String telefone, Endereco endereco) {
		super();
		this.nomeOficina = nomeOficina;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNomeOficina() {
		return nomeOficina;
	}

	public void setNomeOficina(String nomeOficina) {
		this.nomeOficina = nomeOficina;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Oficina [nomeOficina=" + nomeOficina + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}

}
