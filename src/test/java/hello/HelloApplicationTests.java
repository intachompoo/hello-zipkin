package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

	@Test
	public void contextLoads() {
	}

}
