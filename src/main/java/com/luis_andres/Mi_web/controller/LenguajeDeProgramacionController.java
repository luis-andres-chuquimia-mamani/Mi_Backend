package com.luis_andres.Mi_web.controller;

import com.luis_andres.Mi_web.entity.LenguajeDeProgramacion;
import com.luis_andres.Mi_web.error.LenguajeDeProgramacionNotFoudException;
import com.luis_andres.Mi_web.service.LenguajeDeProgracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LenguajeDeProgramacionController {

    @Autowired
    LenguajeDeProgracionService lenguajeDeProgracionService;

    @PostMapping("/registrarLenguajeDeProgramacion")
    public LenguajeDeProgramacion registrarLenguajeDeProgramacion(@RequestBody LenguajeDeProgramacion ldp){
        return lenguajeDeProgracionService.registrarLenguajeDeProgramacion(ldp);
    }

    @GetMapping("/listarLenguajesDeProgramacion")
    public List<LenguajeDeProgramacion> listarlenguajesDeProgramacion(){
        return lenguajeDeProgracionService.listarLenguajesDeProgramacion();
    }

    @GetMapping("/obtenerLenguajeDeProgramacion/{idldp}")
    public LenguajeDeProgramacion obtenerLenguajeDeProgramacion(@PathVariable Long idldp) throws LenguajeDeProgramacionNotFoudException {
        return lenguajeDeProgracionService.obtenerLenguajeDeProgramacion(idldp);
    }

    @PutMapping("/actualizarLenguajeDeProgramacion/{idldp}")
    public LenguajeDeProgramacion actualizarLenguajeDeProgramacion(@RequestBody LenguajeDeProgramacion ldp, @PathVariable Long idldp){
        return lenguajeDeProgracionService.actualizarLenguajeDeProgramacion(ldp,idldp);
    }

    @DeleteMapping("eliminarLenguajeDeProgramacion/{idldp}")
    public String eliminarLenguajeDeProgramacion(@PathVariable Long idldp){
        lenguajeDeProgracionService.eliminarLenguajeDeProgramacion(idldp);
        return "Successfull";
    }

}
