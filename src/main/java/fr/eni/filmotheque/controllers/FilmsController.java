package fr.eni.filmotheque.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Participant;
import fr.eni.filmotheque.services.FilmsService;

@Controller
public class FilmsController {
	
	private FilmsService filmService;

	@Autowired
	public FilmsController(FilmsService filmService) {
		this.filmService = filmService;
	}
	
	@ModelAttribute("participants")
	public List<Participant> participants(){
		return filmService.getParticipants();
	}

	
	@GetMapping({"", "/", "/films"} )
	public String afficherListeFilms(Model modele) {
		modele.addAttribute("films", filmService.getAllFilms());
		
		return "films";
	}

	@GetMapping("/films/ajouter")
	public String afficherAjoutFilm(Model modele) {
		modele.addAttribute("film", new Film());
		
		
		return "ajout-film";
	}

	
	@PostMapping("/films/ajouter")
	public String ajouterFilm(@Valid @ModelAttribute Film film, BindingResult result) {
		if(result.hasErrors()) {
			return "ajout-film";
		}


		filmService.ajouterFilm(film);

		return "redirect:/films";
	}
//@PostMapping("/films/ajouter")
//	public String getFilm(@Valid @ModelAttribute Film newFilm,  BindingResult result){
//	if(result.hasErrors()) {
//		return "ajout-film";
//	}
//
//	Film film = new Film(newFilm.getTitre(), newFilm.getSynopsis(), newFilm.getAnneeSortie(), newFilm.getDuree(), newFilm.getActeurs(), newFilm.getRealisateur(), newFilm.getGenre());
//		filmService.ajouterFilm(film);
//		return "redirect:/films";
//	}

	
	@GetMapping("/films/{id}")
	public String afficherFilm(@PathVariable int id, Model modele) {
		
		modele.addAttribute("film", filmService.getFilmById(id));
		
		return "film";
	}
	
	
}
