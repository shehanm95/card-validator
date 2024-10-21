package com.example.validdator.validation;

import com.example.validdator.CardMapper;
import com.example.validdator.dtos.CardDTO;
import com.example.validdator.model.Card;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CardMapperTest {


   CardMapper cardMapper = new CardMapper();
    @Test
    public void testMapCart(){
        Card tCart = new Card("1234567890987654", "12/23", "shehan maleesha");


        CardDTO tcardDto = cardMapper.apply(tCart);
// new comment added
        assertEquals(tCart.getCardHolderName(),  tcardDto.cardHolderName());

    }

}