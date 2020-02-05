package com.ingresso.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ingresso.cinema.dao.FilmeDao;
import com.ingresso.cinema.dao.SalaDao;

@Controller
public class SessaoController {
	
	@Autowired
	 private FilmeDao filmeDao;
	@Autowired
	 private SalaDao salaDao;
	
	@GetMapping("admin/sessao")
	public ModelAndView form(@RequestParam("salaId") Integer salaId) {
		ModelAndView model = new ModelAndView("sesao/sessao");
		model.addObject("sala", salaDao.findOne(salaId));
		model.addObject("filme",filmeDao.findAll());
		
		return model;
		
		
	}
	 
	 
	
	

}
