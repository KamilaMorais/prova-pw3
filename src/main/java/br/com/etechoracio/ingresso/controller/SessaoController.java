package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.dto.SessaoResponseDTO;
import br.com.etechoracio.ingresso.service.FilmeService;
import br.com.etechoracio.ingresso.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessao")
@CrossOrigin("*")
public class SessaoController {

    @Autowired
    private SessaoService sessaoService;

    @GetMapping
    public List<SessaoResponseDTO> findAll(){
        return sessaoService.findAll();
    }

    @GetMapping("/filme/{filmeId}")
    public List<SessaoResponseDTO> findByFilme(@PathVariable Long filmeId) {
        return sessaoService.findByFilme(filmeId);
    }
}
