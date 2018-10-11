package com.met.gimnazija.entities;


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
@Table(name="prisustvo")
public class Prisustvo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prisustvo_ID")
	private int prisustvo_ID;
	
	@Column(name = "opravdano")
    private String opravdano;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="cas_ID")
	private Cas cas;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="ucenik_ID")
	private Ucenik ucenik;
	
	public Prisustvo() {
		
	}

	public Ucenik getUcenik() {
		return ucenik;
	}

	public void setUcenik(Ucenik ucenik) {
		this.ucenik = ucenik;
	}

	public int getPrisustvo_ID() {
		return prisustvo_ID;
	}

	public void setPrisustvo_ID(int prisustvo_ID) {
		this.prisustvo_ID = prisustvo_ID;
	}

	public String getOpravdano() {
		return opravdano;
	}

	public void setOpravdano(String opravdano) {
		this.opravdano = opravdano;
	}

	public Cas getCas() {
		return cas;
	}

	public void setCas(Cas cas) {
		this.cas = cas;
	}

	@Override
	public String toString() {
		return "Prisustvo [prisustvo_ID=" + prisustvo_ID + ", opravdano=" + opravdano + ", cas=" + cas + "]";
	}
	
	
	
	
}

