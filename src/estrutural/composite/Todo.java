package estrutural.composite;

public class Todo implements TodoListItem {

	private String text;
	
	public Todo(String text) {
		this.text = text;
	}

	@Override
	public String stringToHtml() {
		return this.text;
	}

}
