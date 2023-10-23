package com.example.cs2340a_team23;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.example.cs2340a_team23.model.Leaderboard;
import com.example.cs2340a_team23.model.Player;
import com.example.cs2340a_team23.model.Walk;

public class ShawnaUnitTest {
    private Leaderboard leaderboard;
    private Walk walk;
    private Player player;

    @Before
    public void setUp() {
        player = Player.getPlayer();
        walk = new Walk();
    }
    @Test
    public void checkInitializePlayer() {
        player.initializePlayer("Rocko", 200, "mario");
        assertEquals("Rocko", player.getPlayerName());
        assertEquals(200, player.getHealth());
        assertEquals("mario", player.getSprite());
    }

    @Test
    public void checkPlayerSprite() {
        player.setSprite("megaman");
        assertEquals("megaman", player.getSprite());
    }
    @Test
    public void testMoveDown() {
        float[] initialPosition = {100.0f, 100.0f};
        int screenWidth = 800;
        int screenHeight = 600;
        int spriteWidth = 50;
        int spriteHeight = 50;
        float[] newPosition = walk.move(initialPosition[0], initialPosition[1], "down",
                screenWidth, screenHeight, spriteWidth, spriteHeight);
        float[] expectedPosition = {100.0f, 150.0f};
        assertArrayEquals(expectedPosition, newPosition, 0.01F);
    }
    @Test
    public void testMoveLeft() {
        float[] initialPosition = {100.0f, 100.0f};
        int screenWidth = 800;
        int screenHeight = 600;
        int spriteWidth = 50;
        int spriteHeight = 50;
        float[] newPosition = walk.move(initialPosition[0], initialPosition[1], "left",
                screenWidth, screenHeight, spriteWidth, spriteHeight);
        float[] expectedPosition = {50.0f, 100.0f};
        assertArrayEquals(expectedPosition, newPosition, 0.01F);
    }
}
