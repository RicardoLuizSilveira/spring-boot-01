package com.example.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.forum.controller.dto.response.TopicoReponseDTO;
import com.example.forum.service.TopicosService;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@Autowired
	private TopicosService service;

	@GetMapping
	public List<TopicoReponseDTO> lista(){
		return TopicoReponseDTO.converte(service.findAll());
	}
}
