package com.met.gimnazija.entities;

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
@Table(name="predmet")
public class Predmet {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="predmet_ID")
	private int predmet_ID;
	
	@Column(name = "sifra")
    private String sifra;
	
	@Column(name = "pun_nazav")
    private String pun_naziv;
	
	@OneToMany(mappedBy="predmet",
			   cascade={CascadeType.ALL})
	private List<NastavniPlanPredmet> nastavni_plan_predmet;

	public Predmet() {
		
	}
	

	public int getPredmet_ID() {
		return predmet_ID;
	}

	public void setPredmet_ID(int predmet_ID) {
		this.predmet_ID = predmet_ID;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getPun_naziv() {
		return pun_naziv;
	}

	public void setPun_naziv(String pun_naziv) {
		this.pun_naziv = pun_naziv;
	}

	public List<NastavniPlanPredmet> getNastavni_plan_predmet() {
		return nastavni_plan_predmet;
	}

	public void setNastavni_plan_predmet(List<NastavniPlanPredmet> nastavni_plan_predmet) {
		this.nastavni_plan_predmet = nastavni_plan_predmet;
	}

	@Override
	public String toString() {
		return "Predmet [predmet_ID=" + predmet_ID + ", sifra=" + sifra + ", pun_naziv=" + pun_naziv
				+ ", nastavni_plan_predmet=" + nastavni_plan_predmet + "]";
	}
	
	
}


