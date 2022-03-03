package comportamental.template;

public class User extends Record{

	@Override
	public void validate() {
		System.out.println("Validando usu�rio");
	}
	
	@Override
	public void beforeSave() {
		System.out.println("Antes de salvar o usu�rio");
	}

}
