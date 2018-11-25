package com.learning.data.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Students implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long S1mark1;
	private Long S2mark2;
	private String S0studentName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getS1mark1() {
		return S1mark1;
	}
	public void setS1mark1(Long s1mark1) {
		S1mark1 = s1mark1;
	}
	public Long getS2mark2() {
		return S2mark2;
	}
	public void setS2mark2(Long s2mark2) {
		S2mark2 = s2mark2;
	}
	public String getS0studentName() {
		return S0studentName;
	}
	public void setS0studentName(String s0studentName) {
		S0studentName = s0studentName;
	}
	
}
