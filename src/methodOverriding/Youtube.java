package methodOverriding;

public class Youtube extends SocialNetworkingPlatforms{

	@Override
	public void uploadContent() {
		System.out.println("Steps to upload content - \n1. Click the button to upload only video. \n"
				+ "2. Add important details to your video - thumbnail, title, description. \n3. Choose the privacy settings of your video."
				+ "\n4. Enter location. \n5. Create a playlist or add to existing playlist. \n6. Apply age restriction - select the correct option - \n   a.Video is made for kids "
				+ "\n   b.Video is not made for kids. \n7. Submit for review and approval.");

	}

}
