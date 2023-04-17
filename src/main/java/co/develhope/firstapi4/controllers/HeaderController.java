package co.develhope.firstapi4.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String getHeaders(
            @RequestHeader(value = "host", defaultValue = "unknown") String host,
            @RequestHeader(value = "port", defaultValue = "unknown") String port
    ) {
        return "Host: " + host + ", Port: " + port;
    }
}
