package com.luis_andres.Mi_web.service;

import com.luis_andres.Mi_web.entity.LenguajeDeProgramacion;

import java.util.List;

public interface LenguajeDeProgracionService {

    LenguajeDeProgramacion registrarLenguajeDeProgramacion(LenguajeDeProgramacion ldp);
    List<LenguajeDeProgramacion> listarLenguajesDeProgramacion();
    LenguajeDeProgramacion actualizarLenguajeDeProgramacion(LenguajeDeProgramacion ldp, Long idLenguajeDeProgramacion);
    void eliminarLenguajeDeProgramacion(Long idLenguajeDeProgramacion);

}
