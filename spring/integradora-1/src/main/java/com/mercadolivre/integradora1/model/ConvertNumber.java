package com.mercadolivre.integradora1.model;

public class ConvertNumber {

    public String integerToRoman(Integer number){

        int[] integerRef = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanRef = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i<integerRef.length;i++){
            while(number >= integerRef[i]){
                number -= integerRef[i];
                roman.append(romanRef[i]);
            }
        }
        return roman.toString();
    }

}
