package com.softdesign.dados;

import com.softdesign.utils.AmbienteURL;
import io.restassured.http.ContentType;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class ReservaDados {
    AmbienteURL urlBase = new AmbienteURL();
    String url = urlBase.urlBaseAmbiente("escolhaAmbiente");

    public String camposReservaBody(){

        return new JSONObject().
                put("firstname", "Jim").
                put("lastname", "Halpert").
                put("totalprice", 200).
                put("depositpaid", true).
                put("bookingdates", new JSONObject().
                                    put("checkin", "2018-01-01").
                                    put("checkout", "2019-01-01")).
                put("additionalneeds", "Breakfast").toString();
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
