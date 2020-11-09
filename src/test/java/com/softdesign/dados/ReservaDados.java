package com.softdesign.dados;

import com.softdesign.utils.AmbienteURL;
import com.softdesign.utils.GeradorDados;
import io.restassured.http.ContentType;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class ReservaDados {
    AmbienteURL urlBase = new AmbienteURL();
    GeradorDados dados = new GeradorDados();
    String url = urlBase.urlBaseAmbiente("escolhaAmbiente");

    public String camposReservaBody(){

        return new JSONObject().
                put("firstname", dados.geradorNomeCadastro()).
                put("lastname", dados.geradorSobrenomeCadastro()).
                put("totalprice", dados.geradorValorValidoCadastro()).
                put("depositpaid", dados.geradorDepositoPagoCadastro()).
                put("bookingdates", new JSONObject().
                                    put("checkin", "2018-01-01").
                                    put("checkout", "2019-01-01")).
                put("additionalneeds", dados.geradorNecessidadesCadastro()).toString();
    }

    public String retornarIdReserva()
    {
        Integer id =
        given().
            contentType(ContentType.JSON).
            body(camposReservaBody()).
        when().
            post(url + "/booking").
        then().
            extract().path("bookingid");

        return id.toString();
    }
}
