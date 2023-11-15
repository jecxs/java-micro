package com.practica1.pract.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica1.pract.entity.Cliente;
import com.practica1.pract.repository.ClienteRepository;

@Service
public class ClienteServiceImplement implements IClienteService{
	
	@Autowired
	ClienteRepository x;
	
	@Override
	public List<Cliente> vertodo() {
		return (List<Cliente>)x.findAll();
	}

	@Override
	public Cliente verporcodigo(Long id) {
		return x.findById(id).orElse(null);
	}

}
