package bddRestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestTest {
	
@Test 

public void test_numberOfCircuitsFor2017_Season () {

	given().
	when().
	get("http://ergast.com/api/f1/2017/circuits.json").
	then().
	assertThat().
	body("MRData.CircuitTable.Circuits.circuitID", hasSize(20));
}
}