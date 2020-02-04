package com.mastek.training.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Collection;

import org.bson.Document;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mastek.training.hrapp.Designations;
import com.mastek.training.hrapp.Employee;
import com.mastek.training.hrapp.Grades;
import com.mastek.training.hrapp.dao.DataAccessObject;
import com.mastek.training.hrapp.dao.EmployeeMongoDAO;

class EmployeeDAOTests {
    
    DataAccessObject<Employee> empDAO;

    @BeforeEach
    void setUp() throws Exception {
        // empDAO = new EmployeeBinaryFileDAO("empdata.dat");
    	// empDAO = new EmployeeJSONFileDAO("empdata.json");
    	// empDAO = new EmployeeJBDCDAO();
    	empDAO = new EmployeeMongoDAO();
    }

    @AfterEach
    void tearDown() throws Exception {
    	
    }

    @Test
    void testAddEmployeeData() {
        Employee newEmp = new Employee();
        newEmp.setEmpno(1820);
        newEmp.setName("Example");
        newEmp.setDesignation(Designations.DEVELOPER);
        newEmp.setGrade(Grades.G6);
        newEmp.setUnitDaySalary(233);
        
//        String jsonOBJ = Employee.getJSONString(newEmp);
//        System.out.println(jsonOBJ);
//        
//        Employee exemp = Employee.parseJSONString(jsonOBJ);
//        System.out.println(exemp);
        
        newEmp = empDAO.add(newEmp); // return the object if saved successfully.
        assertNotNull(newEmp,"Employee Not Added");
        
        Employee fetchEmp = empDAO.find(1820);
        assertNotNull(fetchEmp,"Employee Not Found");
        
    }
    
    @Test
    void testListAllEmployees() {
    	Collection<Employee> emps= empDAO.listAll();
    	for (Employee employee : emps) {
    		System.out.println(employee);
    	}
    }
    
    @Test
    void testRemoveEmployee() {
    	Employee newEmp = new Employee();
        newEmp.setEmpno(9999);
        newEmp.setName("Remove Sample");
        newEmp.setDesignation(Designations.DEVELOPER);
        newEmp.setGrade(Grades.G6);
        newEmp.setUnitDaySalary(233);
        
        newEmp = empDAO.add(newEmp); // return the object if saved successfully.
        assertNotNull(newEmp,"Employee Not Added");
        
        Employee removedEmp = empDAO.remove(9999);
        assertNotNull(removedEmp,"Employee Not Removed");
        
        Employee checkRemovedEmp = empDAO.find(9999);
        assertNull(checkRemovedEmp,"Employee Not Removed");
        
    }
    
    public static Document getEmployeeMongoDocument(Employee emp) {
    	Document docEmp = new Document();
    	docEmp.put("empno", emp.getEmpno());
    	docEmp.put("empno", emp.getName());
    	docEmp.put("unit_salary", emp.getUnitDaySalary());
    	docEmp.put("grade", emp.getGrade().toString());
    	docEmp.put("designation", emp.getDesignation().toString());
    	
    	return docEmp;
    }

}