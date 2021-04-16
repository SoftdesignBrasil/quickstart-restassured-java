package com.softdesign.dados;

import org.json.JSONObject;

public class LoginDados {

    public String camposLoginBody() {
        return new JSONObject()
                .put("username", "admin")
                .put("password", "password123").toString();
    }
}
