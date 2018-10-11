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
@Table(name="ucenik")
public class Ucenik {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ucenik_ID")
	private int ucenik_ID;
	
	@Column(name="broj_knjizice")
	private String broj_knjizice;
	
	@Column(name="ime_roditelja")
	private String ime_roditelja;
	
	@Column(name="osnovna_skola")
	private String osnovna_skola;
	
	
	@OneToMany(mappedBy="ucenik",
			   cascade={CascadeType.ALL})
	private List<UcenikPredmet> ucenik_predmet;
	
	@OneToMany(mappedBy="ucenik",
			   cascade={CascadeType.ALL})
	private List<Upis> upis;
	
	@OneToMany(mappedBy="ucenik",
			   cascade={CascadeType.ALL})
	private List<Prisustvo> prisustvo;
	
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH, CascadeType.PERSIST})
	@JoinColumn(name="user_ID")
	private User user;
	
	@ManyToMany(cascade={CascadeType.ALL})
	    @JoinTable(name = "ucenik_roditelj",
	            joinColumns = { @JoinColumn(name = "ucenik_ID") },
	            inverseJoinColumns = { @JoinColumn(name = "roditelj_ID") })
	 private List<Roditelj> roditelj;
	 
	public Ucenik() {
		
	}

	public List<UcenikPredmet> getUcenik_predmet() {
		return ucenik_predmet;
	}

	public void setUcenik_predmet(List<UcenikPredmet> ucenik_predmet) {
		this.ucenik_predmet = ucenik_predmet;
	}

	public List<Upis> getUpis() {
		return upis;
	}

	public void setUpis(List<Upis> upis) {
		this.upis = upis;
	}

	public List<Prisustvo> getPrisustvo() {
		return prisustvo;
	}

	public void setPrisustvo(List<Prisustvo> prisustvo) {
		this.prisustvo = prisustvo;
	}

	public List<Roditelj> getRoditelj() {
		return roditelj;
	}

	public void setRoditelj(List<Roditelj> roditelj) {
		this.roditelj = roditelj;
	}

	public int getUcenik_ID() {
		return ucenik_ID;
	}

	public void setUcenik_ID(int ucenik_ID) {
		this.ucenik_ID = ucenik_ID;
	}

	public String getBroj_knjizice() {
		return broj_knjizice;
	}

	public void setBroj_knjizice(String broj_knjizice) {
		this.broj_knjizice = broj_knjizice;
	}

	public String getIme_roditelja() {
		return ime_roditelja;
	}

	public void setIme_roditelja(String ime_roditelja) {
		this.ime_roditelja = ime_roditelja;
	}

	public String getOsnovna_skola() {
		return osnovna_skola;
	}

	public void setOsnovna_skola(String osnovna_skola) {
		this.osnovna_skola = osnovna_skola;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Ucenik [ucenik_ID=" + ucenik_ID + ", broj_knjizice=" + broj_knjizice + ", ime_roditelja="
				+ ime_roditelja + ", osnovna_skola=" + osnovna_skola + "]";
	}
	
	
}

