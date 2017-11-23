package org.aksdroid.play.perfectwebapp.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class EmployeeRelationPK implements Serializable {

	private static final long serialVersionUID = 2511054453294293138L;

	private Integer employeeId;

	@OneToOne
	@JoinColumn(name = "relatedEmployeeId", referencedColumnName = "employeeId")
	private Employee relatedEmployee;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Employee getRelatedEmployee() {
		return relatedEmployee;
	}

	public void setRelatedEmployee(Employee relatedEmployee) {
		this.relatedEmployee = relatedEmployee;
	}

}