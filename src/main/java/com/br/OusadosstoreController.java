package com.br;

import io.micronaut.http.annotation.*;

@Controller("/ousadosstore")
public class OusadosstoreController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}