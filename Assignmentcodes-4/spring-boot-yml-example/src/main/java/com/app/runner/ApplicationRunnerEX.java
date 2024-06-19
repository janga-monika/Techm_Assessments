package com.app.runner;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.app.model.Product;

@Component
public class ApplicationRunnerEX implements ApplicationRunner {
	@Autowired
	private Product prod;
	
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(Arrays.asList(prod));
	}
}