package kodlama.io.devs.webApi.controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.SoftwareLanguageService;
import kodlama.io.devs.entity.concretes.SoftwareLanguage;

@RestController
@RequestMapping("/api")
public class SoftwareLanguagesController {

	private SoftwareLanguageService languageService;

	@Autowired
	public SoftwareLanguagesController(SoftwareLanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/soft")
	public List<SoftwareLanguage> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody SoftwareLanguage language) throws Exception {
		languageService.add(language);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody SoftwareLanguage language) throws Exception {
		languageService.update(language);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody SoftwareLanguage language) {
		languageService.delete(language);
	}
	
	@GetMapping("/softwarelanguages{id}")
	public SoftwareLanguage getById(@PathVariable int id) {
		return languageService.getById(id);
	}
}
