package estrutural.proxy2;

public class TestProxy {

	public static void main(String[] args) {
	
		ThirdPartyYoutubeLib aYouTubeService = new ThirdPartyYoutubeLib();
		CachedYoutubeLib aYouTubeProxy = new CachedYoutubeLib(aYouTubeService);
		YoutubeManager manager = new YoutubeManager(aYouTubeProxy);
		manager.renderListPage();
		manager.renderVideoPage();
	}

}
