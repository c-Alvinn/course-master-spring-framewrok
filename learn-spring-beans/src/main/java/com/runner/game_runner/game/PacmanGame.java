package com.runner.game_runner.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

    public void up(){
        System.out.println("Up");
    }

    public void down(){
        System.out.println("Down");
    }

    public void left(){
        System.out.println("Left");
    }

    public void right(){
        System.out.println("Right");
    }
}
