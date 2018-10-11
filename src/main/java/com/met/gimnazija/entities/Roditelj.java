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
@Table(name="roditelj")
public class Roditelj {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roditelj_ID")
	private int roditelj_ID;
	
	@OneToMany(mappedBy="roditelj",
			   cascade={CascadeType.ALL})
	private List<RoditeljskiSastanak> roditeljski_sastanak;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="user_ID")
	private User user;

	 @ManyToMany(cascade={CascadeType.ALL})
	    @JoinTable(name = "ucenik_roditelj",
	            joinColumns = { @JoinColumn(name = "roditelj_ID") },
	            inverseJoinColumns = { @JoinColumn(name = "ucenik_ID") })
	 private List<Ucenik> ucenik; 
	 
	public Roditelj() {
	
	}
	

	public List<Ucenik> getUcenik() {
		return ucenik;
	}


	public void setUcenik(List<Ucenik> ucenik) {
		this.ucenik = ucenik;
	}


	public int getRoditelj_ID() {
		return roditelj_ID;
	}

	public void setRoditelj_ID(int roditelj_ID) {
		this.roditelj_ID = roditelj_ID;
	}

	public List<RoditeljskiSastanak> getRoditeljski_sastanak() {
		return roditeljski_sastanak;
	}

	public void setRoditeljski_sastanak(List<RoditeljskiSastanak> roditeljski_sastanak) {
		this.roditeljski_sastanak = roditeljski_sastanak;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Roditelj [roditelj_ID=" + roditelj_ID + ", roditeljski_sastanak=" + roditeljski_sastanak + ", user="
				+ user + "]";
	}
	
	
	
	
}

