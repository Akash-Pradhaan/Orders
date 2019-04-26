package com.stayoh.hospitality.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Iteam {
	@Id
	@GeneratedValue
	private int iteam_id;	
	private String iteam_name;
	private String status;
	 @ManyToOne
	 @JoinColumn(name = "order_id")
	private Order orderuser;	
	
	public int getIteam_id() {
		return iteam_id;
	}
	public void setIteam_id(int iteam_id) {
		this.iteam_id = iteam_id;
	}
	public String getIteam_name() {
		return iteam_name;
	}
	public void setIteam_name(String iteam_name) {
		this.iteam_name = iteam_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
