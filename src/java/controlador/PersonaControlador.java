package controlador;

import org.springframework.web.servlet.*;
import modelo.*;
import org.springframework.stereotype.Controller;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.*;

@Controller
@RequestMapping("persona2.htm")
public class PersonaControlador {

	private PersonaValidar personaValidar;

	PersonaControlador() {
		// TODO - implement PersonaControlador.PersonaControlador
		throw new UnsupportedOperationException();
	}

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listaEstudiantes() {
		// TODO - implement PersonaControlador.listaEstudiantes
		throw new UnsupportedOperationException();
	}

	
}