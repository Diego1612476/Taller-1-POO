package com.itsqmet.taller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class usuarioController {
    
    @GetMapping ("/registro")
    public String registro(){
        return "registro";
    }
}
