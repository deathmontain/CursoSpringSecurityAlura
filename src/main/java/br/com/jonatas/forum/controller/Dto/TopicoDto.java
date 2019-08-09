package br.com.jonatas.forum.controller.Dto;

import br.com.jonatas.forum.model.Topico;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


@Data
public class TopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public static Page<TopicoDto> converter(Page<Topico> topicos) {
        return topicos.map(TopicoDto::new);
    }
}