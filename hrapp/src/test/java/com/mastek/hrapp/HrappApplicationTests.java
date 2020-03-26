package com.mastek.hrapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.hrapp.dao.DepartmentJPADAO;
import com.mastek.hrapp.dao.EmployeeJPADAO;
import com.mastek.hrapp.dao.JobPositionDAO;
import com.mastek.hrapp.dao.ProjectJPADAO;
import com.mastek.hrapp.entities.CardPayment;
import com.mastek.hrapp.entities.ChequePayment;
import com.mastek.hrapp.entities.Department;
import com.mastek.hrapp.entities.Designation;
import com.mastek.hrapp.entities.Employee;
import com.mastek.hrapp.entities.JobPosition;
import com.mastek.hrapp.entities.Payment;
import com.mastek.hrapp.entities.PaymentJPADAO;
import com.mastek.hrapp.entities.Project;
import com.mastek.hrapp.services.EmployeeService;

@SpringBootTest class HrappApplicationTests {
    
    @Autowired // spring will provide the object using IOC, dependency Injection technique
    EmployeeService empSvc;
    
    @Autowired // spring will provide the object using IOC, dependency Injection technique
    EmployeeService empSvc1;
    
    @Autowired
    EmployeeJPADAO empDAO;
    
    @Autowired // spring will provide the object using IOC, dependency Injection technique
    DepartmentJPADAO deptDAO;
    
    @Autowired // spring will provide the object using IOC, dependency Injection technique
    ProjectJPADAO projectDAO;
    
    @Autowired
    PaymentJPADAO paymentDAO;
    
//    @Autowired // spring will provide the object using IOC, dependency Injection technique
//    DepartmentJPADAO orderDAO;
    
    @Autowired
    JobPositionDAO jobDAO;
    
    
    @Test
    void testFindEmployeesBySalary() {
    	double minSalary = 100.0;
    	double maxSalary = 5000.0;
    								// empDAO.findBySalary(minSalary, maxSalary)
    	Iterable<Employee> emps = empDAO.findBySalary(minSalary,maxSalary);
    	System.out.println("All Employees having salary between min:"+minSalary+" and max:"+maxSalary);
    	
    	for (Employee employee : emps) {
    		System.out.println(employee);
    	}
    }
    
    @Test
    void testFindEmployeesByDesignation() {
    	Iterable<Employee> emps = empDAO.findByDesignation(Designation.MANAGER);
    	System.out.println("All Employees with Designation as "+Designation.MANAGER);
    	
    	for (Employee employee : emps) {
    		System.out.println(employee);
    	}
    	
    }  
    
    @Test
    void testCashPaymentAdd() {
    	Payment CashP =  new Payment();
    	CashP.setAmount(100);
    	
    	CashP = paymentDAO.save(CashP);
    	
    	System.out.println(CashP);
    	assertNotNull(CashP, "Cash Payment Not Saved");
    }
    
    @Test
    void testCardPaymentAdd() {
    	CardPayment CardP =  new CardPayment();
    	CardP.setAmount(2300);
    	CardP.setCardNumber(12345678912l);
    	CardP.setCardService("VISA");
    	
    	CardP = paymentDAO.save(CardP);
    	System.out.println(CardP);
    	assertNotNull(CardP, "Card Payment not saved");
    	
    }
    
    @Test
    void testChequePaymentAdd() {
    	ChequePayment CheqP =  new ChequePayment();
    	CheqP.setAmount(444);
    	CheqP.setBankName("RBS");
    	CheqP.setChequeNumber(22333333);
    	
    	CheqP = paymentDAO.save(CheqP);
    	System.out.println(CheqP);
    	assertNotNull(CheqP, "Cheque Payment not saved");
    	
    }
    
    @Test
    void testEmployeeServiceExampleMethod() {
        empSvc.exampleMethod();
        empSvc1.exampleMethod();
    }
    
    
    @Test
    void testEmployeeDAOAdd() {
    	Employee emp = new Employee();
    	emp.setName("New Emp");
    	emp.setSalary(2334);
    	emp.setDesignation(Designation.MANAGER);
    	
    	emp = empDAO.save(emp);
    	System.out.println(emp);
    	assertNotNull(emp, "Employee Not Added");
    }
    
//    @Test
//    void testDepartmentDAOAdd() {
//    	Department dept = new Department();
//    	dept.setdeptname("Admin");
//    	dept.setlocation("UK");
//    	dept = deptDAO.save(dept);
//    	
//    	assertNotNull(dept, "Department Not Added");
//    }
    
//    @Test
//    void testProjectDAOAdd() {
//    	Project Project = new Project();
//    	Project.setprojectname("NHS");
//    	Project.setcustname("UK");
//    	
//    	Project = projectDAO.save(Project);
//    	System.out.println(Project);
//    	assertNotNull(Project, "Project Not Added");
//    }
    
    @Test
    void testListEmployee() {
    	Iterable<Employee> emp = empDAO.findAll();
    	assertNotNull(emp,"Departments not Found");
    	for (Employee employee : emp) {
    		System.out.println(employee);
    	}
    }
    
//    @Test
//    void testListDepartment() {
//    	Iterable<Department> dept = deptDAO.findAll();
//    	assertNotNull(dept, "Departments not Found");
//    	for (Department department : dept) {
//    		System.out.println(department);
//    	}
//    }
    
//    @Test
//    void testListProject() {
//    	Iterable<Project> project = projectDAO.findAll();
//    	assertNotNull(project, "Projects not Found");
//    	for (Project Project : project) {
//    		System.out.println(project);
//    	}
//    }
    
//    @Test
//    void testUpdateEmployees() {
//    	Employee emp = empDAO.findById(1).get();
//    	System.out.println("Employee Fetch:"+emp);
//    	
//    	emp.setSalary(emp.getSalary()+1001);
//    	emp.setDesignation(Designation.TESTER);
//    	
//    	emp = empDAO.save(emp);
//    	
//    	System.out.println("Updated Employee:"+emp);	
//    }
    
   /* @Test
    void testDeleteEmployeeById() {
    	// empDAO.delete(emp); deletes by Object.
    	// empDAO.deleteById(25); // deletes by Id.
    }*/
    
//    @Test
//    void testAssignEmployeeToDepartment() {
//    Employee emp = empSvc.assignEmployeeToDepartment(1,17);
//    assertNotNull(emp.getCurrentDepartment(),"Department Not Assigned");
//    }
//    
//    @Test
//    void testAssignEmployeeToProject() {
//    	Employee emp = empSvc.assignEmployeeToProject(2,33);
//    	assertTrue(emp.getProjectsAssigned().size()>0,"Project Not Assigned");
//    }
    
    
    @Test
    void testAddJobPositionDocument() {
    	JobPosition jp = new JobPosition();
    	jp.setJobId(126);
    	jp.setLocation("LEEDS");
    	jp.setClientName("NHS");
    	jp.setSkillsRequired("Java");
    	jp.setNumberOfPositions(3);
    	
    	jp = jobDAO.save(jp);
    	
    	assertNotNull(jp,"Job Position Not Saved");
    	
    }
    
    @Test
    void testListAllJobPositions() {
    	System.out.println("Print All Job Positions");
    	for(JobPosition jp : jobDAO.findAll()) {
    		System.out.println(jp);
    	}
    }
    
//    @Test
//    void testApplyForJobPositions() {
//    	int jobId=124;
//    	int empno=2;
//    	JobPosition jp = empSvc.applyForJobPosition(jobId, empno);
//   
//    	assertNotNull(jp,"job not applied");
//   
//    	System.out.println("Applications for JOB ID:"+jobId);
//    	for (Employee applicant : jp.getApplicants()) {
//    		System.out.println(applicant);
//    	}   
//    }
    
}