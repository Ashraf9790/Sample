package sample.sample;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
@Test
public class Getallincident {

	public void restassured() {

		RestAssured.baseURI="https://dev68594.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin", "India@123");
		Response response = RestAssured
						.get();
		System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		System.out.println(response.prettyPrint());
		
	}
}
