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
@Table(name = "zaposleni")
public class Zaposleni {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zaposleni_ID")
    private int zaposleni_ID;
	
    @Column(name = "zvanje")
    private String zvanje;
	
    @Column(name = "SSS")
    private String SSS;
	
    @Column(name = "pozicija")
    private String pozicija;
	
    @Column(name = "banka")
    private String banka;

    @Column(name = "broj_racuna")
    private String broj_racuna;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="user_ID")
	private User user;
	
	public Zaposleni() {
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getZaposleni_ID() {
		return zaposleni_ID;
	}

	public void setZaposleni_ID(int zaposleni_ID) {
		this.zaposleni_ID = zaposleni_ID;
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	public String getSSS() {
		return SSS;
	}

	public void setSSS(String sSS) {
		SSS = sSS;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public String getBanka() {
		return banka;
	}

	public void setBanka(String banka) {
		this.banka = banka;
	}

	public String getBroj_racuna() {
		return broj_racuna;
	}

	public void setBroj_racuna(String broj_racuna) {
		this.broj_racuna = broj_racuna;
	}

	@Override
	public String toString() {
		return "Zaposleni [zaposleni_ID=" + zaposleni_ID + ", zvanje=" + zvanje + ", SSS=" + SSS + ", pozicija="
				+ pozicija + ", banka=" + banka + ", broj_racuna=" + broj_racuna + ", user=" + user + "]";
	}


	
  
  
  
  

}
