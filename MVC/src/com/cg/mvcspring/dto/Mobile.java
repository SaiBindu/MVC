package com.cg.mvcspring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobileonedata")

public class Mobile {
     @Id
     @Column(name = "mob_id")
	Integer mobId;
     @Column(name = "mob_name")
	String mobName;
     @Column( name = "mob_price")
	Double mobPrice;
     @Column(name = "mob_cato")
	String mobCategory;
     
     @Column(name = "mob_online")
     String online;
    
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	public Integer getMobId() {
		return mobId;
	}
	public void setMobId(Integer mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public Double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(Double mobPrice) {
		this.mobPrice = mobPrice;
	}
	public String getMobCategory() {
		return mobCategory;
	}
	public void setMobCategory(String mobCategory) {
		this.mobCategory = mobCategory;
	}
	
	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", mobName=" + mobName
				+ ", mobPrice=" + mobPrice + ", mobCategory=" + mobCategory
				+ ", online=" + online + "]";
	}
	public Mobile(Integer mobId, String mobName, Double mobPrice,
			String mobCategory) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobPrice = mobPrice;
		this.mobCategory = mobCategory;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
