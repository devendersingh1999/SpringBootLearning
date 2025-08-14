package usingBeanRunGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.PacMan;


@Configuration
public class GameCongiguration {

    // ✅ Define a bean of type GamingConsole (interface)
    // Here, we return an instance of PacMan (you can change it to Mario, etc.)
    @Bean
    public GamingConsole game() {
        return new PacMan();  // Game implementation returned as a bean
    }

    // ✅ Define a bean of GameRunner and inject the GamingConsole bean into it
    // Spring automatically injects the 'game' bean into this method
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);  // Dependency injection using method parameter
    }
}


//@Configuration
//public class GameCongiguration {
//
//	
//	
//	@Bean
//	public GamingConsole game() {
//		
//		var game = new PacMan();
//		return game;
//	}
//	
//	
//
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
//	
//}
