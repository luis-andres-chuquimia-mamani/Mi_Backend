package com.luis_andres.Mi_web.service;

import com.luis_andres.Mi_web.entity.Tecnologia;
import com.luis_andres.Mi_web.error.TecnologiaNotFoundException;

import java.util.List;

public interface TecnologiaService {

    Tecnologia registrarTecnologia(Tecnologia t );
    List<Tecnologia> listarTecnologias();
    Tecnologia actulizarTecnologia(Tecnologia t, Long id);
    void eliminarTecnologia(Long id);
    Tecnologia encontrarTecnologia(Long id) throws TecnologiaNotFoundException;


}
