package br.com.isiflix.salutar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_midia")
public class Midia {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer numseq;
	
	@Column(name = "descricao", length = 255)
	private String descricao;
	@Id
	
	@Column(name = "link_midia", length = 255)
	private String linkMmidia;
	
	@ManyToOne
	@JoinColumn(name = "id_ficha")
	@JsonIgnoreProperties("midias")
	private FichaPaciente idFicha;
	
	//GET E SET
	
	public Integer getNumseq() {
		return numseq;
	}

	public void setNumseq(Integer numseq) {
		this.numseq = numseq;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLinkMmidia() {
		return linkMmidia;
	}

	public void setLinkMmidia(String linkMmidia) {
		this.linkMmidia = linkMmidia;
	}

	public FichaPaciente getIdFicha() {
		return idFicha;
	}

	public void setIdFicha(FichaPaciente idFicha) {
		this.idFicha = idFicha;
	}
	
	
}
