package methodOverriding;

public class MainClassSocialNetworkingPlatforms {

	public static void main(String[] args) {

		Twitter twitter = new Twitter();
		Youtube youtube = new Youtube();
		Instagram instagram = new Instagram();
		Facebook facebook = new Facebook();

		twitter.createAccount();// will access parent class

		twitter.uploadContent(); // will access child class

		instagram.createAccount(); // will access child class

		instagram.uploadContent(); // will access parent class

		youtube.createAccount();// will access parent class

		youtube.uploadContent();// will access child class

		facebook.createAccount(); // will access parent class
		
		facebook.uploadContent(); // will access parent class

	}

}
