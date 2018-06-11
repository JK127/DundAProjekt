package de.jonasklein;

public class Auto {

	private String hersteller;
	private String modell;
	private int kw;
	private int ps;
	private int kmStand;
	private int tankVol;
	
	public Auto(String hersteller, String modell, int kw, int kmStand, int tankVol) {
		setHersteller(hersteller);
		setModell(modell);
		setKw(kw);
		setKmStand(kmStand);
		setTankVol(tankVol);
		kwPs(kw);
	}
	
	private void kwPs(int kw) {
		setPs((int) (1.35962 * kw));
	}
	
	public String getHersteller() {
		return hersteller;
	}
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public int getKw() {
		return kw;
	}
	public void setKw(int kw) {
		this.kw = kw;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public int getKmStand() {
		return kmStand;
	}
	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}
	public int getTankVol() {
		return tankVol;
	}
	public void setTankVol(int tankVol) {
		this.tankVol = tankVol;
	}
}
