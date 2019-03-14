/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 14/03/2019
Objetivo sucinto do programa: Testar a classe Peca
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/
package br.com.sankhya.teste;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.sankhya.dominio.Ator;
import br.com.sankhya.dominio.Papel;
import br.com.sankhya.dominio.Peca;

public class PecaTeste {
	
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
	
	// Instancia a peça de Shakesphere
	static Peca pecaShakesphere;

	// Peça 2 - Star Wars
	
	// Instancia o ator Rodrigo
	static BigDecimal salarioRodrigo = new BigDecimal("2000");
	static Ator rodrigo = new Ator(1, "Rodrigo", "Alemã", salarioRodrigo);
	
	static BigDecimal acrescimoLuke = new BigDecimal("300");
	static Papel luke = new Papel(1, "Luke Skywalker", acrescimoLuke);
	
	static BigDecimal acrescimoDarthVader = new BigDecimal("600");
	static Papel darthVader = new Papel(2, "Darth Vader", acrescimoDarthVader);
	
	// Instancia a atriz Ketlen
	static BigDecimal salarioKetlen = new BigDecimal("5000");
	static Ator ketlen = new Ator(2, "Ketlen Kelly", "Brasileira", salarioKetlen);
	
	static BigDecimal acrescimoLeia = new BigDecimal("500");
	static Papel leia = new Papel(3, "Princesa Leia", acrescimoLeia);
	
	static BigDecimal acrescimoRey = new BigDecimal("700");
	static Papel rey = new Papel(4, "Rey", acrescimoRey);
	
	// Instancia a peça de Star Wars
	static Peca pecaStarWars;

	@BeforeClass
	public static void instanciacao() throws ParseException {
		// Associa o ator Juliano ao papel de Romeu
		juliano.getPapeis().add(romeu);
		romeu.setAtor(juliano);
		
		// Associa a atriz Marieta ao papel de Julieta
		marieta.getPapeis().add(julieta);
		julieta.setAtor(marieta);
		
		// Instancia a peça de Shakesphere 
		Date dataPecaShakesphere =  formatadorData.parse("12/03/2019");
		pecaShakesphere = new Peca(1, "Romeu e Julieta", 5, dataPecaShakesphere);
		
		pecaShakesphere.getPapeis().addAll(Arrays.asList(romeu, julieta));
		
		// Associa o ator Rodrigo ao papel de Luke Skywalker e DarthVader
		rodrigo.getPapeis().addAll(Arrays.asList(luke, darthVader));
		luke.setAtor(rodrigo);
		darthVader.setAtor(rodrigo);
		
		// Associa a atriz Ketlen ao papel de Princesa Leia e Rey
		ketlen.getPapeis().addAll(Arrays.asList(leia, rey));
		leia.setAtor(ketlen);
		rey.setAtor(ketlen);
		
		// Instancia a peça de Star Wars
		Date dataPecaStarWars = formatadorData.parse("20/03/2019");
		pecaStarWars = new Peca(2, "Star Wars", 10, dataPecaStarWars);
	
		pecaStarWars.getPapeis().addAll(Arrays.asList(luke, darthVader, leia, rey));
	}

	@Test
	public void testaExibirCustoTotal(){
		assertEquals(new BigDecimal("3800"), pecaShakesphere.exibirCustoTotal());
		assertEquals(new BigDecimal("16100"), pecaStarWars.exibirCustoTotal());
	}
	
}
