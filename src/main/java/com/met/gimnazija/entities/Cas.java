package com.met.gimnazija.entities;

import java.util.Date;
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
@Table(name="cas")
public class Cas {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cas_ID")
	private int cas_ID;
	
	@Column(name="redni_broj_casa")
	private int redni_broj_casa;
	
	@Column(name="ukupan_rb_casa")
	private int ukupan_rb_casa;
	
	@Column(name = "opis_casa")
    private String opis_casa;
	
	@Column(name = "napomena")
    private String napomena;
	
	@Column(name="datum_unosa")
	private Date datum_unosa;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="nastavnik_ID")
	private Nastavnik nastavnik;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="nastavni_plan_predmet_ID")
	private NastavniPlanPredmet nastavni_plan_predmet;
	
	@OneToMany(mappedBy="cas",
			   cascade={CascadeType.ALL})
	private List<Prisustvo> prisustvo;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="odeljenje_ID")
	private Odeljenje odeljenje;
	public Cas() {
		
	}

	
	public Odeljenje getOdeljenje() {
		return odeljenje;
	}


	public void setOdeljenje(Odeljenje odeljenje) {
		this.odeljenje = odeljenje;
	}


	public List<Prisustvo> getPrisustvo() {
		return prisustvo;
	}


	public void setPrisustvo(List<Prisustvo> prisustvo) {
		this.prisustvo = prisustvo;
	}


	public NastavniPlanPredmet getNastavni_plan_predmet() {
		return nastavni_plan_predmet;
	}


	public void setNastavni_plan_predmet(NastavniPlanPredmet nastavni_plan_predmet) {
		this.nastavni_plan_predmet = nastavni_plan_predmet;
	}


	public int getCas_ID() {
		return cas_ID;
	}

	public void setCas_ID(int cas_ID) {
		this.cas_ID = cas_ID;
	}

	public int getRedni_broj_casa() {
		return redni_broj_casa;
	}

	public void setRedni_broj_casa(int redni_broj_casa) {
		this.redni_broj_casa = redni_broj_casa;
	}

	public int getUkupan_rb_casa() {
		return ukupan_rb_casa;
	}

	public void setUkupan_rb_casa(int ukupan_rb_casa) {
		this.ukupan_rb_casa = ukupan_rb_casa;
	}

	public String getOpis_casa() {
		return opis_casa;
	}

	public void setOpis_casa(String opis_casa) {
		this.opis_casa = opis_casa;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public Date getDatum_unosa() {
		return datum_unosa;
	}

	public void setDatum_unosa(Date datum_unosa) {
		this.datum_unosa = datum_unosa;
	}

	public Nastavnik getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(Nastavnik nastavnik) {
		this.nastavnik = nastavnik;
	}

	@Override
	public String toString() {
		return "Cas [cas_ID=" + cas_ID + ", redni_broj_casa=" + redni_broj_casa + ", ukupan_rb_casa=" + ukupan_rb_casa
				+ ", opis_casa=" + opis_casa + ", napomena=" + napomena + ", datum_unosa=" + datum_unosa
				+ ", nastavnik=" + nastavnik + "]";
	}
	
	
	

}



