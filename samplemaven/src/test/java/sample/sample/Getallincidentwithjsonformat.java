package sample.sample;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
@Test
public class Getallincidentwithjsonformat {

	public void restassured() {

		RestAssured.baseURI="https://dev68594.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin", "India@123");
		Response response = RestAssured
				.given()
				.queryParam("sysparm_fields", "sys_id,number")
				.accept(ContentType.JSON)
				.get();
		System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		
		//To convert the response as JSON format
		JsonPath jsonPath = response.jsonPath();
		List<Object> list = jsonPath.getList("result.number");
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		
	}
}
