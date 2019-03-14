/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 08/03/2019
Objetivo sucinto do programa: Simular os relacionamentos e o funcionamento de uma peça em sua totalidade
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/
package br.com.sankhya.dominio;

import java.util.Arrays;
import java.util.Date;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PecaTeatro {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("[ Teatro Nacional ]");
		
		// Peça 1 - Shakesphere
		
		// Instancia o ator Juliano e atribui o papel de Romeu
		BigDecimal salarioJuliano = new BigDecimal("1500");
		Ator juliano = new Ator(1, "Juliano", "Brasileiro", salarioJuliano);
		
		BigDecimal acrescimosRomeu = new BigDecimal("200");
		Papel romeu = new Papel(1, "Romeu", acrescimosRomeu);
		
		juliano.getPapeis().add(romeu);
		romeu.setAtor(juliano);
		
		// Instancia a atriz Marieta e atribui o papel de Julieta
		BigDecimal salarioMarieta = new BigDecimal("1800");
		Ator marieta = new Ator(2, "Marieta", "Italiana", salarioMarieta);
		
		BigDecimal acrescimosJulieta = new BigDecimal("300");
		Papel julieta = new Papel(2, "Julieta", acrescimosJulieta);
		
		marieta.getPapeis().add(julieta);
		julieta.setAtor(marieta);
		
		// Instancia a Peca de Shakesphere e adiciona os papeis de Romeu e Julieta a ela
		Date dataPecaShakesphere =  formatadorData.parse("12/03/2019");
		Peca pecaShakesphere = new Peca(1, "Romeu e Julieta", 5, dataPecaShakesphere);
		
		pecaShakesphere.getPapeis().addAll(Arrays.asList(romeu, julieta));
		
		// Mostra informaçoes da Peça 1 - Shakesphere
		System.out.println();
		System.out.println("Peça 1 - Shakesphere");
		System.out.println("Nome: " + pecaShakesphere.getTitulo());
		System.out.println("Duração: " + pecaShakesphere.getDuracao() + " horas");
		System.out.println("Data do evento: " + formatadorData.format(pecaShakesphere.getData()));
		System.out.println();
	
		for(Papel papel : pecaShakesphere.getPapeis()) {
			System.out.println("Papel " + papel.getNomePersonagem() + ": \n" + papel 
					+ "\n" + papel.getAtor() + "\n" + "Seu preço: " + papel.exibirSalarioComAcrescimos() + "\n");
		}
		
		System.out.println("Preço total da obra: " + pecaShakesphere.exibirCustoTotal());
		
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		// Peça 2 - Star Wars
		
		// Instancia o ator Rodrigo e atribui o papel de Luke Skywalker e DarthVader
		BigDecimal salarioRodrigo = new BigDecimal("2000");
		Ator rodrigo = new Ator(1, "Rodrigo", "Alemã", salarioRodrigo);
		
		BigDecimal acrescimoLuke = new BigDecimal("300");
		Papel luke = new Papel(1, "Luke Skywalker", acrescimoLuke);
		
		BigDecimal acrescimoDarthVader = new BigDecimal("600");
		Papel darthVader = new Papel(2, "Darth Vader", acrescimoDarthVader);
		
		rodrigo.getPapeis().addAll(Arrays.asList(luke, darthVader));
		luke.setAtor(rodrigo);
		darthVader.setAtor(rodrigo);
		
		// Instancia a atriz Ketlen e atribui o papel de Princesa Leia e Rey
		BigDecimal salarioKetlen = new BigDecimal("5000");
		Ator ketlen = new Ator(2, "Ketlen Kelly", "Brasileira", salarioKetlen);
		
		BigDecimal acrescimoLeia = new BigDecimal("500");
		Papel leia = new Papel(3, "Princesa Leia", acrescimoLeia);
		
		BigDecimal acrescimoRey = new BigDecimal("700");
		Papel rey = new Papel(4, "Rey", acrescimoRey);
		
		ketlen.getPapeis().addAll(Arrays.asList(leia, rey));
		leia.setAtor(ketlen);
		rey.setAtor(ketlen);
		
		// Instancia a Peca Star Wars e adiciona seus respectivos papeis a ela
		Date dataPecaStarWars = formatadorData.parse("20/03/2019");
		Peca pecaStarWars = new Peca(1, "Star Wars", 10, dataPecaStarWars);
		
		pecaStarWars.getPapeis().addAll(Arrays.asList(luke, darthVader, leia, rey));
		
		// Mostra informaçoes da Peça 2 - Star Wars
		System.out.println();
		System.out.println("Peça 2 - Star Wars");
		System.out.println("Nome: " + pecaStarWars.getTitulo());
		System.out.println("Duração: " +pecaStarWars.getDuracao() + " horas");
		System.out.println("Data do evento: " + formatadorData.format(pecaStarWars.getData()));
		System.out.println();
	
		for(Papel papel : pecaStarWars.getPapeis()) {
			System.out.println("Papel " + papel.getNomePersonagem() + ": \n" + papel 
					+ "\n" + papel.getAtor() + "\n" + "Seu preço: " + papel.exibirSalarioComAcrescimos() + "\n");
		}
		
		System.out.println("Preço total da obra: " + pecaStarWars.exibirCustoTotal());
	}

}
