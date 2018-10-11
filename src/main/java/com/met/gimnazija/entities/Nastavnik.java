package com.met.gimnazija.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="nastavnik")
public class Nastavnik {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nastavnik_ID")
	private int nastavnik_ID;
	
	@Column(name = "fakultet")
    private String fakultet;
	
	@Column(name = "razredni")
    private int razredni;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="zaposleni_ID")
	private Zaposleni zaposleni;
	
	@OneToMany(mappedBy="nastavnik",
			   cascade={CascadeType.ALL})
	private List<Angazovanje> angazovanje;
	
	@OneToMany(mappedBy="nastavnik",
			   cascade={CascadeType.ALL})
	private List<Cas> cas;
	
	 @OneToMany(mappedBy="nastavnik",
			   cascade={CascadeType.ALL})
	private List<Odeljenje> odeljenje;
	 
	 @OneToMany(mappedBy="nastavnik",
			   cascade={CascadeType.ALL})
	private List<UcenikPredmet> ucenik_predmet;

	public List<Odeljenje> getOdeljenje() {
		return odeljenje;
	}


	public void setOdeljenje(List<Odeljenje> odeljenje) {
		this.odeljenje = odeljenje;
	}


	public List<UcenikPredmet> getUcenik_predmet() {
		return ucenik_predmet;
	}


	public void setUcenik_predmet(List<UcenikPredmet> ucenik_predmet) {
		this.ucenik_predmet = ucenik_predmet;
	}


	public Nastavnik() {
		
	}
	

	public List<Cas> getCas() {
		return cas;
	}


	public void setCas(List<Cas> cas) {
		this.cas = cas;
	}


	public List<Angazovanje> getAngazovanje() {
		return angazovanje;
	}


	public void setAngazovanje(List<Angazovanje> angazovanje) {
		this.angazovanje = angazovanje;
	}


	public int getNastavnik_ID() {
		return nastavnik_ID;
	}

	public void setNastavnik_ID(int nastavnik_ID) {
		this.nastavnik_ID = nastavnik_ID;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	public int getRazredni() {
		return razredni;
	}

	public void setRazredni(int razredni) {
		this.razredni = razredni;
	}

	public Zaposleni getZaposleni() {
		return zaposleni;
	}

	public void setZaposleni(Zaposleni zaposleni) {
		this.zaposleni = zaposleni;
	}

	@Override
	public String toString() {
		return "Nastavnik [nastavnik_ID=" + nastavnik_ID + ", fakultet=" + fakultet + ", razredni=" + razredni
				+ ", zaposleni=" + zaposleni + "]";
	}
	
	
	
}


