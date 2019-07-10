package demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Pagescontroller {
	
	@GetMapping("/")
	

	public String home(HttpServletRequest request, ModelMap modelMap) {
		
		String name=request.getParameter("name")!= null && !request.getParameter("name").isEmpty()?
				request.getParameter("name")
				:"World";
	System.out.println("\n\n" +name + "\n\n");	 
	
	modelMap.put("name", name);
		return "pages/home";
	}
	
}


