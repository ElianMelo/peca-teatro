/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 08/03/2019
Objetivo sucinto do programa: Simular um ator de uma peça
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/
import java.math.BigDecimal;

public class Ator {
	private Integer ID;
	private String nome;
	private String nacionalidade;
	private BigDecimal salario;
	
	public Ator() {
		
	}
	
	public Ator(Integer iD, String nome, String nacionalidade, BigDecimal salario) {
		super();
		ID = iD;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.salario = salario;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
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
		Ator other = (Ator) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ator [ID=" + ID + ", nome=" + nome + ", nacionalidade=" + nacionalidade + ", salario=" + salario + "]";
	}
}
