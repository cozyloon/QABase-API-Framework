package io.github.cozyloon;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class Api {
    public static Response get(String url, String pathParameter, Map<String, ?> queryParameters, Map<String, ?> headers, Object body) {
        RestAssured.baseURI = url;
        RestAssured.basePath = pathParameter;
        RequestSpecification request = RestAssured.given()
                .queryParams(queryParameters)
                .headers(headers)
                .body(body)
                .contentType(ContentType.JSON);

        return request.get();
    }

    public static Response post(String url, String pathParameter, Map<String, ?> queryParameters, Map<String, ?> headers, Object body) {
        RestAssured.baseURI = url;
        RestAssured.basePath = pathParameter;
        RequestSpecification request = RestAssured.given()
                .queryParams(queryParameters)
                .headers(headers)
                .body(body)
                .contentType(ContentType.JSON);

        return request.post();
    }

    public static Response put(String url, String pathParameter, Map<String, ?> queryParameters, Map<String, ?> headers, Object body) {
        RestAssured.baseURI = url;
        RestAssured.basePath = pathParameter;
        RequestSpecification request = RestAssured.given()
                .queryParams(queryParameters)
                .headers(headers)
                .body(body)
                .contentType(ContentType.JSON);

        return request.put();
    }

    public static Response delete(String url, String pathParameter, Map<String, ?> queryParameters, Map<String, ?> headers, Object body) {
        RestAssured.baseURI = url;
        RestAssured.basePath = pathParameter;
        RequestSpecification request = RestAssured.given()
                .queryParams(queryParameters)
                .headers(headers)
                .body(body)
                .contentType(ContentType.JSON);

        return request.delete();
    }
}
