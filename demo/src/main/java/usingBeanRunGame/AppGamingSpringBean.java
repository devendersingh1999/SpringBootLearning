package usingBeanRunGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.game.GameRunner;

public class AppGamingSpringBean {
public static void main(String[] args) {
	
	
//	here we loaded class 
	try(var context = new AnnotationConfigApplicationContext(
			GameCongiguration.class)){
		context.getBean(GameRunner.class).run();
	}
}
}
