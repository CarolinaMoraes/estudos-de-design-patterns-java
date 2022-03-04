package estrutural.facade;

public class CodecApplier {
	
	private String videoFilename;
	
	public CodecApplier(String videoFilename) {
		this.videoFilename = videoFilename;
	}
	
	public String applyCodec() {
		System.out.println("Applying codec");
		return this.videoFilename.replace(".mp4", ".mkv");
	}
	
	
}
