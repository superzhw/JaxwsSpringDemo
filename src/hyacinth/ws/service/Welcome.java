package hyacinth.ws.service;

import hyacinth.ws.IWelcome;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.stereotype.Service;

/**
 * @ClassName：HelloService
 * @Description：TODO
 * @date 2014-12-19 下午2:45:22
 */

@Service("welcomeService")
@WebService(targetNamespace = "http://xxx.com")
@SOAPBinding(style = Style.RPC)
public class Welcome {

	@Resource(name = "welcome")
	private IWelcome welcome;

	@WebMethod(operationName = "say")
	public String sayWelcome(@WebParam(name="name") String name,@WebParam(name="age") int age) {
		System.out.println("年龄：" + age);
		return welcome.say(name);
	}
	/*
	 * @WebMethod public String sayHello(String name) { return welcome.say(name); }
	 */
}
