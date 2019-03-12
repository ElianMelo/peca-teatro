/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 08/03/2019
Objetivo sucinto do programa: Simular uma peça de teatro
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Peca implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String titulo;
	private Integer duracao;
	private Date data;
	private List<Papel> papeis = new ArrayList<>();
	
	public Peca() {
		
	}
	
	public Peca(Integer iD, String titulo, Integer duracao, Date data) {
		super();
		ID = iD;
		this.titulo = titulo;
		this.duracao = duracao;
		this.data = data;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peca other = (Peca) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Peca [ID=" + ID + ", titulo=" + titulo + ", duracao=" + duracao + ", data=" + data + "]";
	}
	
	public BigDecimal exibirCustoTotal() {
		BigDecimal custoTotal = new BigDecimal("0");
		
		for(Papel papel : getPapeis()) {
			custoTotal = custoTotal.add(papel.exibirSalarioComAcrescimos());
		}
		
		return custoTotal;
	}
}
