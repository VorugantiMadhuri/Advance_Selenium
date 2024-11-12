
package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.AddNewCoursePage;
import objectRepo.CourseListPage;
import utils.TestContextSetup;

public class CoursePageSteps {
	
	TestContextSetup testContextSetUp;
	CourseListPage course;
	AddNewCoursePage addCourse;
	String courseName;
	
	public CoursePageSteps(TestContextSetup testContextSetUp) {
		this.testContextSetUp = testContextSetUp;
	}

	@When("add course")
	public void add_course(List<String> list) {
		course = testContextSetUp.pom.getCourseList();
		course.clickNew();
		addCourse = testContextSetUp.pom.getAddCourse();
		courseName = list.get(0);
		addCourse.setName(list.get(0));
		addCourse.chooseCategory(testContextSetUp.driverUtil, list.get(1));
		addCourse.setPrice(list.get(2));
		addCourse.setPhoto(list.get(3));
		addCourse.setDescription(testContextSetUp.driverUtil, list.get(4));
		addCourse.clickSave();
	}

	@Then("course should be created")
	public void course_should_be_created() {
		System.out.println(course.getSuccessAlertMessage());
	}

	@When("I delete course")
	public void i_delete_course() {
		course.deleteCourse(testContextSetUp.driverUtil, courseName);
	}

	@Then("course should be removed from course list")
	public void course_should_be_removed_from_course_list() {
		System.out.println(course.getSuccessAlertMessage());
	}

}
