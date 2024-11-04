package br.com.fiap.beans;

public class Veiculos {

	private String placa;
	private String modelo;
	private int ano;
	private String kilometragem;
	private String sintomas;
	private Cliente cpf; // importando o 'Codigo Cliente' com o cpf

	// vazio
	public Veiculos() {
		super();
	}

	// cheio
	public Veiculos(String placa, String modelo, int ano, String kilometragem, String sintomas, Cliente cpf) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.kilometragem = kilometragem;
		this.sintomas = sintomas;
		this.cpf = cpf;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(String kilometragem) {
		this.kilometragem = kilometragem;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public Cliente getCpf() {
		return cpf;
	}

	public void setCpf(Cliente cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Veiculos [placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + ", kilometragem=" + kilometragem
				+ ", sintomas=" + sintomas + ", cpf=" + cpf + "]";
	}

}