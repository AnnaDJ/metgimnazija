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
@Table(name="cenovnik")
public class Cenovnik {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cenovnik_ID")
	private int cenovnik_ID;
	
	@Column(name="naziv_stavke")
	private String naziv_stavke;
	
	@Column(name="sifra_stavke")
	private Integer sifra_stavke;
	
	@Column(name="cena_stavke")
	private Float cena_stavke;
	
	@Column(name="valuta")
	private String valuta;
	
	@Column(name="date_created")
	private Date date_created;

	@Column(name="created_by")
	private Integer created_by;
	
	@Column(name="date_modified")
	private Date date_modified;
	
	@Column(name="modified_by")
	private Integer modified_by;
	
	@OneToMany(mappedBy="cenovnik",
			   cascade={CascadeType.ALL})
	private List<Zaduzenja> zaduzenja;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="model_placanja_ID")
	private ModeliPlacanjaIStipendije modeli_placanja_i_stipendije;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="skolska_godina_ID")
	private SkolskaGodina skolska_godina;
	
	 public List<Zaduzenja> getZaduzenja() {
		return zaduzenja;
	}

	public void setZaduzenja(List<Zaduzenja> zaduzenja) {
		this.zaduzenja = zaduzenja;
	}

	public ModeliPlacanjaIStipendije getModeli_placanja_i_stipendije() {
		return modeli_placanja_i_stipendije;
	}

	public void setModeli_placanja_i_stipendije(ModeliPlacanjaIStipendije modeli_placanja_i_stipendije) {
		this.modeli_placanja_i_stipendije = modeli_placanja_i_stipendije;
	}

	public SkolskaGodina getSkolska_godina() {
		return skolska_godina;
	}

	public void setSkolska_godina(SkolskaGodina skolska_godina) {
		this.skolska_godina = skolska_godina;
	}

	public Cenovnik() {
			
		}

	public int getCenovnik_ID() {
		return cenovnik_ID;
	}

	public void setCenovnik_ID(int cenovnik_ID) {
		this.cenovnik_ID = cenovnik_ID;
	}

	public String getNaziv_stavke() {
		return naziv_stavke;
	}

	public void setNaziv_stavke(String naziv_stavke) {
		this.naziv_stavke = naziv_stavke;
	}

	public Integer getSifra_stavke() {
		return sifra_stavke;
	}

	public void setSifra_stavke(Integer sifra_stavke) {
		this.sifra_stavke = sifra_stavke;
	}

	public Float getCena_stavke() {
		return cena_stavke;
	}

	public void setCena_stavke(Float cena_stavke) {
		this.cena_stavke = cena_stavke;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Date getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
	}

	public Integer getModified_by() {
		return modified_by;
	}

	public void setModified_by(Integer modified_by) {
		this.modified_by = modified_by;
	}

	@Override
	public String toString() {
		return "Cenovnik [cenovnik_ID=" + cenovnik_ID + ", naziv_stavke=" + naziv_stavke + ", sifra_stavke="
				+ sifra_stavke + ", cena_stavke=" + cena_stavke + ", valuta=" + valuta + ", date_created="
				+ date_created + ", created_by=" + created_by + ", date_modified=" + date_modified + ", modified_by="
				+ modified_by + "]";
	}

}
