package com.met.gimnazija.entities;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="odeljenje")
public class Odeljenje {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="odeljenje_ID")
	private int odeljenje_ID;
	

	@Column(name="oznaka")
	private Integer oznaka;
	
	@Column(name="razred")
	private String razred;

	@OneToMany(mappedBy="odeljenje",
			   cascade={CascadeType.ALL})
	private List<Upis> upis;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="skolska_godina_ID")
	private SkolskaGodina skolska_godina;
	
	 @ManyToMany(cascade={CascadeType.ALL})
	    @JoinTable(name = "angazovanje_po_odeljenju",
	            joinColumns = { @JoinColumn(name = "odeljenje_ID") },
	            inverseJoinColumns = { @JoinColumn(name = "angazovanje_ID") })
	 private List<Angazovanje> angazovanje;
	 
	 @OneToMany(mappedBy="odeljenje",
			   cascade={CascadeType.ALL})
	private List<Cas> cas;
	 
	 @ManyToOne(cascade={CascadeType.ALL})
		@JoinColumn(name="nastavnik_ID")
		private Nastavnik nastavnik;
	 
    public Odeljenje() {
		
	}

	public List<Upis> getUpis() {
		return upis;
	}

	public void setUpis(List<Upis> upis) {
		this.upis = upis;
	}

	public SkolskaGodina getSkolska_godina() {
		return skolska_godina;
	}

	public void setSkolska_godina(SkolskaGodina skolska_godina) {
		this.skolska_godina = skolska_godina;
	}

	public List<Angazovanje> getAngazovanje() {
		return angazovanje;
	}

	public void setAngazovanje(List<Angazovanje> angazovanje) {
		this.angazovanje = angazovanje;
	}

	public List<Cas> getCas() {
		return cas;
	}

	public void setCas(List<Cas> cas) {
		this.cas = cas;
	}

	public Nastavnik getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(Nastavnik nastavnik) {
		this.nastavnik = nastavnik;
	}

	public int getOdeljenje_ID() {
		return odeljenje_ID;
	}

	public void setOdeljenje_ID(int odeljenje_ID) {
		this.odeljenje_ID = odeljenje_ID;
	}

	public Integer getOznaka() {
		return oznaka;
	}

	public void setOznaka(Integer oznaka) {
		this.oznaka = oznaka;
	}

	public String getRazred() {
		return razred;
	}

	public void setRazred(String razred) {
		this.razred = razred;
	}

	@Override
	public String toString() {
		return "Odeljenje [odeljenje_ID=" + odeljenje_ID + ", oznaka=" + oznaka + ", razred=" + razred + "]";
	}
    
}
