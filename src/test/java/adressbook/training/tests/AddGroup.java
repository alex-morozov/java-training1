package adressbook.training.tests;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import training.common.GroupData;
import training.common.TestBase;

public class AddGroup extends TestBase{

	@Test
	public void addGroup (){
		goToGroupsPage();
	    initGroupCreation();
	    GroupData group = new GroupData();
	    group.groupname="name";
	    group.groupfooter="footer";
	    group.groupheader="header";
	    fillGroupCreationForm(group);
	    goToGroupsPage();
	    assertTrue(isElementPresent(By.name("new")));	   
	}
}