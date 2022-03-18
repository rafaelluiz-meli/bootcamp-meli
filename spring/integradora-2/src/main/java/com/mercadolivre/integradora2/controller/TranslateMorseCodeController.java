package com.mercadolivre.integradora2.controller;

import com.mercadolivre.integradora2.model.TranslateMorseCode;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Locale;

@RestController
public class TranslateMorseCodeController {

    @PostMapping("/translate")
    public String returnMorseMessage(@RequestBody String text){
            TranslateMorseCode textInMorse = new TranslateMorseCode();
            String[] words = text.split("   ");
            System.out.println(Arrays.toString(words));
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < words.length; i++) {
                String[] chars = words[i].split("\\s");
                for(int j = 0; j < chars.length; j++) {
                    String c = chars[j];
                    result.append(textInMorse.translate(c));
                }
                result.append(" ");
            }
            return result.toString().toUpperCase(Locale.ROOT);
    }
}
