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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="angazovanje")
public class Angazovanje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="angazovanje_ID")
	private int angazovanje_ID;
	
	@Column(name="pocetak")
	private Date pocetak;
	
	@Column(name="kraj")
	private Date kraj;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="nastavnik_ID")
	private Nastavnik nastavnik;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="nastavni_plan_predmet_ID")
	private NastavniPlanPredmet nastavni_plan_predmet;
	
	 @ManyToMany(cascade={CascadeType.ALL})
	    @JoinTable(name = "angazovanje_po_odeljenju",
	            joinColumns = { @JoinColumn(name = "angazovanje_ID") },
	            inverseJoinColumns = { @JoinColumn(name = "odeljenje_ID") })
	 private List<Odeljenje> odeljenje;

	public Angazovanje() {
		
	}
	public List<Odeljenje> getOdeljenje() {
		return odeljenje;
	}


	public void setOdeljenje(List<Odeljenje> odeljenje) {
		this.odeljenje = odeljenje;
	}


	public NastavniPlanPredmet getNastavni_plan_predmet() {
		return nastavni_plan_predmet;
	}


	public void setNastavni_plan_predmet(NastavniPlanPredmet nastavni_plan_predmet) {
		this.nastavni_plan_predmet = nastavni_plan_predmet;
	}


	public int getAngazovanje_ID() {
		return angazovanje_ID;
	}

	public void setAngazovanje_ID(int angazovanje_ID) {
		this.angazovanje_ID = angazovanje_ID;
	}

	public Date getPocetak() {
		return pocetak;
	}

	public void setPocetak(Date pocetak) {
		this.pocetak = pocetak;
	}

	public Date getKraj() {
		return kraj;
	}

	public void setKraj(Date kraj) {
		this.kraj = kraj;
	}

	public Nastavnik getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(Nastavnik nastavnik) {
		this.nastavnik = nastavnik;
	}

	@Override
	public String toString() {
		return "Angazovanje [angazovanje_ID=" + angazovanje_ID + ", pocetak=" + pocetak + ", kraj=" + kraj
				+ ", nastavnik=" + nastavnik + "]";
	}
	
	
}


