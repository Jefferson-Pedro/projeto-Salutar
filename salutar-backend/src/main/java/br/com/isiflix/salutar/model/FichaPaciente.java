package br.com.isiflix.salutar.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_fichapaciente")
public class FichaPaciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ficha", nullable=false)
	private Integer idFicha;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nomePaciente;
	
	@Column(name = "data_nasc", length = 100)
	private LocalDate dataNasc;
	
	@Column(name = "sexo", length = 1)
	private String sexo;
	
	@Column(name = "cep", length = 10)
	private String cep;
	
	@Column(name = "endereco", length = 100)
	private String endereco;
	
	@Column(name = "complemento", length = 45)
	private String numComplemento;
	
	@Column(name = "cidade", length = 45)
	private String cidade;
	
	@Column(name = "estado", length = 2)
	private String estado;
	
	@Column(name = "ocupacao", length = 45)
	private String ocupacao;
	
	@Column(name = "diagnostico_clinico", columnDefinition = "TEXT")
	private String diagnosticoClinico;
	
	@Column(name = "queixa_principal", columnDefinition = "TEXT")
	private String queixaPrincipal;
	
	@Column(name = "hmp_hma", columnDefinition = "TEXT")
	private String hmpHma;
	
	@Column(name = "medicacoes", columnDefinition = "TEXT")
	private String medicacoes;
	
	@Column(name = "exames_complementares", columnDefinition = "TEXT")
	private String exameComplementares;
	
	@Column(name = "exame_fisico", columnDefinition = "TEXT")
	private String exameFisico;
	
	@Column(name = "conduta_clinica", columnDefinition = "TEXT")
	private String condutaClinica;
	
	@Column(name = "diagnostico", columnDefinition = "TEXT")
	private String diagnostico;
	
	@Column(name = "uuId", length = 45)
	private String uuId;
	
	@Column(name = "link_foto", length = 255)
	private String linkDaFoto;
	
	@Column(name = "ativo", length = 1)
	private int ativo;
	
	
	//GET E SET

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	public Integer getIdFicha() {
		return idFicha;
	}

	public void setIdFicha(Integer idFicha) {
		this.idFicha = idFicha;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumComplemento() {
		return numComplemento;
	}

	public void setNumComplemento(String numComplemento) {
		this.numComplemento = numComplemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	public String getDiagnosticoClinico() {
		return diagnosticoClinico;
	}

	public void setDiagnosticoClinico(String diagnosticoClinico) {
		this.diagnosticoClinico = diagnosticoClinico;
	}

	public String getQueixaPrincipal() {
		return queixaPrincipal;
	}

	public void setQueixaPrincipal(String queixaPrincipal) {
		this.queixaPrincipal = queixaPrincipal;
	}

	public String getHmpHma() {
		return hmpHma;
	}

	public void setHmpHma(String hmpHma) {
		this.hmpHma = hmpHma;
	}

	public String getMedicacoes() {
		return medicacoes;
	}

	public void setMedicacoes(String medicacoes) {
		this.medicacoes = medicacoes;
	}

	public String getExameComplementares() {
		return exameComplementares;
	}

	public void setExameComplementares(String exameComplementares) {
		this.exameComplementares = exameComplementares;
	}

	public String getExameFisico() {
		return exameFisico;
	}

	public void setExameFisico(String exameFisico) {
		this.exameFisico = exameFisico;
	}

	public String getCondutaClinica() {
		return condutaClinica;
	}

	public void setCondutaClinica(String condutaClinica) {
		this.condutaClinica = condutaClinica;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getUuId() {
		return uuId;
	}

	public void setUuId(String uuId) {
		this.uuId = uuId;
	}

	public String getLinkDaFoto() {
		return linkDaFoto;
	}

	public void setLinkDaFoto(String linkDaFoto) {
		this.linkDaFoto = linkDaFoto;
	}

}
