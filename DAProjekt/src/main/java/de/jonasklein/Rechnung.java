package de.jonasklein;

import java.util.Date;
/**
 * 
 * @author jonasklein
 *
 */

public class Rechnung {

	private String rechnungNr;
	private String bezeichnung;
	private Date datum;
	private double betrag;
	private String beschreibung;
	
	/**
	 * 
	 * @param rechnungNummer Die Rechnungsnummer.
	 * @param datum Das Rechnungsdatum.
	 * @param betrag Der Rechnungsbetrag.
	 * @param bezeichnung Eine Bezeichnung der Rechnung.
	 * @param beschreibung Eine Beschreibung der Rechnung.
	 */
	public Rechnung(String rechnungNummer, Date datum, double betrag, String bezeichnung, String beschreibung) {
		setRechnungNr(rechnungNummer);
		setDatum(datum);
		setBetrag(betrag);
		setBezeichnung(bezeichnung);
		setBeschreibung(beschreibung);
	}

	/**
	 * 
	 * @param rechnungNummer Die Rechnungsnummer.
	 * @param datum Das Rechnungsdatum.
	 * @param betrag Der Rechnungsbetrag.
	 * @param bezeichnung Eine Bezeichnung der Rechnung.
	 */
	public Rechnung(String rechnungNummer, Date datum, double betrag, String bezeichnung) {
		setRechnungNr(rechnungNummer);
		setDatum(datum);
		setBetrag(betrag);
		setBezeichnung(bezeichnung);
	}

	public String getRechnungNr() {
		return rechnungNr;
	}

	public void setRechnungNr(String rechnungNr) {
		this.rechnungNr = rechnungNr;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public double getBetrag() {
		return betrag;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
}
