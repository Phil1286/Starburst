package com.example.Star.controller;

import com.example.Star.model.Ta_bookmanager;
import com.example.Star.repository.Ta_bookmanagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Ta_bookmanagerController {


    @Autowired
    private Ta_bookmanagerRepository tamanagerPafRepository;

    @GetMapping("/artemis")
    public Iterable<Ta_bookmanager> getAllBooks() {

        return tamanagerPafRepository.findAllActiveUsersNative();
    }
}