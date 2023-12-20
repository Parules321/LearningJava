package methodOverriding;

public class Twitter extends SocialNetworkingPlatforms {
	
	
	@Override
	public void uploadContent() {
		System.out.println("Steps to upload content - \n1. Type not more than 280 characters. \n2.Include only 1 video or upto 4 photos \n3. Click Post button.");
		
	}

}
