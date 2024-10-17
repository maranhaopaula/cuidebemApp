package br.com.cuidebem.services;

import br.com.cuidebem.models.acompanhante.Acompanhante;
import br.com.cuidebem.models.cuidador.Cuidador;
import br.com.cuidebem.models.idoso.Idoso;
import br.com.cuidebem.repositories.IdosoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdosoService {
    @Autowired

    private IdosoRepository idosoRepository;

    public IdosoService(IdosoRepository idosoRepository) {
        this.idosoRepository = idosoRepository;
    }
    public Idoso criar(Idoso idoso) {
        return idosoRepository.save(idoso);
    }

    public Idoso buscarPorId(String id) {
        return idosoRepository.findById(id).orElse(null);
    }
    public void deletar(String id) {
        idosoRepository.deleteById(id);
    }
    public List<Idoso> findAll() {
        return idosoRepository.findAll();
    }
}
