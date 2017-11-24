package org.aksdroid.play.perfectwebapp.repositories;

import java.util.List;

import org.aksdroid.play.perfectwebapp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT er.id.relatedEmployee FROM EmployeeRelation er WHERE er.id.employeeId=:employeeId")
	public List<Employee> findRelatedEmployees(@Param("employeeId") Integer employeeId);

}
