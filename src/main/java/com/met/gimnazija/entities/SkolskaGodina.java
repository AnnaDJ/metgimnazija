package com.met.gimnazija.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="skolska_godina")
public class SkolskaGodina {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="skolska_godina_ID")
	private int skolska_godina_ID;
	
	@Column(name="datum_pocetka")
	private Date datum_pocetka;
	
	@Column(name="datum_kraja")
	private Date datum_kraja;

	@OneToMany(mappedBy="skolska_godina",
			   cascade={CascadeType.ALL})
	private List<GodisnjiPlan> godisnji_plan;
	
	@OneToMany(mappedBy="skolska_godina",
			   cascade={CascadeType.ALL})
	private List<Odeljenje> odeljenje;
	
	@OneToMany(mappedBy="skolska_godina",
			   cascade={CascadeType.ALL})
	private List<Cenovnik> cenovnik;
	
	public SkolskaGodina() {
	
	}

	public List<GodisnjiPlan> getGodisnji_plan() {
		return godisnji_plan;
	}

	public void setGodisnji_plan(List<GodisnjiPlan> godisnji_plan) {
		this.godisnji_plan = godisnji_plan;
	}

	public List<Odeljenje> getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(List<Odeljenje> odeljenje) {
		this.odeljenje = odeljenje;
	}

	public List<Cenovnik> getCenovnik() {
		return cenovnik;
	}

	public void setCenovnik(List<Cenovnik> cenovnik) {
		this.cenovnik = cenovnik;
	}

	public int getSkolska_godina_ID() {
		return skolska_godina_ID;
	}

	public void setSkolska_godina_ID(int skolska_godina_ID) {
		this.skolska_godina_ID = skolska_godina_ID;
	}

	public Date getDatum_pocetka() {
		return datum_pocetka;
	}

	public void setDatum_pocetka(Date datum_pocetka) {
		this.datum_pocetka = datum_pocetka;
	}

	public Date getDatum_kraja() {
		return datum_kraja;
	}

	public void setDatum_kraja(Date datum_kraja) {
		this.datum_kraja = datum_kraja;
	}

	@Override
	public String toString() {
		return "SkolskaGodina [skolska_godina_ID=" + skolska_godina_ID + ", datum_pocetka=" + datum_pocetka
				+ ", datum_kraja=" + datum_kraja + "]";
	}
	
	
}
