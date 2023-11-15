package com.practica1.pract.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica1.pract.entity.Cliente;
import com.practica1.pract.service.IClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	IClienteService x;
	
	@GetMapping("/listar")
	public List<Cliente>  ver(){
		return x.vertodo();
	}

	@GetMapping("/ver/{id}")
	public Cliente verObejeto(@PathVariable Long id) {
		return x.verporcodigo(id);
	}
}
