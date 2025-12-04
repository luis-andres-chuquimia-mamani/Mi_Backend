package com.luis_andres.Mi_web.service;

import com.luis_andres.Mi_web.entity.LenguajeDeProgramacion;
import com.luis_andres.Mi_web.error.LenguajeDeProgramacionNotFoudException;
import com.luis_andres.Mi_web.repository.LenguajeDeProgramacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public class LenguajeDeProgramacionServiceImplementacion implements LenguajeDeProgracionService{

    @Autowired
    LenguajeDeProgramacionRepository lenguajeDeProgramacionRepository;

    @Override
    public LenguajeDeProgramacion registrarLenguajeDeProgramacion(LenguajeDeProgramacion ldp) {
        return lenguajeDeProgramacionRepository.save(ldp);
    }

    @Override
    public List<LenguajeDeProgramacion> listarLenguajesDeProgramacion() {
        return lenguajeDeProgramacionRepository.findAll();
    }

    @Override
    public LenguajeDeProgramacion actualizarLenguajeDeProgramacion(LenguajeDeProgramacion ldp, Long idLenguajeDeProgramacion) {
        LenguajeDeProgramacion ldpDB = lenguajeDeProgramacionRepository.findById(idLenguajeDeProgramacion).get();
        if(Objects.nonNull(ldp.getNombre()) && !"".equalsIgnoreCase(ldp.getNombre())){
            ldpDB.setNombre(ldp.getNombre());
        }
        return lenguajeDeProgramacionRepository.save(ldpDB);
    }

    @Override
    public void eliminarLenguajeDeProgramacion(Long idLenguajeDeProgramacion) {
        lenguajeDeProgramacionRepository.deleteById(idLenguajeDeProgramacion);
    }

    @Override
    public LenguajeDeProgramacion obtenerLenguajeDeProgramacion(Long idldp) throws LenguajeDeProgramacionNotFoudException {
        Optional<LenguajeDeProgramacion> ldp = lenguajeDeProgramacionRepository.findById(idldp);
        if (!ldp.isPresent()){
            throw new LenguajeDeProgramacionNotFoudException("Lenguaje de Programacion no encontrado");
        }

        return ldp.get();
    }

}
