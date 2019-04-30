package day27_arrays05;

public class TestingTools {

	public static void main(String[] args) {

		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };

//		Java --> programming language
//		Selenium --> Test Automation
//		TestNG --> Unit Tests
//		JUnit --> Unit Tests
//		Cucumber --> BDD Style testing
//		Git --> Version control
//		Maven --> Building and execution for project

		for (String tool : tools) {
			// System.out.println(tool);

			switch (tool.toLowerCase()) {
			case "java": 
				System.out.println("Java --> programming language");
				break;
			case "selenium":
				System.out.println("Selenium --> Test Automation");
				break;
			case "testng":
				System.out.println("TestNG --> Unit Tests");
				break;
			case "junit":
				System.out.println("JUnit --> Unit Tests");
				break;
			case "cucumber":
				System.out.println("Cucumber --> BDD Style testing");
				break;
			case "git":
				System.out.println("Git --> Version control");
				break;
			case "maven":
				System.out.println("Maven --> Building and execution for project");
				break;
//				default:
//					System.out.println("Invalid tool");
			}
		}

	}

}
