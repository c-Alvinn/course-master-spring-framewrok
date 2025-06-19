package com.runner.game_runner.exemples.a0;

import com.runner.game_runner.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.runner.game_runner.game")
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {

			context.getBean(GameRunner.class).run();
		}

	}

}
