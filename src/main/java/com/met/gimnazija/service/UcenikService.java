package com.met.gimnazija.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.met.gimnazija.entities.Ucenik;

@Service
public interface UcenikService {

	public List<Ucenik> getAllUcenici();

	public Ucenik getUcenikById(int Id);

	public void saveOrUpdate(Ucenik ucenik);

	public void deleteUcenikById(int Id);
}
