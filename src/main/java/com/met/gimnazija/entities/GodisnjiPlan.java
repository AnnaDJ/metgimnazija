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
@Table(name="godisnji_plan")
public class GodisnjiPlan {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="godisnji_plan_ID")
	private int godisnji_plan_ID;
	
	@Column(name="naziv_skole")
	private String naziv_skole;
	
	@Column(name="usvojen")
	private Integer usvojen;
	
	@Column(name="datum_usvajanja")
	private Date datum_usvajanja;
	
	@Column(name="vazi_do")
	private Date vazi_do;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="skolska_godina_ID")
	private SkolskaGodina skolska_godina;

	 @OneToMany(mappedBy="godisnji_plan",
			   cascade={CascadeType.ALL})
	private List<NastavniPlanPredmet> nastavni_plan_predmet;
	 
	public SkolskaGodina getSkolska_godina() {
		return skolska_godina;
	}

	public void setSkolska_godina(SkolskaGodina skolska_godina) {
		this.skolska_godina = skolska_godina;
	}

	public List<NastavniPlanPredmet> getNastavni_plan_predmet() {
		return nastavni_plan_predmet;
	}

	public void setNastavni_plan_predmet(List<NastavniPlanPredmet> nastavni_plan_predmet) {
		this.nastavni_plan_predmet = nastavni_plan_predmet;
	}

	public GodisnjiPlan() {
		
	}

	public int getGodisnji_plan_ID() {
		return godisnji_plan_ID;
	}

	public void setGodisnji_plan_ID(int godisnji_plan_ID) {
		this.godisnji_plan_ID = godisnji_plan_ID;
	}

	public String getNaziv_skole() {
		return naziv_skole;
	}

	public void setNaziv_skole(String naziv_skole) {
		this.naziv_skole = naziv_skole;
	}

	public Integer getUsvojen() {
		return usvojen;
	}

	public void setUsvojen(Integer usvojen) {
		this.usvojen = usvojen;
	}

	public Date getDatum_usvajanja() {
		return datum_usvajanja;
	}

	public void setDatum_usvajanja(Date datum_usvajanja) {
		this.datum_usvajanja = datum_usvajanja;
	}

	public Date getVazi_do() {
		return vazi_do;
	}

	public void setVazi_do(Date vazi_do) {
		this.vazi_do = vazi_do;
	}

	@Override
	public String toString() {
		return "GodisnjiPlan [godisnji_plan_ID=" + godisnji_plan_ID + ", naziv_skole=" + naziv_skole + ", usvojen="
				+ usvojen + ", datum_usvajanja=" + datum_usvajanja + ", vazi_do=" + vazi_do + "]";
	}
	
	
}
