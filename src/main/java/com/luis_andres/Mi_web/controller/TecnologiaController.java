package com.luis_andres.Mi_web.controller;

import com.luis_andres.Mi_web.entity.Tecnologia;
import com.luis_andres.Mi_web.service.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TecnologiaController {

    private static AtomicLong counter = new AtomicLong();

    @Autowired
    TecnologiaService tecnologiaService;

    @GetMapping("/mistecnologias")
    public Tecnologia misTecnologia(@RequestParam(value = "nombre", defaultValue = "ninguna") String nombre){
        Tecnologia t = new Tecnologia( counter.incrementAndGet(), nombre);
        return t;
    }

    @GetMapping("/listarTecnologias")
    public List<Tecnologia> listarTecnologias(){
        return tecnologiaService.listarTecnologias();
    }

    @PostMapping("/registrarTecnologia")
    public Tecnologia registrarTecnologia(@RequestBody Tecnologia t){
        return tecnologiaService.registrarTecnologia(t);
    }

    @PutMapping("/actualizarTecnologia/{id}")
    public Tecnologia actualizarTecnologia(@RequestBody Tecnologia t, @PathVariable Long id){
        return  tecnologiaService.actulizarTecnologia(t,id);
    }

    @DeleteMapping("/eliminarTecnologia/{id}")
    public String eliminarTecnologia(@PathVariable Long id){
        tecnologiaService.eliminarTecnologia(id);
        return "Successfully";
    }

}
