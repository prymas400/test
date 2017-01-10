package controllers;

import java.util.ArrayList;
import java.util.List;

import model.Dane;

//@RestController
public class DaneController {
	
	//@RequestMapping(path="/nuda")
	public List<Dane> getNuda() {
		List<Dane> result = new ArrayList<>();
		result.add(new Dane(1, "Pizza", "Najlepsza pizza", "2.jpg", 3.14156, 5.12459,5, "www.google.pl", "Zgierz, ul. £ódzka 4", "42 569 56 56"));
		return result;
	}
	
	
	//@RequestMapping(path="/zmeczenie")
	public List<Dane> getZmeczenie() {
		List<Dane> result = new ArrayList<>();
		return result;
	}
	
	
	//@RequestMapping(path="/glod")
	public List<Dane> getGlod() {
		List<Dane> result = new ArrayList<>();
		return result;
	}
	
	
	//@RequestMapping(path="/zakupy")
	public List<Dane> getZakupy() {
		List<Dane> result = new ArrayList<>();
		return result;
	}
}
