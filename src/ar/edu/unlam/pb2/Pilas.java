package ar.edu.unlam.pb2;

public class Pilas {
	
	private Integer nivelDeCarga=0;
	private Integer minutos;
	private Integer totalConsumo=0;
	private Integer cantCargas=0;
	private Integer velCarga;
	private Integer velConsumo;
	
	
	
	public Pilas (Integer velCarga, Integer velConsumo) {
		this.velCarga = velCarga;
		this.velConsumo = velConsumo;
	}
	
	
	public Integer medirCarga() {
		return this.nivelDeCarga;
	}
	
	public void consumir(Integer minutos) {
		if (this.nivelDeCarga - (minutos*this.velConsumo)<0) {
			this.nivelDeCarga=0;
			this.totalConsumo+=this.nivelDeCarga;
		} else {
			this.nivelDeCarga-=(minutos*this.velConsumo);
			this.totalConsumo+=minutos;
		}
	}
	
	public Integer medirConsumoTotal () {
		return this.totalConsumo;
	}
	
	public Integer contarCargasTotales() {
		return this.cantCargas;
	}
	
	public void cargar(Integer minutos) {
		if (this.nivelDeCarga+(minutos*this.velCarga)>=100) {
			this.nivelDeCarga=100;
			this.cantCargas+=1;
		} else {
			this.nivelDeCarga+=(minutos*this.velCarga);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
