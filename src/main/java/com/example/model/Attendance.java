package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Attendance")
public class Attendance 
{
	@Id
	private String date;
	
	@Column
	private String a101,a102,a103,a104,a105,a106,a107,a108,a109,a110;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getA101() {
		return a101;
	}
	public void setA101(String a101) {
		this.a101 = a101;
	}
	public String getA102() {
		return a102;
	}
	public void setA102(String a102) {
		this.a102 = a102;
	}
	public String getA103() {
		return a103;
	}
	public void setA103(String a103) {
		this.a103 = a103;
	}
	public String getA104() {
		return a104;
	}
	public void setA104(String a104) {
		this.a104 = a104;
	}
	public String getA105() {
		return a105;
	}
	public void setA105(String a105) {
		this.a105 = a105;
	}
	public String getA106() {
		return a106;
	}
	public void setA106(String a106) {
		this.a106 = a106;
	}
	public String getA107() {
		return a107;
	}
	public void setA107(String a107) {
		this.a107 = a107;
	}
	public String getA108() {
		return a108;
	}
	public void setA108(String a108) {
		this.a108 = a108;
	}
	public String getA109() {
		return a109;
	}
	public void setA109(String a109) {
		this.a109 = a109;
	}
	public String getA110() {
		return a110;
	}
	public void setA110(String a110) {
		this.a110 = a110;
	}
	
	@Override
	public String toString() {
		return "Attendance [date=" + date + ", a101=" + a101 + ", a102=" + a102 + ", a103=" + a103 + ", a104=" + a104
				+ ", a105=" + a105 + ", a106=" + a106 + ", a107=" + a107 + ", a108=" + a108 + ", a109=" + a109
				+ ", a110=" + a110 + "]";
	}
	
	
	
}
