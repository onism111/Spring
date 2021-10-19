package spring;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext(
				"/spring/applicationContext.xml");
		// 从容器中，获取增强后的目标对象
		TestDao testDaoAdvice = (TestDao) appCon.getBean("testDaoProxy");
		// 执行方法
		testDaoAdvice.save();
		System.out.println("================");
		testDaoAdvice.modify();
		System.out.println("================");
		testDaoAdvice.delete();
	}
}
