package com.mastek.hrapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlTransient;

@Entity // declares the class as Entity, to be managed by JPA.
@Table(name="JPA_Department") // declare the table name associated with this class.
public class Department {
	
	int deptno;
	
	@FormParam("name")
	String deptname;
	
	@FormParam("location")
	String location;
	
	Set<Employee> team = new HashSet<>();

	@OneToMany(mappedBy="currentDepartment", cascade=CascadeType.ALL) // One Employee is associated with one of the many Departments.
	@XmlTransient // ignore the association property when shared via Service.
	public Set<Employee> getTeam() {
		return team;
	}
	
	public void setTeam(Set<Employee> team) {
		this.team = team;
	}

	public Department() {
		// TODO Auto-generated constructor stub.
	}
	
	@Id // marking the property as primary Key for the table.
	@Column(name="department_number") // using Column to provide the default column name.
	@GeneratedValue(strategy=GenerationType.AUTO) // Auto Numbering configuration as per DB.
	public int getdeptno() {
		return deptno;
	}

	public void setdeptno(int deptno) {
		this.deptno = deptno;
	}
	
	@Column(name="department_name", length=50, nullable=false)
	public String getdeptname() {
		return deptname;
	}

	public String setdeptname(String deptname) {
		return this.deptname = deptname;
	}
	
	@Column(name="location", length=50, nullable=false)
	public String getlocation() {
		return location;
	}

	public void setlocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptname=" + deptname + ", location=" + location
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptno != other.deptno)
			return false;
		return true;
	}

}