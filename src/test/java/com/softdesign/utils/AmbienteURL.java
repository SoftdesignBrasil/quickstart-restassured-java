package com.softdesign.utils;

public class AmbienteURL {

    public String urlBaseAmbiente(String escolhaAmbiente){
        switch (escolhaAmbiente){
            case "escolhaAmbiente": return ("https://restful-booker.herokuapp.com");
            default: return "";
        }
    }
}
