package com.luis_andres.Mi_web.service;

import com.luis_andres.Mi_web.entity.Tecnologia;

import java.util.List;

public interface TecnologiaService {

    Tecnologia registrarTecnologia(Tecnologia t );
    List<Tecnologia> listarTecnologias();
    Tecnologia actulizarTecnologia(Tecnologia t, Long id);
    void eliminarTecnologia(Long id);


}
