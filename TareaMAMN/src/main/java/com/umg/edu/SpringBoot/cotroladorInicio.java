/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.edu.SpringBoot;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Marjorie
 */
@Controller
@Slf4j

public class cotroladorInicio {
    
     @GetMapping("/")
     
    public String inicio(Model model) {
        log.info("entrando al controlador");
        var mensaje ="Vendedores con Thymeleaft";
        
        var vende = new ModeloVendedor();
        vende.setNombre("Marjorie");
        vende.setApellido("Moran");
        vende.setEnero(37);
        vende.setFebrero(45);
        vende.setMarzo(89);
        model.addAttribute("vende", vende);
        
        var vende2 = new ModeloVendedor();
        vende2.setNombre("Juan");
        vende2.setApellido("Perez");
        vende2.setEnero(21);
        vende2.setFebrero(30);
        vende2.setMarzo(47);
        model.addAttribute("vende2", vende2);
        
        var vendedor = Arrays.asList(vende,vende2);
        
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("vendedor",vendedor);
        
        
        return "index";
    }
    
}
