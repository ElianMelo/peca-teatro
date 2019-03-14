import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class PecaTeste {
	
	static SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
	
	// Peça 1 - Shakesphere
	
	// Instancia o ator Juliano e atribui o papel de Romeu
	static BigDecimal salarioJuliano = new BigDecimal("1500");
	static Ator juliano = new Ator(1, "Juliano", "Brasileiro", salarioJuliano);
	
	static BigDecimal acrescimosRomeu = new BigDecimal("200");
	static Papel romeu = new Papel(1, "Romeu", acrescimosRomeu);
	
	// Instancia a atriz Marieta e atribui o papel de Julieta
	static BigDecimal salarioMarieta = new BigDecimal("1800");
	static Ator marieta = new Ator(2, "Marieta", "Italiana", salarioMarieta);
	
	static BigDecimal acrescimosJulieta = new BigDecimal("300");
	static Papel julieta = new Papel(2, "Julieta", acrescimosJulieta);
	
	static Peca pecaShakesphere;

	// Peça 2 - Star Wars
	
	// Instancia o ator Rodrigo e atribui o papel de Luke Skywalker e DarthVader
	static BigDecimal salarioRodrigo = new BigDecimal("2000");
	static Ator rodrigo = new Ator(1, "Rodrigo", "Alemã", salarioRodrigo);
	
	static BigDecimal acrescimoLuke = new BigDecimal("300");
	static Papel luke = new Papel(1, "Luke Skywalker", acrescimoLuke);
	
	static BigDecimal acrescimoDarthVader = new BigDecimal("600");
	static Papel darthVader = new Papel(2, "Darth Vader", acrescimoDarthVader);
	
	// Instancia a atriz Ketlen e atribui o papel de Princesa Leia e Rey
	static BigDecimal salarioKetlen = new BigDecimal("5000");
	static Ator ketlen = new Ator(2, "Ketlen Kelly", "Brasileira", salarioKetlen);
	
	static BigDecimal acrescimoLeia = new BigDecimal("500");
	static Papel leia = new Papel(3, "Princesa Leia", acrescimoLeia);
	
	static BigDecimal acrescimoRey = new BigDecimal("700");
	static Papel rey = new Papel(4, "Rey", acrescimoRey);
	
	static Peca pecaStarWars;

	@BeforeClass
	public static void instanciacao() throws ParseException {
		rodrigo.getPapeis().addAll(Arrays.asList(luke, darthVader));
		luke.setAtor(rodrigo);
		darthVader.setAtor(rodrigo);
		
		ketlen.getPapeis().addAll(Arrays.asList(leia, rey));
		leia.setAtor(ketlen);
		rey.setAtor(ketlen);
		
		Date dataPecaStarWars = formatadorData.parse("20/03/2019");
		pecaStarWars = new Peca(2, "Star Wars", 10, dataPecaStarWars);
	
		pecaStarWars.getPapeis().addAll(Arrays.asList(luke, darthVader, leia, rey));
		
		juliano.getPapeis().add(romeu);
		romeu.setAtor(juliano);
		
		marieta.getPapeis().add(julieta);
		julieta.setAtor(marieta);
		
		Date dataPecaShakesphere =  formatadorData.parse("12/03/2019");
		pecaShakesphere = new Peca(1, "Romeu e Julieta", 5, dataPecaShakesphere);
		
		pecaShakesphere.getPapeis().addAll(Arrays.asList(romeu, julieta));
	}

	@Test
	public void testaExibirCustoTotal(){
		assertEquals(new BigDecimal("3800"), pecaShakesphere.exibirCustoTotal());
		assertEquals(new BigDecimal("16100"), pecaStarWars.exibirCustoTotal());
	}
	
}
