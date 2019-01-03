package stepdef;

import cucumber.api.java.en.Given;
import io.cucumber.datatable.DataTable;

public class StepDefs {
	
	@Given("Process given datatable")
	public void datatable(DataTable data) {
		System.out.println(data);		
	}
	
	@Given("Do {string} when {string} and {string}")
	public void scenariooutline(String one, String two, String three) {
		System.out.println(String.format("Do %s when %s and %s", one, two, three));
		System.out.println("");
	}
}
