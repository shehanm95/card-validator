package com.example.validdator;

import com.example.validdator.dtos.CardDTO;
import com.example.validdator.model.Card;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CardMapper implements Function<Card, CardDTO> {
    @Override
    public CardDTO apply(Card card) {
        return new CardDTO(
                card.getCardNumber(),
                card.getCardHolderName());
    }
}
