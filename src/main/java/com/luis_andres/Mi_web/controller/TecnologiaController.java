package com.luis_andres.Mi_web.controller;

import com.luis_andres.Mi_web.entity.Tecnologia;
import com.luis_andres.Mi_web.repository.TecnologiaRepository;
import com.luis_andres.Mi_web.service.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/listartecnologias")
    public List<Tecnologia> listarTecnologias(){
        return tecnologiaService.listarTecnologias();
    }

}
