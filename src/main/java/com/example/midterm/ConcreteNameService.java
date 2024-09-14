package com.example.midterm;

import dto.Name;
import org.springframework.stereotype.Component;
import service.NameService;

@Component
public class ConcreteNameService implements NameService {
    @Override
    public Name process(String name) throws Exception {
        return null;
    }
}
