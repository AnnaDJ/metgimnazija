package com.met.gimnazija.entities;

import java.util.ArrayList;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_ID")
	private int user_ID;
	
	@Column(name="ime")
	private String ime;
	
	@Column(name="prezime")
	private String prezime;
	
	@Column(name="JMBG")
	private String JMBG;
	
	@Column(name="datum_rodjenja")
	private Date datum_rodjenja;
	
	@Column(name="adresa")
	private String adresa;
	
	@Column(name="grad")
	private String grad;
	
	@Column(name="telefon")
	private String telefon;
	
	@Column(name="display_name")
	private String display_name;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="LDAPCN")
	private String LDAPCN;
	
	@Column(name="email")
	private String email;
		
	@OneToMany(mappedBy="user",
			cascade = { CascadeType.MERGE, CascadeType.DETACH,
					CascadeType.REFRESH, CascadeType.PERSIST})
	private List<Ucenik> ucenici;
	
	@OneToMany(mappedBy="user",
			   cascade={CascadeType.ALL})
	private List<Zaposleni> zaposleni;
	
	@OneToMany(mappedBy="user",
			   cascade={CascadeType.ALL})
	private List<Roditelj> roditelj;
	
	 @ManyToMany(cascade={CascadeType.ALL})
	    @JoinTable(name = "role_user",
	            joinColumns = { @JoinColumn(name = "user_ID") },
	            inverseJoinColumns = { @JoinColumn(name = "role_ID") })
	 private List<Role> role;
	
	
	public User() {
		
	}

	public List<Zaposleni> getZaposleni() {
		return zaposleni;
	}

	public void setZaposleni(List<Zaposleni> zaposleni) {
		this.zaposleni = zaposleni;
	}

	public List<Roditelj> getRoditelj() {
		return roditelj;
	}

	public void setRoditelj(List<Roditelj> roditelj) {
		this.roditelj = roditelj;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public Date getDatum_rodjenja() {
		return datum_rodjenja;
	}

	public void setDatum_rodjenja(Date datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLDAPCN() {
		return LDAPCN;
	}

	public void setLDAPCN(String lDAPCN) {
		LDAPCN = lDAPCN;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Ucenik> getUcenici() {
		return ucenici;
	}

	public void setUcenici(List<Ucenik> ucenici) {
		this.ucenici = ucenici;
	}

	@Override
	public String toString() {
		return "User [user_ID=" + user_ID + ", ime=" + ime + ", prezime=" + prezime + ", JMBG=" + JMBG
				+ ", datum_rodjenja=" + datum_rodjenja + ", adresa=" + adresa + ", grad=" + grad + ", telefon="
				+ telefon + ", display_name=" + display_name + ", username=" + username + ", password=" + password
				+ ", LDAPCN=" + LDAPCN + ", email=" + email + "]";
	}
	
	public void add(Ucenik tempUcenik) {
		
		if (ucenici == null) {
			ucenici = new ArrayList<>();
		}
		
		ucenici.add(tempUcenik);
	}
	
}

