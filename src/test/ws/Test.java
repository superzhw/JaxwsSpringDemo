package test.ws;

import test.ws.client.Welcome;
import test.ws.client.WelcomeService;

/**
 * @ClassName：Test
 * @Description：TODO
 * @date 2014-12-24 下午8:00:52
 */
public class Test {

	public static void main(String[] args) {

		WelcomeService welcomeService = new WelcomeService();

		Welcome welcome = welcomeService.getWelcomePort();

		System.out.println("start ws client...");

		System.out.println(welcome.sayWelcome("Avatar"));

		System.out.println("ws client ends...");
	}

}
