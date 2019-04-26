package com.stayoh.hospitality.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity

@Table(name="Orders")
public class Order {
	    @Id
	    @GeneratedValue
	    private int order_id;
	    private String name;
	    private int empid;
	    private int mobile_no;
	    @Temporal(TemporalType.DATE)
	    private Date orderdate;
	    @Temporal(TemporalType.DATE)
	    private Date updatedate;
	    @OneToMany(mappedBy = "orderuser", cascade = CascadeType.ALL)
	    private List<Iteam> iteamList;
		
	    public int getOrder_id() {
			return order_id;
		}
		public void setOrder_id(int order_id) {
			this.order_id = order_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public int getMobile_no() {
			return mobile_no;
		}
		public void setMobile_no(int mobile_no) {
			this.mobile_no = mobile_no;
		}
		
		public Date getUpdatedate() {
			return updatedate;
		}
		public void setUpdatedate(Date updatedate) {
			this.updatedate = updatedate;
		}
		public Date getOrderdate() {
			return orderdate;
		}
		public void setOrderdate(Date orderdate) {
			this.orderdate = orderdate;
		}
		public List<Iteam> getIteamList() {
			return iteamList;
		}
		public void setIteamList(List<Iteam> iteamList) {
			this.iteamList = iteamList;
		}
		
		
	    
}
