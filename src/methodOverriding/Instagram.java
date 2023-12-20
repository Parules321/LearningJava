package methodOverriding;

public class Instagram extends SocialNetworkingPlatforms {

	@Override
	public void createAccount() {
		System.out.println(
				"Steps to create account - \n1. Click to create an account. \n2. Enter email address or phone number and password associated with Facebook account "
						+ "and log in with existing facebook account. \n3. Create username");
	}

}
