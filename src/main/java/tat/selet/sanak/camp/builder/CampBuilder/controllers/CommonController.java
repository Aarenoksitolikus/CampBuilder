package tat.selet.sanak.camp.builder.CampBuilder.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {
    @GetMapping
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello!");
    }
}
