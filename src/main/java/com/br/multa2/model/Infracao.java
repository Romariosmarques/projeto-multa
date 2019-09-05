package com.br.multa2.model;

public class Infracao {

	private int id;
	private String propritario;
	private String cpf;
	private String cod_renavan;
	private String num_placa;
	private String marcamodelo;
	private String municipio;
	private String infracao;
	private String data_infracao;
	private String hora_infracao;
	private String valor_infracao;
	private String situacao_multa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPropritario() {
		return propritario;
	}

	public void setPropritario(String propritario) {
		this.propritario = propritario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCod_renavan() {
		return cod_renavan;
	}

	public void setCod_renavan(String cod_renavan) {
		this.cod_renavan = cod_renavan;
	}

	public String getNum_placa() {
		return num_placa;
	}

	public void setNum_placa(String num_placa) {
		this.num_placa = num_placa;
	}

	public String getMarcamodelo() {
		return marcamodelo;
	}

	public void setMarcamodelo(String marcamodelo) {
		this.marcamodelo = marcamodelo;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getInfracao() {
		return infracao;
	}

	public void setInfracao(String infracao) {
		this.infracao = infracao;
	}

	public String getData_infracao() {
		return data_infracao;
	}

	public void setData_infracao(String data_infracao) {
		this.data_infracao = data_infracao;
	}

	public String getHora_infracao() {
		return hora_infracao;
	}

	public void setHora_infracao(String hora_infracao) {
		this.hora_infracao = hora_infracao;
	}

	public String getValor_infracao() {
		return valor_infracao;
	}

	public void setValor_infracao(String valor_infracao) {
		this.valor_infracao = valor_infracao;
	}

	public String getSituacao_multa() {
		return situacao_multa;
	}

	public void setSituacao_multa(String situacao_multa) {
		this.situacao_multa = situacao_multa;
	}

}
