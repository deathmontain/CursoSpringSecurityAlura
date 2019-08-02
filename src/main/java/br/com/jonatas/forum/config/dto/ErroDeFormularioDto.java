package br.com.jonatas.forum.config.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class ErroDeFormularioDto {
    private String campo;
    private String erro;
}