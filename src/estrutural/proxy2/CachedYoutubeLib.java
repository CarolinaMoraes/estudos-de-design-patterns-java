package estrutural.proxy2;

import java.util.List;

public class CachedYoutubeLib implements IThirdPartyYoutubeLib {

	private ThirdPartyYoutubeLib thirdPartyYoutubeLib = null;

	private List<String> listCache;

	private String videoCache;

	private boolean needReset;

	public CachedYoutubeLib(ThirdPartyYoutubeLib thirdPartyYoutubeLib) {
		this.thirdPartyYoutubeLib = thirdPartyYoutubeLib;
	}

	@Override
	public List<String> listVideos() {

		if (this.listCache == null || needReset) {
			this.listCache = this.thirdPartyYoutubeLib.listVideos();
		}

		return this.listCache;
	}

	@Override
	public String getVideoInfo(int id) {

		if (this.videoCache == null || needReset) {
			this.videoCache = this.thirdPartyYoutubeLib.getVideoInfo(id);
		}
		return this.videoCache;
	}

}
