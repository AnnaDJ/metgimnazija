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
import javax.persistence.Table;


@Entity
@Table(name="role")
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_ID")
	private int role_ID;
	
	@Column(name="naziv_role")
	private String naziv_role;

	
	 @ManyToMany(cascade={CascadeType.ALL})
	    @JoinTable(name = "role_user",
	            joinColumns = { @JoinColumn(name = "role_ID") },
	            inverseJoinColumns = { @JoinColumn(name = "user_ID") })
	 private List<User> user;
	
	public Role() {
		
	}

	public int getRole_ID() {
		return role_ID;
	}

	public void setRole_ID(int role_ID) {
		this.role_ID = role_ID;
	}

	public String getNaziv_role() {
		return naziv_role;
	}

	public void setNaziv_role(String naziv_role) {
		this.naziv_role = naziv_role;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Role [role_ID=" + role_ID + ", naziv_role=" + naziv_role + ", user=" + user + "]";
	}

	
}


