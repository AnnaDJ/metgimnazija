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
@Table(name="uplate")
public class Uplate {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="uplate_ID")
	private int uplate_ID;
	
	@Column(name="datum_placanja")
	private Date datum_placanja;
	
	@Column(name="iznos_uplate_din")
	private Float iznos_uplate_din;
	
	@Column(name="iznos_uplate_eur")
	private Float iznos_uplate_eur;
	
	@Column(name="srednji_kurs")
	private Float srednji_kurs;
	
	@Column(name="napomena")
	private String napomena;
	

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="zaduzenje_ID")
	private Zaduzenja zaduzenja;
	
	 public Uplate() {
			
		}

	public Zaduzenja getZaduzenja() {
		return zaduzenja;
	}

	public void setZaduzenja(Zaduzenja zaduzenja) {
		this.zaduzenja = zaduzenja;
	}

	public int getUplate_ID() {
		return uplate_ID;
	}

	public void setUplate_ID(int uplate_ID) {
		this.uplate_ID = uplate_ID;
	}

	public Date getDatum_placanja() {
		return datum_placanja;
	}

	public void setDatum_placanja(Date datum_placanja) {
		this.datum_placanja = datum_placanja;
	}

	public Float getIznos_uplate_din() {
		return iznos_uplate_din;
	}

	public void setIznos_uplate_din(Float iznos_uplate_din) {
		this.iznos_uplate_din = iznos_uplate_din;
	}

	public Float getIznos_uplate_eur() {
		return iznos_uplate_eur;
	}

	public void setIznos_uplate_eur(Float iznos_uplate_eur) {
		this.iznos_uplate_eur = iznos_uplate_eur;
	}

	public Float getSrednji_kurs() {
		return srednji_kurs;
	}

	public void setSrednji_kurs(Float srednji_kurs) {
		this.srednji_kurs = srednji_kurs;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	@Override
	public String toString() {
		return "Uplate [uplate_ID=" + uplate_ID + ", datum_placanja=" + datum_placanja + ", iznos_uplate_din="
				+ iznos_uplate_din + ", iznos_uplate_eur=" + iznos_uplate_eur + ", srednji_kurs=" + srednji_kurs
				+ ", napomena=" + napomena + "]";
	}
	 
}
