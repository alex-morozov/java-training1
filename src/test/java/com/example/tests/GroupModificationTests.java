package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	
	@Test
	public void modifySomeGroup (){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().goToGroupsPage();
		
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
	    app.getGroupHelper().initGroupModification(0);
	    GroupData group = new GroupData();
	    group.name=" new name";	   
	    app.getGroupHelper().fillGroupForm(group);
	    app.getGroupHelper().submitGroupModification();// не срабатывает
	    app.getNavigationHelper().goToGroupsPage();	   	 
	    
        List<GroupData> newList = app.getGroupHelper().getGroups();	
	    
        oldList.remove(0);    
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);	 
	}

}