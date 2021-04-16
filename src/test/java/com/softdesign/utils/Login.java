package com.softdesign.utils;

import com.softdesign.dados.LoginDados;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Login {
    AmbienteURL urlBase = new AmbienteURL();
    String url = urlBase.urlBaseAmbiente("escolhaAmbiente");
    LoginDados login = new LoginDados();

    public String loginAuthToken() {
        return given()
                .contentType(ContentType.JSON)
                .body(login.camposLoginBody())
                .when()
                .post(url + "/auth")
                .then()
                .extract()
                .path("token");
    }
}
