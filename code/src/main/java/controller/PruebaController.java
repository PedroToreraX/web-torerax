package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebaController {

    @GetMapping("/ruta-del-mapeo")
    public String miMetodo() {
        return "vista";
    }
}
