package com.enrollmentservice.AddEnrollee;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Enrollees")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Enrollee {

	@Id
	@Column(name = "id")
	private long id;

	@Column
	private String name;

	@Column
	private boolean activation_status;

	@Column
	private String dateofbirth;

	private int port;

	@OneToMany(mappedBy ="enrollee")
	private List<Dependent_Enrolle> dependent;

	public Enrollee() {
	}

	public Enrollee(long id, String name, boolean activation_status, String dateofbirth, int port) {
		super();
		this.id = id;
		this.name = name;
		this.activation_status = activation_status;
		this.dateofbirth = dateofbirth;
		this.port = port;
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActivation_status() {
		return activation_status;
	}

	public void setActivation_status(boolean activation_status) {
		this.activation_status = activation_status;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public List<Dependent_Enrolle> getDependent() {
		return dependent;
	}

	public void setDependent(List<Dependent_Enrolle> dependent) {
		this.dependent = dependent;
	}



}
