package br.com.cuidebem.services;

import br.com.cuidebem.models.idoso.Informacao;
import br.com.cuidebem.repositories.InformacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformacaoService {
    @Autowired

    private InformacaoRepository informacaoRepository;

    public Informacao criar(Informacao informacao) {
        return informacaoRepository.save(informacao);


    }
    }
