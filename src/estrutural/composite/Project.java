package estrutural.composite;

import java.util.List;

public class Project implements TodoListItem {

	private String title;

	private List<TodoListItem> todos;

	public Project(String title, List<TodoListItem> todos) {
		this.title = title;
		this.todos = todos;
	}

	@Override
	public String stringToHtml() {
		String html = "<h1>" + this.title + "</h1>";

		html += "<ul>";
		
		for (TodoListItem todoList : todos) {
			html += "<li>";
			html += todoList.stringToHtml();
			html += "</li>";
		}
		
		html += "</ul>";
		
		return html;
	}

}
