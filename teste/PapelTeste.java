/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 14/03/2019
Objetivo sucinto do programa: Testar a classe Papel
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.BeforeClass;
import org.junit.Test;

public class PapelTeste {
	
	static SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
	
	// Peça 1 - Shakesphere
	
	// Instancia o ator Juliano
	static BigDecimal salarioJuliano = new BigDecimal("1500");
	static Ator juliano = new Ator(1, "Juliano", "Brasileiro", salarioJuliano);
	
	static BigDecimal acrescimosRomeu = new BigDecimal("200");
	static Papel romeu = new Papel(1, "Romeu", acrescimosRomeu);
	
	// Instancia a atriz Marieta
	static BigDecimal salarioMarieta = new BigDecimal("1800");
	static Ator marieta = new Ator(2, "Marieta", "Italiana", salarioMarieta);
	
	static BigDecimal acrescimosJulieta = new BigDecimal("300");
	static Papel julieta = new Papel(2, "Julieta", acrescimosJulieta);
	
	@BeforeClass
	public static void instanciacao() throws ParseException {
		// Associa o ator Juliano ao papel de Romeu
		juliano.getPapeis().add(romeu);
		romeu.setAtor(juliano);
		
		// Associa a atriz Marieta ao papel de Julieta
		marieta.getPapeis().add(julieta);
		julieta.setAtor(marieta);
	}
	
	@Test
	public void testaExibirSalarioComAcrescimos(){
		assertEquals(new BigDecimal("1700"), romeu.exibirSalarioComAcrescimos());
		assertEquals(new BigDecimal("2100"), julieta.exibirSalarioComAcrescimos());
	}
	
}
