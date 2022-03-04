package estrutural.facade;

public class TestaVideoConverter {

	public static void main(String[] args) {
		VideoConverterFacade converterFacade = new VideoConverterFacade();
		converterFacade.convertVideo("video.mp4");
	}
}
