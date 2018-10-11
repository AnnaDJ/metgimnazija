package com.met.gimnazija.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.met.gimnazija.entities.Ucenik;
import com.met.gimnazija.entities.User;
import com.met.gimnazija.repository.UcenikRepository;
import com.met.gimnazija.repository.UserRepository;


@RestController
public class UcenikController {
	
	@Autowired
	private UcenikRepository ucenikRepository;
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping(value = "/ucenik_form")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		model.addObject("ucenik", new Ucenik());
		List<User> users = (List<User>) userRepository.findAll();
   		model.addObject("users", users);
		List<Ucenik> ucenici = (List<Ucenik>) ucenikRepository.findAll();
		if (!ucenici.isEmpty()) {
			model.addObject("ucenici", ucenici);
		}
		model.setViewName("/ucenik_form");
		return model;
	}

	@PostMapping(value = "/ucenik_form")
	public ModelAndView addUcenik(@Valid Ucenik ucenik, BindingResult result) {
		ModelAndView model = new ModelAndView();
		ucenikRepository.save(ucenik);
		model.addObject("ucenik", new Ucenik());
		List<Ucenik> ucenici = (List<Ucenik>) ucenikRepository.findAll();
		if (!ucenici.isEmpty()) {
			model.addObject("ucenici", ucenici);
		}
		List<User> users = (List<User>) userRepository.findAll();
		model.addObject(users);		
		model.setViewName("/ucenik_form");
		return model;
	}
	
	@RequestMapping(value = "/deleteUcenik/{ucenik_ID}", method = RequestMethod.GET)
	public ModelAndView deleteUcenik(@PathVariable String ucenik_ID) {	
		ModelAndView model = new ModelAndView("redirect:/ucenik_form");
		int id = Integer.parseInt(ucenik_ID);
		ucenikRepository.deleteById(id);

		return model;		
	}
	
	 @RequestMapping(value="/updateUcenik/{ucenik_ID}", method=RequestMethod.GET)
	 public ModelAndView editUcenik(@PathVariable String ucenik_ID) {
	  ModelAndView model = new ModelAndView();	
	  int id = Integer.parseInt(ucenik_ID);
	  Ucenik ucenik = ucenikRepository.findById(id).get();
	  model.addObject("ucenik", ucenik);
	  model.setViewName("ucenik_edit");	  
	  return model;
	 }
	 
	 @RequestMapping(value="/saveUcenik/{ucenik_ID}", method=RequestMethod.POST)
	 public ModelAndView save(@PathVariable Ucenik ucenik) {
	 ModelAndView model = new ModelAndView();
	 ucenikRepository.save(ucenik);
	 model.setViewName("ucenik_form");
	 return model;
	 }
	 
	@RequestMapping(value = "ucenik/list", method = RequestMethod.GET)
   	public ModelAndView ucenici() {
   		ModelAndView model = new ModelAndView("ucenik_form");
   		List<Ucenik> ucenici = (List<Ucenik>) ucenikRepository.findAll();
   		model.addObject("ucenici", ucenici);
   		return model;
   	}  

    @RequestMapping(value = "user/list", method = RequestMethod.GET)
   	public ModelAndView users() {
   		ModelAndView model = new ModelAndView("ucenik_form");
   		List<User> users = (List<User>) userRepository.findAll();
   		model.addObject("users", users);
   		return model;
   	}  
}
