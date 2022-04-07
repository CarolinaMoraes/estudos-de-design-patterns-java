package estrutural.proxy2;

public class YoutubeManager {
	
	protected IThirdPartyYoutubeLib service;

	public YoutubeManager(IThirdPartyYoutubeLib service) {
		this.service = service;
	}
	
	public void renderVideoPage() {
		System.out.println("Show info");
		System.out.println(this.service.getVideoInfo(1));
	}
	
	public void renderListPage() {
		System.out.println("Show list page");
		System.out.println(this.service.listVideos());
	}
}
