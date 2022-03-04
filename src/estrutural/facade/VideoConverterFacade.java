package estrutural.facade;

public class VideoConverterFacade {
	
	public void convertVideo(String filename) {
		// V�rias opera��es de outras classes
		
		System.out.println("Preparing file: "+ filename);
	
		String videoWithAudioMixed = new AudioMixer(filename).mixAudio();
		
		System.out.println("Starting to apply the codec");
		
		String videoWithRightCodec = new CodecApplier(videoWithAudioMixed).applyCodec();
		
		System.out.println("Finishing");
		
		System.out.println(videoWithRightCodec);
	}
}
