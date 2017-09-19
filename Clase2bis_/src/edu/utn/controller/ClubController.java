package edu.utn.controller;

import java.util.ArrayList;

import edu.utn.model.Club;

public class ClubController {
	private ArrayList<Club> listaClubes;

	public ClubController() {
		this.listaClubes = new ArrayList<Club>();
	}

	public ArrayList<Club> getListaClubes() {
		return listaClubes;
	}

	public void addClub(Club club) {
		this.listaClubes.add(club);
	}	
}
