package geektime.spring.hello.hellospring;

import geektime.spring.hello.hellospring.Audien.countNumber;
import geektime.spring.hello.hellospring.Dessert.Dessert;
import geektime.spring.hello.hellospring.Starer.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAspectJAutoProxy//启用aspectj
@ComponentScan
public class HelloSpringApplicationTests {
	@Autowired
			@Qualifier("newCake")
	Dessert dessert;
	@Autowired
	Environment env;
	@Autowired
	@Qualifier("performanceI")
	Performance perform;
	@Autowired
	countNumber cout;
	@Test
	public void contextLoads() {
	}
	@Test
	public void sty(){
		dessert.say();
	//	System.out.println(env.getRequiredProperty("disc.title"));
	}
	@Test
	public  void  testt(){
		try {
			System.out.println("第一场次");
			perform.sing(10);
			System.out.println("第二场次");
			perform.sing(999);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("---------------");
	}
	@Test
	public void ttrre(){
		/*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HttpHandlerAutoConfiguration.AnnotationConfig.class);
		Performance person = (Performance) ctx.getBean("hi");
		perform.sing(10);
		star s = (star)perform;
		s.act();*/
		perform.sing(10);
		//star s = (star)perform;
		//s.act();
	//	countNumber
	/*	perform.sing(10);
		perform.sing(12);*/
	}

}
