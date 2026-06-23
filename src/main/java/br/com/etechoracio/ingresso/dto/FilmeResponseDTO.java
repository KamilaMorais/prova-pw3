package br.com.etechoracio.ingresso.dto;

import br.com.etechoracio.ingresso.enums.CategoriaFilmeEnum;
import br.com.etechoracio.ingresso.enums.ClassificacaoIndicativaEnum;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;

import java.time.Duration;

public record FilmeResponseDTO(
        Long id,
        String nome,
        Duration duracao,
        Integer ano,
        String capa,
        CategoriaFilmeEnum categoria,
        ClassificacaoIndicativaEnum classificacao,
        SimNaoEnum emCartaz,
        String diretor,
        String elenco,
        String descricao,
        Double avaliacao
) {
}
