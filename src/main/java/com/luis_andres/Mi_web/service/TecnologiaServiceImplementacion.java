package com.luis_andres.Mi_web.service;

import com.luis_andres.Mi_web.entity.Tecnologia;
import com.luis_andres.Mi_web.error.TecnologiaNotFoundException;
import com.luis_andres.Mi_web.repository.TecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TecnologiaServiceImplementacion implements TecnologiaService {

    @Autowired
    TecnologiaRepository tecnologiaRepository;

    @Override
    public Tecnologia registrarTecnologia(Tecnologia t) {
        return tecnologiaRepository.save(t);
    }

    @Override
    public List<Tecnologia> listarTecnologias() {
        return tecnologiaRepository.findAll();
    }

    @Override
    public Tecnologia actulizarTecnologia(Tecnologia t, Long id) {
        Tecnologia tDB = tecnologiaRepository.findById(id).get();
        if(Objects.nonNull(t.getNombre()) && !"".equalsIgnoreCase(t.getNombre())){
            tDB.setNombre(t.getNombre());
        }
        return tecnologiaRepository.save(tDB);
    }

    @Override
    public void eliminarTecnologia(Long id) {
        tecnologiaRepository.deleteById(id);
    }

    @Override
    public Tecnologia encontrarTecnologia(Long id) throws TecnologiaNotFoundException {
        Optional<Tecnologia> t = tecnologiaRepository.findById(id);
        if(!t.isPresent()){
            throw new TecnologiaNotFoundException("Tecnologia no encontrada");
        }
        return t.get();
    }
}
