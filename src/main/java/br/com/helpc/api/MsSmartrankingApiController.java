package br.com.helpc.api;

import io.micronaut.http.annotation.*;

@Controller("/msSmartrankingApi")
public class MsSmartrankingApiController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}