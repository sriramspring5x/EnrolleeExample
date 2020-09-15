package com.enrollmentservice.AddEnrollee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Dependant_Enrolle")
public class Dependent_Enrolle {
	

	@Column(name= "id")
	@Id
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String birthdate;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
    private Enrollee enrollee;
	
	public Dependent_Enrolle() {
		
	}
	
	public Dependent_Enrolle(String name, long id, String birthdate) {
		super();
		this.name = name;
		this.id = id;
		this.birthdate = birthdate;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}



}
