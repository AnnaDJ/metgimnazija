package com.met.gimnazija.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.met.gimnazija.entities.Ucenik;
import com.met.gimnazija.repository.UcenikRepository;

@Service
@Transactional
public class UcenikServiceImpl implements UcenikService{
	
	@Autowired
	UcenikRepository ucenikRepository;

	@Override
	public List<Ucenik> getAllUcenici() {
		return (List<Ucenik>) ucenikRepository.findAll();
	}

	@Override
	public Ucenik getUcenikById(int Id) {
		return ucenikRepository.findById(Id).get();
	}

	@Override
	public void saveOrUpdate(Ucenik ucenik) {
		ucenikRepository.save(ucenik);
	}

	@Override
	public void deleteUcenikById(int Id) {
		ucenikRepository.deleteById(Id);
		
	}

}
