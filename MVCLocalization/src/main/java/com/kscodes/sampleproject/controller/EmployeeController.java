package com.kscodes.sampleproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kscodes.sampleproject.model.Employee;

@Controller //http://localhost:8080/employeeForm
public class EmployeeController {

	@RequestMapping(value = "/employeeForm")
	public ModelAndView employeeForm() {
		return new ModelAndView("employeeForm", "employee", new Employee());
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee") Employee employee,
			final RedirectAttributes redirectAttributes) {

		redirectAttributes.addFlashAttribute("firstName", employee.getFirstName());
		redirectAttributes.addFlashAttribute("lastName", employee.getLastName());

		return "redirect:showEmployee";

	}

	@RequestMapping(value = "/showEmployee")
	public String showEmployee(@ModelAttribute("firstName") String firstName,
			@ModelAttribute("lastName") String lastName) {

		return "welcome";

	}

}
