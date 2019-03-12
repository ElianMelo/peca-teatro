/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 08/03/2019
Objetivo sucinto do programa: Simular os papeis em uma peça
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/
import java.io.Serializable;
import java.math.BigDecimal;

public class Papel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String nomePersonagem;
	private BigDecimal acrescimos;
	
	public Papel() {
		
	}
	
	public Papel(Integer iD, String nomePersonagem, BigDecimal acrescimos) {
		super();
		ID = iD;
		this.nomePersonagem = nomePersonagem;
		this.acrescimos = acrescimos;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public BigDecimal getAcrescimos() {
		return acrescimos;
	}

	public void setAcrescimos(BigDecimal acrescimos) {
		this.acrescimos = acrescimos;
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
		Papel other = (Papel) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Papel [ID=" + ID + ", nomePersonagem=" + nomePersonagem + ", acrescimos=" + acrescimos + "]";
	}
}
