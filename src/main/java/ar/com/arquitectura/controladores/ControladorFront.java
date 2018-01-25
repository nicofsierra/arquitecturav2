package ar.com.arquitectura.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorFront {
	
	@RequestMapping(path="/")
	public ModelAndView irAInicio()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping(path="index")
	public ModelAndView irAIndex(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(path="/obras")
	public ModelAndView irAObras(){
		return new ModelAndView("obras");
	}

}
