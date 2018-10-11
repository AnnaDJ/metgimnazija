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
@Table(name="nastavni_plan_predmet")
public class NastavniPlanPredmet {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nastavni_plan_predmet_ID")
	private int nastavni_plan_predmet_ID;
	
	@Column(name = "ime_plana")
    private String ime_plana;
	
	@Column(name = "razred")
    private String razred;
	
	@Column(name="nedeljno_nastave")
	private int nedeljno_nastave;
	
	@Column(name="nedeljno_vezbi")
	private int nedeljno_vezbi;
	
	@Column(name="ukupno_nedelja")
	private int ukupno_nedelja;
	
	@OneToMany(mappedBy="nastavni_plan_predmet",
			   cascade={CascadeType.ALL})
	private List<Cas> cas;
	
	@OneToMany(mappedBy="nastavni_plan_predmet",
			   cascade={CascadeType.ALL})
	private List<Angazovanje> angazovanje;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="predmet_ID")
	private Predmet predmet;
	
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="godisnji_plan_ID")
	private GodisnjiPlan godisnji_plan;
	
	@OneToMany(mappedBy="nastavni_plan_predmet",
			   cascade={CascadeType.ALL})
	private List<UcenikPredmet> ucenik_predmet;
	
	public GodisnjiPlan getGodisnji_plan() {
		return godisnji_plan;
	}


	public void setGodisnji_plan(GodisnjiPlan godisnji_plan) {
		this.godisnji_plan = godisnji_plan;
	}


	public List<UcenikPredmet> getUcenik_predmet() {
		return ucenik_predmet;
	}


	public void setUcenik_predmet(List<UcenikPredmet> ucenik_predmet) {
		this.ucenik_predmet = ucenik_predmet;
	}


	public NastavniPlanPredmet() {
		
	}
	

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public int getNastavni_plan_predmet_ID() {
		return nastavni_plan_predmet_ID;
	}

	public void setNastavni_plan_predmet_ID(int nastavni_plan_predmet_ID) {
		this.nastavni_plan_predmet_ID = nastavni_plan_predmet_ID;
	}

	public String getIme_plana() {
		return ime_plana;
	}

	public void setIme_plana(String ime_plana) {
		this.ime_plana = ime_plana;
	}

	public String getRazred() {
		return razred;
	}

	public void setRazred(String razred) {
		this.razred = razred;
	}

	public int getNedeljno_nastave() {
		return nedeljno_nastave;
	}

	public void setNedeljno_nastave(int nedeljno_nastave) {
		this.nedeljno_nastave = nedeljno_nastave;
	}

	public int getNedeljno_vezbi() {
		return nedeljno_vezbi;
	}

	public void setNedeljno_vezbi(int nedeljno_vezbi) {
		this.nedeljno_vezbi = nedeljno_vezbi;
	}

	public int getUkupno_nedelja() {
		return ukupno_nedelja;
	}

	public void setUkupno_nedelja(int ukupno_nedelja) {
		this.ukupno_nedelja = ukupno_nedelja;
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

	@Override
	public String toString() {
		return "NastavniPlanPredmet [nastavni_plan_predmet_ID=" + nastavni_plan_predmet_ID + ", ime_plana=" + ime_plana
				+ ", razred=" + razred + ", nedeljno_nastave=" + nedeljno_nastave + ", nedeljno_vezbi=" + nedeljno_vezbi
				+ ", ukupno_nedelja=" + ukupno_nedelja + ", cas=" + cas + ", angazovanje=" + angazovanje + "]";
	}
	
	
	
	
}


