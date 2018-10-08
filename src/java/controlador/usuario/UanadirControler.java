/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.usuario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class UanadirControler {

	@RequestMapping("uanadir.htm")
	public ModelAndView listaUusuario() {
            ModelAndView mav = new ModelAndView();
            mav.addObject(this);
            mav.setViewName("uanadir");
            return mav ;

	}

}
