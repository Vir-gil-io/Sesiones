package main.java.mx.utng.s20.hello.controller;
import org.springframework.web.bind.annotation.RestController;

import main.java.mx.utng.s20.hello.model.Saludo;
@RestController
public class SaludoControler {

    @GetMapping("/saludo")
    public Saludo saludar(){
        Saludo saludo=new Saludo();
        saludo.setMensaje("¡¡Hola Mundo!!");
        return saludo;

    }
}
