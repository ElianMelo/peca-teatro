/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 08/03/2019
Objetivo sucinto do programa: Simular os relacionamentos e o funcionamento de uma peça em sua totalidade
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/
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
		
		// Instancia o ator juliano e atribui o papel de romeu
		BigDecimal salarioJuliano = new BigDecimal("1.500");
		Ator juliano = new Ator(1, "Juliano", "brasileiro", salarioJuliano);
		
		BigDecimal acrescimosRomeu = new BigDecimal("200");
		Papel romeu = new Papel(1, "Romeu", acrescimosRomeu);
		
		juliano.getPapeis().add(romeu);
		romeu.setAtor(juliano);
		
		// Instancia a atriz marieta e atribui o papel de julieta
		BigDecimal salarioMarieta = new BigDecimal("1.800");
		Ator marieta = new Ator(1, "Marieta", "italiana", salarioMarieta);
		
		BigDecimal acrescimosJulieta = new BigDecimal("300");
		Papel julieta = new Papel(1, "Julieta", acrescimosJulieta);
		
		marieta.getPapeis().add(julieta);
		julieta.setAtor(marieta);
		
		// Instancia a peca e adiciona os papeis de romeu e julieta a ela
		Date dataPecaShakesphere =  formatadorData.parse("12/03/2019");
		Peca pecaShakesphere = new Peca(1, "Romeu e Julieta", 5, dataPecaShakesphere);
		
		pecaShakesphere.getPapeis().addAll(Arrays.asList(romeu, julieta));
		
		// Mostra informaçoes da 
		
		// System.out.println();
		
		System.out.println();
		System.out.println("Peça 1 - Shakesphere");
		System.out.println("Nome: " + pecaShakesphere.getTitulo());
		System.out.println("Duração: " + pecaShakesphere.getDuracao() + "horas");
		System.out.println("Data do evento: " + formatadorData.format(pecaShakesphere.getData()));
	
		for(Papel papel : pecaShakesphere.getPapeis()) {
			System.out.println("Papel " + papel.getNomePersonagem() + ": " + papel.getAtor());
		}
		
		// Peça 2 - Star Wars
		
	}

}
