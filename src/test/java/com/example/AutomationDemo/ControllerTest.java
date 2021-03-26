package com.example.AutomationDemo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ControllerTest {
    @Test(description = "Test getString method")
    public void testGetString() {

        given().
                queryParam("inputString", "World").
                when().
                get("http://localhost:8081/rest/getInputString?inputString=World").
                then().
                statusCode(200);
    }

    @Test
    public void test1() {

        given().get("http://localhost:8081/rest/getInputString?inputString=World").then().
                statusCode(200).
                log().all();
    }
}
