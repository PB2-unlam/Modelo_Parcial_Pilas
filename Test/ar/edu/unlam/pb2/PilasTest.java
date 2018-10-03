package ar.edu.unlam.pb2;


import org.junit.Assert;
import org.junit.Test;

public class PilasTest {

	@Test
	public void TestQueMidaLaCarga() {
		Pilas mideCarga = new Pilas(1, 1);
		mideCarga.cargar(10);
		Integer actual = mideCarga.medirCarga();
		Integer expected = 10;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void TestQueCargueyConsuma() {
		Pilas consumeCarga = new Pilas(1, 10);
		consumeCarga.cargar(10);
		consumeCarga.consumir(1);
		Integer actual = consumeCarga.medirCarga();
		Integer expected = 0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void TestQueMidaConsumoTotal() {
		Pilas testConsumoTotal = new Pilas(10, 1);
		testConsumoTotal.cargar(10);
		testConsumoTotal.consumir(10);
		testConsumoTotal.consumir(50);
		testConsumoTotal.consumir(30);
		Integer actual = testConsumoTotal.medirCarga();
		Integer expected = 10;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void TestQueMidaCantCargas() {
		Pilas testCargas = new Pilas(10, 1);
		testCargas.cargar(10);
		testCargas.consumir(100);
		testCargas.cargar(9);
		testCargas.cargar(1);
		Integer actual = testCargas.contarCargasTotales();
		Integer expected = 2;
		Assert.assertEquals(expected, actual);
	}

	
	
	
	
	
	
	
}
