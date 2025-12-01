package com.luis_andres.Mi_web.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lenguajes_de_programacion")

@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class LenguajeDeProgramacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLenguajeDeProgramacion;
    private String nombre;


}
