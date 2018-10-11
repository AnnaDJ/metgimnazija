package com.met.gimnazija.entities;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ucenik_predmet")
public class UcenikPredmet {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ucenik_predmet_ID")
	private int ucenik_predmet_ID;
	
	@Column(name="ocena")
	private Integer ocena;
	
	
	@Column(name="tip_ocena")
	private String tip_ocena;
	
	@Column(name="polugodiste")
	private Integer polugodiste;
	
	@Column(name="datum_unosa")
	private Date datum_unosa;
	
	@Column(name="napomena")
	private String napomena;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="ucenik_ID")
	private Ucenik ucenik;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="nastavnik_ID")
	private Nastavnik nastavnik;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="nastavni_plan_predmet_ID")
	private NastavniPlanPredmet nastavni_plan_predmet;
	
	public UcenikPredmet() {
		
	}
	
	public Nastavnik getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(Nastavnik nastavnik) {
		this.nastavnik = nastavnik;
	}

	public NastavniPlanPredmet getNastavni_plan_predmet() {
		return nastavni_plan_predmet;
	}

	public void setNastavni_plan_predmet(NastavniPlanPredmet nastavni_plan_predmet) {
		this.nastavni_plan_predmet = nastavni_plan_predmet;
	}

	public int getUcenik_predmet_ID() {
		return ucenik_predmet_ID;
	}

	public void setUcenik_predmet_ID(int ucenik_predmet_ID) {
		this.ucenik_predmet_ID = ucenik_predmet_ID;
	}

	public Integer getOcena() {
		return ocena;
	}

	public void setOcena(Integer ocena) {
		this.ocena = ocena;
	}

	public String getTip_ocena() {
		return tip_ocena;
	}

	public void setTip_ocena(String tip_ocena) {
		this.tip_ocena = tip_ocena;
	}

	public Integer getPolugodiste() {
		return polugodiste;
	}

	public void setPolugodiste(Integer polugodiste) {
		this.polugodiste = polugodiste;
	}

	public Date getDatum_unosa() {
		return datum_unosa;
	}

	public void setDatum_unosa(Date datum_unosa) {
		this.datum_unosa = datum_unosa;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public Ucenik getUcenik() {
		return ucenik;
	}

	public void setUcenik(Ucenik ucenik) {
		this.ucenik = ucenik;
	}
	@Override
	public String toString() {
		return "UcenikPredmet [ucenik_predmet_ID=" + ucenik_predmet_ID + ", ocena=" + ocena + ", tip_ocena=" + tip_ocena
				+ ", polugodiste=" + polugodiste + ", datum_unosa=" + datum_unosa + ", napomena=" + napomena
				+ ", ucenik=" + ucenik + "]";
	}
	
}
