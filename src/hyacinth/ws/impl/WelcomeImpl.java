package hyacinth.ws.impl;

import hyacinth.ws.IWelcome;

import org.springframework.stereotype.Component;

/**
 * @ClassName：WelcomeImpl
 * @Description：TODO
 * @date 2014-12-24 下午7:40:59
 */

@Component("welcome")
public class WelcomeImpl implements IWelcome {

	@Override
	public String say(String name) {
		System.out.println("调用服务："+name);
		return "Welcome，" + name + "！";
	}

}
