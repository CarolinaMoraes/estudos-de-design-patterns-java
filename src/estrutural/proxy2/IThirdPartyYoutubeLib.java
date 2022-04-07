package estrutural.proxy2;

import java.util.List;

public interface IThirdPartyYoutubeLib {
	
	public List<String> listVideos();

	public String getVideoInfo(int id);
}
