package estrutural.proxy2;

import java.util.Arrays;
import java.util.List;

public class ThirdPartyYoutubeLib implements IThirdPartyYoutubeLib {

	@Override
	public List<String> listVideos() {
		System.out.println("Sending a request to the youtube API");
		return Arrays.asList("Happiest Season Bloopers and Gag Reel", "Cell Block Tango", "Laganja Estranja vs Trinity K Bonet");
	}

	@Override
	public String getVideoInfo(int id) {
		System.out.println("Getting video: " + id + " info");
		return "Video filmed in 2021";
	}
}
