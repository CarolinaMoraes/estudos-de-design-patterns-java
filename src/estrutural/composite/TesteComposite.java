package estrutural.composite;

import java.util.Arrays;

public class TesteComposite {

	public static void main(String[] args) {

		TodoListItem smallTask = new Todo("Wash the dishes");
		
		TodoListItem smallTask2 = new Todo("Do the laundry");

		TodoListItem smallTask3 = new Todo("Tidy the closet");
		
		TodoListItem smallTask4 = new Todo("Clear the bedroom floor");
	
		TodoListItem cleanRoomProject = new Project("Clean the bedroom", Arrays.asList(smallTask3, smallTask4));
		
		TodoListItem cleanTheHouseProject = new Project("Clean the house", Arrays.asList(cleanRoomProject, smallTask, smallTask2));
		
		String finalHtml = cleanTheHouseProject.stringToHtml();
		System.out.println(finalHtml);
		
	}

}
