package com.example.forum.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.forum.model.Curso;
import com.example.forum.model.Topico;

@Service
public class TopicosService {
	
	public List<Topico> findAll(){
		List<Topico> list = new LinkedList<>();
		list.add(new Topico("Duvida", "Duvida com spring", new Curso("Spring", "programação")));
		list.add(new Topico("Duvida1", "Duvida com spring1", new Curso("Spring", "programação")));
		list.add(new Topico("Duvida2", "Duvida com spring2", new Curso("Spring", "programação")));
		list.add(new Topico("Duvida3", "Duvida com spring3", new Curso("Spring", "programação")));
		return list;
	}
}
