package comportamental.template;

public abstract class Record {

	// template method
	public void save() {
		this.validate();
		this.beforeSave();
		
		// save to the DB
	}
	
	public abstract void validate();
	
	public void beforeSave() {
		System.out.println("Antes de salvar");
	}
}
