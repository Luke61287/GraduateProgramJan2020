package com.mastek.hrapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlTransient;

@Entity // declares the class as Entity, to be managed by JPA.
@Table(name="JPA_Project") // declare the table name associated with this class.
public class Project {
	
	int projectno;
	
	@FormParam("projname")
	String projectname;
	
	@FormParam("custname")
	String custname;
	
	Set<Employee> projectTeam= new HashSet<>();

	@ManyToMany(mappedBy="projectsAssigned")
	@XmlTransient // ignore the association property when shared via Service.
	public Set<Employee> getProjectTeam() {
		return projectTeam;
	}

	public void setProjectTeam(Set<Employee> projectTeam) {
		this.projectTeam = projectTeam;
	}

	public Project() {
		// TODO Auto-generated constructor stub.
	}
	
	@Id // marking the property as primary Key for the table.
	@Column(name="Project_number") // using Column to provide the default column name.
	@GeneratedValue(strategy=GenerationType.AUTO) // Auto Numbering configuration as per DB.
	public int getprojectno() {
		return projectno;
	}

	public void setprojectno(int projectno) {
		this.projectno = projectno;
	}
	
	@Column(name="project_name", length=50, nullable=false)
	public String getprojectname() {
		return projectname;
	}

	public String setprojectname(String projectname) {
		return this.projectname = projectname;
	}
	
	@Column(name="customer_name", length=50, nullable=false)
	public String getcustname() {
		return custname;
	}

	public void setcustname(String custname) {
		this.custname = custname;
	}
	
	@Override
	public String toString() {
		return "Project [projectno=" + projectno + ", projectname=" + projectname + ", custname=" + custname
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectno;
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
		Project other = (Project) obj;
		if (projectno != other.projectno)
			return false;
		return true;
	}

}