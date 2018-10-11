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
@Table(name="modeli_placanja_i_stipendije")
public class ModeliPlacanjaIStipendije {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="model_placanja_ID")
	private int model_placanja_ID;
	
	@Column(name="naziv_modela")
	private String naziv_modela;
	
	@Column(name="opis")
	private String opis;
	
	@Column(name="popust")
	private double popust;
	
	@Column(name="kamata")
	private double kamata;
	
	@Column(name="zatezna_kamata")
	private double zatezna_kamata;

	
	@OneToMany(mappedBy="modeli_placanja_i_stipendije",
			   cascade={CascadeType.ALL})
	private List<Cenovnik> cenovnik;
	
	
	public List<Cenovnik> getCenovnik() {
		return cenovnik;
	}

	public void setCenovnik(List<Cenovnik> cenovnik) {
		this.cenovnik = cenovnik;
	}

	public void setModel_placanja_ID(int model_placanja_ID) {
		this.model_placanja_ID = model_placanja_ID;
	}

	public ModeliPlacanjaIStipendije() {
		
	}

	public int getModel_placanja_ID() {
		return model_placanja_ID;
	}

	public void setModel_placanja_id(int model_placanja_id) {
		this.model_placanja_ID = model_placanja_id;
	}

	public String getNaziv_modela() {
		return naziv_modela;
	}

	public void setNaziv_modela(String naziv_modela) {
		this.naziv_modela = naziv_modela;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}

	public double getKamata() {
		return kamata;
	}

	public void setKamata(double kamata) {
		this.kamata = kamata;
	}

	public double getZatezna_kamata() {
		return zatezna_kamata;
	}

	public void setZatezna_kamata(double zatezna_kamata) {
		this.zatezna_kamata = zatezna_kamata;
	}

	@Override
	public String toString() {
		return "ModeliPlacanjaIStipendije [model_placanja_id=" + model_placanja_ID + ", naziv_modela=" + naziv_modela
				+ ", opis=" + opis + ", popust=" + popust + ", kamata=" + kamata + ", zatezna_kamata=" + zatezna_kamata
				+ "]";
	}
	
	
}
