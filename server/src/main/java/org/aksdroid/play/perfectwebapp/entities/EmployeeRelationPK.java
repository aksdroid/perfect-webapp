package org.aksdroid.play.perfectwebapp.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeRelationPK implements Serializable {

	private Integer employeeId;

	private Integer relatedEmployeeId;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getRelatedEmployeeId() {
		return relatedEmployeeId;
	}

	public void setRelatedEmployeeId(Integer relatedEmployeeId) {
		this.relatedEmployeeId = relatedEmployeeId;
	}

}