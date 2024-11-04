package br.com.fiap.beans;

public class Agendamento {

	private String idAgendamento;
	private String data;
	private String tipo;
	private String codigoOficina;
	private String placa;

	// vazio
	public Agendamento() {
		super();
	}

	// cheio
	public Agendamento(String idAgendamento, String data, String tipo, String codigoOficina, String placa) {
		super();
		this.idAgendamento = idAgendamento;
		this.data = data;
		this.tipo = tipo;
		this.codigoOficina = codigoOficina;
		this.placa = placa;
	}

	public String getIdAgendamento() {
		return idAgendamento;
	}

	public void setIdAgendamento(String idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigoOficina() {
		return codigoOficina;
	}

	public void setCodigoOficina(String codigoOficina) {
		this.codigoOficina = codigoOficina;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Agendamento [idAgendamento=" + idAgendamento + ", data=" + data + ", tipo=" + tipo + ", codigoOficina="
				+ codigoOficina + ", placa=" + placa + "]";
	}

}
