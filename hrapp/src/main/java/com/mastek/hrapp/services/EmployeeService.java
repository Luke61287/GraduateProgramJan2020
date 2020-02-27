package com.mastek.hrapp.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.hrapp.apis.DepartmentAPI;
import com.mastek.hrapp.apis.EmployeeAPI;
import com.mastek.hrapp.apis.ProjectAPI;
import com.mastek.hrapp.dao.DepartmentJPADAO;
import com.mastek.hrapp.dao.EmployeeJPADAO;
import com.mastek.hrapp.dao.JobPositionDAO;
import com.mastek.hrapp.dao.ProjectJPADAO;
import com.mastek.hrapp.entities.Department;
import com.mastek.hrapp.entities.Employee;
import com.mastek.hrapp.entities.JobPosition;
import com.mastek.hrapp.entities.Project;

@Component // marking the class as bean to be created.
@Scope("singleton") // singleton: one object used across test cases, prototype: one object per request.
public class EmployeeService implements EmployeeAPI, DepartmentAPI, ProjectAPI {
	
	String exampleProperty;
	
	@Autowired
	EmployeeJPADAO empDAO;
	
	@Autowired
	DepartmentJPADAO deptDAO;
	
	@Autowired
	ProjectJPADAO projectDAO;
	
	@Autowired
	JobPositionDAO jobsDAO;

	public EmployeeService() {
		System.out.println("Employee Service Created");
	}
	
	@PostConstruct // initialisation method of the class.
	public void initializeService() {
		System.out.println("Employee Service Initialized");
	}
	
	@PreDestroy // calls before the shutting down the application.
	public void terminateService() {
		System.out.println("Employee Service Terminated");
	}

	public void exampleMethod() {
		System.out.println("Connect to "+getExampleProperty()+" for business data");
	}

	public String getExampleProperty() {
		return exampleProperty;
	}
	
	@Value("Spring Example Data Source")
	public void setExampleProperty(String exampleProperty) {
		System.out.println("Setting Example Property: "+exampleProperty);
		this.exampleProperty = exampleProperty;
	}

	@Transactional
	public Employee assignEmployeeToDepartment(int empno, int deptno) {
		Employee emp = empDAO.findById(empno).get(); // fetch the employee if exists.
		Department dept = deptDAO.findById(deptno).get(); // fetch the department if exists.
		
		// assign the association between employee and department.
		emp.setCurrentDepartment(dept); // assign the department to employee.
		dept.getTeam().add(emp); // add the employee in the department team.
		
		// save the changes in database.
		empDAO.save(emp);
		deptDAO.save(dept);
		
		return emp; // return the result.
	}

	@Transactional
	public Employee assignEmployeeToProject(int empno, int projectId) {
		Employee emp = empDAO.findById(empno).get(); // get employee object.
		Project newProject = projectDAO.findById(projectId).get(); // get the project object.
		
		emp.getProjectsAssigned().add(newProject); // assign employee to project.
		empDAO.save(emp); // save employee object.
		
		return emp; // return the employee object.
		
	}	
	
	@Transactional
	public JobPosition applyForJobPosition(int jobId, int empno) {
		JobPosition job = jobsDAO.findById(jobId).get();
		Employee emp = empDAO.findById(empno).get();
		
		job.getApplicants().add(emp);
		
		job = jobsDAO.save(job);
		return job;
		
	}

	@Override
	public Iterable<Employee> listAllEmployees() {
		System.out.println("Listing All Employees");
		return empDAO.findAll();
	}

	@Override
	public Employee findByEmpno(int empno) {
		// TODO Auto-generated method stub
		return empDAO.findById(empno).get();
	}

	@Override
	public Employee registerNewEmployee(Employee newEmployee) {
		newEmployee = empDAO.save(newEmployee);
		// TODO Auto-generated method stub
		return newEmployee;
	}

	@Override
	public Iterable<Department> listAllDepartment() {
		System.out.println("Listing All Deparments");
		return deptDAO.findAll();
	}

	@Override
	public Department findByDeptno(int deptno) {
		// TODO Auto-generated method stub
		return deptDAO.findById(deptno).get();
	}

	@Override
	public Department registerNewDepartment(Department newDepartment) {
		newDepartment = deptDAO.save(newDepartment);
		// TODO Auto-generated method stub
		return newDepartment;
	}

	@Override
	public Iterable<Project> listAllProject() {
		System.out.println("Listing All Project");
		return projectDAO.findAll();
	}

	@Override
	public Project findByProjectno(int projectno) {
		// TODO Auto-generated method stub
		return projectDAO.findById(projectno).get();
	}

	@Override
	public Project registerNewProject(Project newProject) {
		newProject = projectDAO.save(newProject);
		// TODO Auto-generated method stub
		return newProject;
		
	}
	
}