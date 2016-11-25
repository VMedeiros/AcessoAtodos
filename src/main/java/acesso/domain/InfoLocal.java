package acesso.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class InfoLocal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String nome;
	private String endereco;
	private String telefone;
	private String localizacao; 
	private String tipos;
	private String acessibilidade;
	private String url;
	private String website;
	private String icone;
	private String status;
	
	
	public InfoLocal() {
		
	}
	
	
	public InfoLocal(int id, String nome, String endereco, String telefone, String localizacao, String tipos,
			String acessibilidade, String url, String website, String icone, String status) {
		
		
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.localizacao = localizacao;
		this.tipos = tipos;
		this.acessibilidade = acessibilidade;
		this.url = url;
		this.website = website;
		this.icone = icone;
		this.status = status;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getTipos() {
		return tipos;
	}
	public void setTipos(String tipos) {
		this.tipos = tipos;
	}
	public String getAcessibilidade() {
		return acessibilidade;
	}
	public void setAcessibilidade(String acessibilidade) {
		this.acessibilidade = acessibilidade;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getIcone() {
		return icone;
	}
	public void setIcone(String icone) {
		this.icone = icone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "InfoLocal [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", localizacao=" + localizacao + ", tipos=" + tipos + ", acessibilidade=" + acessibilidade + ", url="
				+ url + ", website=" + website + ", icone=" + icone + ", status=" + status + "]";
	}

}
