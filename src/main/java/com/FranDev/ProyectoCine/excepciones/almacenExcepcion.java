package com.FranDev.ProyectoCine.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class almacenExcepcion extends RuntimeException{

    public almacenExcepcion(String mensaje) {
        super(mensaje);

    }

    public almacenExcepcion(String mensaje, Throwable exception) {
        super(mensaje, exception);

    }

    

}
