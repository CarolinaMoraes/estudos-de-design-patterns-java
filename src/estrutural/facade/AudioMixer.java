package estrutural.facade;

public class AudioMixer {
	
	private String videoFilename;
	
	public AudioMixer(String videoFilename) {
		this.videoFilename = videoFilename;
	}

	public String mixAudio() {
		System.out.println("Mixing audio of" + videoFilename);
		return videoFilename + " audio mixed";
	}
}
