package com.example.forum.controller.dto.response;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.example.forum.model.Topico;

public final class TopicoReponseDTO {
	
	private final Long id;
	private final String titulo;
	private final String mensagem;
	private final LocalDateTime dataCriacao;
	
	public TopicoReponseDTO(Topico entity) {
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.mensagem = entity.getMensagem();
		this.dataCriacao = entity.getDataCriacao();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<TopicoReponseDTO> converte(List<Topico> entityList) {
		return entityList.stream().map(TopicoReponseDTO::new).collect(Collectors.toList());
	}
	
}
