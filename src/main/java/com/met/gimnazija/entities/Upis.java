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
@Table(name="upis")
public class Upis {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="upis_ID")
	private int upis_ID;
	
	@Column(name="datum_upisa")
	private Date datum_upisa;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="ucenik_ID")
	private Ucenik ucenik;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="odeljenje_ID")
	private Odeljenje odeljenje;
	
	@OneToMany(mappedBy="upis",
			   cascade={CascadeType.ALL})
	private List<Zaduzenja> zaduzenja;
	public Upis() {
		
	}
	
	public Ucenik getUcenik() {
		return ucenik;
	}

	public void setUcenik(Ucenik ucenik) {
		this.ucenik = ucenik;
	}

	public Odeljenje getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(Odeljenje odeljenje) {
		this.odeljenje = odeljenje;
	}

	public List<Zaduzenja> getZaduzenja() {
		return zaduzenja;
	}

	public void setZaduzenja(List<Zaduzenja> zaduzenja) {
		this.zaduzenja = zaduzenja;
	}

	public int getUpis_ID() {
		return upis_ID;
	}

	public void setUpis_ID(int upis_ID) {
		this.upis_ID = upis_ID;
	}

	public Date getDatum_upisa() {
		return datum_upisa;
	}

	public void setDatum_upisa(Date datum_upisa) {
		this.datum_upisa = datum_upisa;
	}
	@Override
	public String toString() {
		return "Upis [upis_ID=" + upis_ID + ", datum_upisa=" + datum_upisa + "]";
	}
	
	
}
