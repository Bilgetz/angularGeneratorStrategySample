package fr.hopelessworld.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Class IndexController.
 */
@Controller
public class IndexController {

	/**
	 * Index.
	 *
	 * @return the string
	 */
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
