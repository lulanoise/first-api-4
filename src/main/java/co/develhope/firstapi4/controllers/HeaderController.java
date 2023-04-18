package co.develhope.firstapi4.controllers;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String getHeaders(@RequestHeader HttpHeaders headers){
        return String.valueOf(headers.get("host"));
        // return headers.getHost().toString();
    }
}