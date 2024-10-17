package br.com.cuidebem.services;

import br.com.cuidebem.models.acompanhante.Acompanhante;
import br.com.cuidebem.models.contratante.Contratante;
import br.com.cuidebem.repositories.ContratanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratanteService {

    @Autowired
    private ContratanteRepository contratanteRepository;

    public ContratanteService(ContratanteRepository contratanteRepository) {
        this.contratanteRepository = contratanteRepository;
    }

    public Contratante criar(Contratante contratante) {
        return contratanteRepository.save(contratante);
    }

    public Contratante buscarPorId(String id) {
        return contratanteRepository.findById(id).orElse(null);
    }

    public void deletar(String id) {
        contratanteRepository.deleteById(id);

    }

    public List<Contratante> findAll() {
        return contratanteRepository.findAll();
    }

    public Contratante Atualizar(String id, Contratante contratante) {
        var contratanteAux = contratanteRepository.findById(id).orElse(null);
        if (contratanteAux != null) {
            if (contratante.getTelefone() != null) contratanteAux.setTelefone(acompanhante.getTelefone());
            if (contratante.getEndereco() != null) contratanteAux.setEndereco(acompanhante.getEndereco());
            if (contratante.getSobreNome() != null) contratanteAux.setSobreNome(acompanhante.getSobreNome());
            if (contratante.get() != null) acompanhanteAux.setSobreNome(acompanhante.getSobreNome());

            return acompanhanteRepository.save(acompanhanteAux);
        }
        return null;
    }
}