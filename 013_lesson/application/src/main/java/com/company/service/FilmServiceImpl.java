package com.company.service;

import com.company.model.Film;
import com.company.repository.FilmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
public class FilmServiceImpl implements FilmService {
	@Autowired
	private FilmRepository filmRepository;

	@Override
	public List<Film> addFilms(Map<String, String> films) {
		return null;
	}

	@Override
	public List<Film> findFilmsByDirector(String director) {
		return filmRepository.findByDirector(director);
	}

	@Override
	public List<Film> findAllFilms() {
		return filmRepository.findAll();
	}

	@Override
	public Optional<Film> getById(Long id) {
		return filmRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		filmRepository.deleteById(id);
	}

	@Override
	public Film add(Film film) {
		return filmRepository.save(film);
	}

	@Override
	public Film update(Long id, Film film) {
		Film updatedFilm = filmRepository.findById(id).get();
		if (updatedFilm != null) {
			updatedFilm.setDirector(film.getDirector());
			updatedFilm.setName(film.getName());
			return filmRepository.save(updatedFilm);
		} else {
			return null;
		}
	}
}
