package com.mastek.hrapp.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.hrapp.entities.Department;

@Path("/hrapp/") // URL pattern to access the current API Interface.
public interface DepartmentAPI {
		
		// http://localhost:7777/hrapp/employees/list
		@GET // we do support http Method: GET
		@Path("/department/list") // URL Path to access this method.
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) // formats which the method supports.
		public Iterable<Department> listAllDepartment();
		
		@GET
		@Path("/department/find/{deptno}")
		@Produces({MediaType.APPLICATION_JSON})
		public Department findByDeptno(@PathParam("deptno") int deptno);
		
		@POST // http method Post used to send data in requests.
		@Path("/department/register")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_JSON)
		public Department registerNewDepartment(@BeanParam Department newDepartment);
		
	}