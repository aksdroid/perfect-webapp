package org.aksdroid.play.perfectwebapp.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee_relation")
public class EmployeeRelation {

	@EmbeddedId
	private EmployeeRelationPK id;

	@Column
	private String relationType;

	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public EmployeeRelationPK getId() {
		return id;
	}

	public void setId(EmployeeRelationPK id) {
		this.id = id;
	}
}