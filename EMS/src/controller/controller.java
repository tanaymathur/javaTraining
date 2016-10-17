package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/controller")
public class controller {
	
	
	private static final String VIEW_EMPLOYEE_LIST = "viewEmployeeList";
	private static final String VIEW_EMPLOYEE = "viewEmployee";
	private static final String ADD_EMPLOYEE = "addEmployee";
	private static final String EDIT_EMPLOYEE = "editEmployee";
	private static final String DELETE_EMPLOYEE = "deleteEmployee";
	private static final String ERROR_KEY = "errorMessage";

	public String RouteRequest(@RequestParam("query") String query, Map<String, Object> model) {

		if (query)

			return null;

	}
}
