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

import com.sun.jmx.snmp.Timestamp;

@Entity
@Table(name="roditeljski_sastanak")
public class RoditeljskiSastanak {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roditeljski_sastanak_ID")
	private int roditeljski_sastanak_ID;
	
	@Column(name="datum")
	private Timestamp datum;
	
	@Column(name="napomena")
	private String napomena;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="zaposleni_ID")
	private Zaposleni zaposleni;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="roditelj_ID")
	private Roditelj roditelj;

	public RoditeljskiSastanak() {
		
	}
	
	public Roditelj getRoditelj() {
		return roditelj;
	}

	public void setRoditelj(Roditelj roditelj) {
		this.roditelj = roditelj;
	}

	public int getRoditeljski_sastanak_ID() {
		return roditeljski_sastanak_ID;
	}

	public void setRoditeljski_sastanak_ID(int roditeljski_sastanak_ID) {
		this.roditeljski_sastanak_ID = roditeljski_sastanak_ID;
	}

	public Timestamp getDatum() {
		return datum;
	}

	public void setDatum(Timestamp datum) {
		this.datum = datum;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public Zaposleni getZaposleni() {
		return zaposleni;
	}

	public void setZaposleni(Zaposleni zaposleni) {
		this.zaposleni = zaposleni;
	}

	@Override
	public String toString() {
		return "RoditeljskiSastanak [roditeljski_sastanak_ID=" + roditeljski_sastanak_ID + ", datum=" + datum
				+ ", napomena=" + napomena + ", zaposleni=" + zaposleni + "]";
	}
	
	
	
}


