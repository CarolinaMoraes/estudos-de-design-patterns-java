package comportamental.command;

public class TestarCommand {

	public static void main(String[] args) {
		
		Light light = new Light();
		Invoker invoker = new Invoker(new LightOnCommand(light), new LightOffCommand(light));
		
		invoker.clickOn();
		invoker.clickOff();
	}

}
