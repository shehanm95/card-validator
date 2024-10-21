package com.example.validdator.controller;


import com.example.validdator.CardMapper;
import com.example.validdator.dtos.CardDTO;
import com.example.validdator.model.Card;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @Autowired
    CardMapper cardMapper;

    @GetMapping("/")
    public String getPage(){
      return "working";
    }

    @PostMapping("/")
    public ResponseEntity<CardDTO> saveCard(@RequestBody @Valid Card card){

        return ResponseEntity.ok(cardMapper.apply(card));
    }
}
