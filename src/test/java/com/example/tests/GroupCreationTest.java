package com.example.tests;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class GroupCreationTest extends TestBase{

	@Test
	public void addGroup (){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().goToGroupsPage();
	    app.getGroupHelper().initGroupCreation();
	    GroupData group = new GroupData();
	    group.groupname="name";
	    group.groupfooter="footer";
	    group.groupheader="header";
	    app.getGroupHelper().fillGroupCreationForm(group);
	    app.getNavigationHelper().goToGroupsPage();	   	   
	}
}
