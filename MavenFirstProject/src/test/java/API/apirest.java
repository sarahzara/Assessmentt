package API;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import org.testng.Assert;

import  static org.hamcrest.Matchers.notNullValue;
import static org.testng.Assert.assertTrue;

import org.junit.Test;

import static io.restassured.RestAssured.*;
public class apirest {
	@Test
	public void testget() {
baseURI =  "https://alexwohlbruck.github.com";
		
		given().
		get("/cat-facts").
		then().
		statusCode(200).
        body("text", notNullValue()).
        log().body();
      
		
	}	
}