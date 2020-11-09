package com.softdesign.testes;

import com.softdesign.dados.ReservaDados;
import com.softdesign.utils.AmbienteURL;
import com.softdesign.utils.Login;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ReservaTeste
{
    Login dadosLogin = new Login();
    AmbienteURL urlBase = new AmbienteURL();
    ReservaDados dados = new ReservaDados();
    String url = urlBase.urlBaseAmbiente("escolhaAmbiente");

    @Test
    public void realizarReservaSucesso()
    {
        given().
                log().all().
            contentType(ContentType.JSON).
            body(dados.camposReservaBody()).
        when().
            post(url + "/booking").
        then().
            assertThat().
            body("bookingid", notNullValue());
    }

    @Test
    public void listarReservaIncluida(){

        String id = dados.retornarIdReserva();

        given().
        when().
            get(url + "/" + id).
        then().
            assertThat().
            body("bookingid", equalTo(id));
    }


    @Test
    public void excluirReservaSucesso()
    {
        String id = dados.retornarIdReserva();

        given().
            contentType(ContentType.JSON).
            cookie("token", dadosLogin.loginAuthToken()).
        when().
            delete(url + "/booking/" + id).
        then().
            assertThat().
            statusCode(201);
    }
}
