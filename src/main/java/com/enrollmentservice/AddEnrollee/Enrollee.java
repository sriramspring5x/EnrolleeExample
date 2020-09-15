package com.enrollmentservice.AddEnrollee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Enrollee")
public class Enrollee {

	@Id
	@Column(name = "id")
	private long id;

	@Column
	private String name;

	@Column
	private boolean activation_status;

	@Column
	private String Dateofbirth;

	private int port;

	// @OneToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "dependent_id", referencedColumnName = "id")
	// private Dependent_Enrolle dependent;

	public Enrollee() {
	}

	public Enrollee(long id, String name, boolean activation_status, String dateofbirth, int port) {
		super();
		this.id = id;
		this.name = name;
		this.activation_status = activation_status;
		Dateofbirth = dateofbirth;
		this.port = port;
		// this.dependent = dependent;
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
		return Dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		Dateofbirth = dateofbirth;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	// public Dependent_Enrolle getDependent() {
	// return dependent;
	// }
	//
	//
	// public void setDependent(Dependent_Enrolle dependent) {
	// this.dependent = dependent;
	// }

}
