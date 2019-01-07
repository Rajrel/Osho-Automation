package bddRestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.is;




public class RestTest1 {
	
public String  url = "http://restapi.demoqa.com/utilities/weather/city/woodbridge"; 
@Test
public void GetWeatherDetails()
{   
	/* Specify the base URL to the RESTful web service
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

	// Get the RequestSpecification of the request that you want to sent
	// to the server. The server is specified by the BaseURI that we have
	// specified in the above step.
	RequestSpecification httpRequest = RestAssured.given();

	// Make a request to the server by specifying the method Type and the method URL.
	// This will return the Response from the server. Store the response in a variable.
	Response response = httpRequest.request(Method.GET, "/Woodbridge");

	// Now let us print the body of the message to see what response
	// we have received from the server
	String responseBody = response.getBody().asString();
	System.out.println("Response Body is =>  " + responseBody); */
	given().
	when().
    get(url).
	then().assertThat().statusCode(200);
    /*and().body("City", equalTo("Woodbridge")).
	and().body( "WindSpeed", equalTo ("4.6 Km per hour")); */
	//and().
	//url.JsonPath().get("City");


	


}
	
	

}
