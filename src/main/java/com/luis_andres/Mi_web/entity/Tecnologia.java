package com.luis_andres.Mi_web.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tecnologias")

@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class Tecnologia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String nombre;


}
