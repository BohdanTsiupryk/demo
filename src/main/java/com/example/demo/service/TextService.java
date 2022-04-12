package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TextService {

    public String addSight(String text) {

        return  text + " - " + UUID.randomUUID().toString();
    }
}
