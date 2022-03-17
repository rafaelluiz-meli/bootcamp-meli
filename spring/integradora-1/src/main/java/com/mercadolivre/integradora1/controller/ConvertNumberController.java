package com.mercadolivre.integradora1.controller;

import com.mercadolivre.integradora1.model.ConvertNumber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConvertNumberController {

    @GetMapping("/convert")
    @ResponseBody
    public String returnRomanNumber(@RequestParam Integer number){
        ConvertNumber convertNumber = new ConvertNumber();
        String convert = convertNumber.integerToRoman(number);
        StringBuilder result = new StringBuilder();
        result.append("Decimal: " + number);
        result.append("Roman: " + convert);
        return result.toString();
    }
}
