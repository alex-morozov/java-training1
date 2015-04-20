package com.example.tests;


import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;


import java.util.Random;

import org.testng.annotations.Test;

import com.example.utils.SortedListOf;

public class GroupModificationTests extends TestBase {
	
	@Test (dataProvider = "randomValidGroupGenerator")
	public void modifySomeGroup (GroupData group){
		SortedListOf<GroupData> oldList = app.getGroupHelper().getGroups();
		
		Random rnd = new Random();
		int index = rnd.nextInt(oldList.size()-1);
		
		app.getGroupHelper().modifyGroup(index, group);	    
		
	    
		assertThat(oldList, equalTo(oldList.without(index).withAdded(group)));
      
	}

}
