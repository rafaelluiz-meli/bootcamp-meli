package com.mercadolivre.integradora2.model;

import java.util.HashMap;
import java.util.Map;

public class TranslateMorseCode {

    HashMap<String,String> translator = new HashMap<>();

    public TranslateMorseCode(){
        translator = new HashMap<>();
        translator.put(".-", "a");
        translator.put("-...", "b");
        translator.put("-.-.", "c");
        translator.put("-..", "d");
        translator.put(".", "e");
        translator.put("..-.", "f");
        translator.put("--.", "g");
        translator.put("....", "h");
        translator.put("..", "i");
        translator.put(".---", "j");
        translator.put("-.-", "k");
        translator.put(".-..", "l");
        translator.put("--", "m");
        translator.put("-.", "n");
        translator.put("---", "o");
        translator.put(".--.", "p");
        translator.put("--.-", "q");
        translator.put(".-.", "r");
        translator.put("...", "s");
        translator.put("-", "t");
        translator.put("..-", "u");
        translator.put("...-", "v");
        translator.put(".--", "w");
        translator.put("-..-", "x");
        translator.put("-.--", "y");
        translator.put("--..", "z");
        translator.put("/", " ");
    }

    public String translate(String code){
        return translator.get(String.valueOf(code));
    }
}
