package com.company.service;

import com.company.model.Film;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface FilmService {
	List<Film> addFilms(Map<String, String> films);

	List<Film> findFilmsByDirector(String director);

	List<Film> findAllFilms();

	Optional<Film> getById(Long id);

	void delete(Long id);

	Film add(Film film);

	Film update(Long id, Film film);
}
