package com.softdesign.utils;

public class AmbienteURL {

    public String urlBaseAmbiente(String escolhaAmbiente) {
        if ("escolhaAmbiente".equals(escolhaAmbiente)) {
            return ("https://restful-booker.herokuapp.com");
        }
        return "";
    }
}
