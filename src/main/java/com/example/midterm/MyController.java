package com.example.midterm;

import dto.Name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("validate")
public class MyController {

    @GetMapping("/email/{email}")
    public boolean validateEmail(@PathVariable String email) {
        return true;
    }

    @GetMapping("/name/{name}")
    public Name processName(@PathVariable String name) {
        return new Name();
    }


}
