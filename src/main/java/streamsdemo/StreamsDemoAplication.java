package streamsdemo;

import java.sql.Date;
import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class StreamsDemoAplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StreamsDemoApplication.class, args);
		
		//Date start = new Date();
		//IntStream.range(0,1000).parallel().forEach(i->System.out.prinln(i));
		//Date end = new Date();
		//long length = end.getTime() - start.getTime();
		
		Date start = new Date();
		
		
	}
}
