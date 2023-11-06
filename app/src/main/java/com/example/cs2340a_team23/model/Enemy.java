package com.example.cs2340a_team23.model;

import android.content.Context;
import android.widget.ImageView;

public abstract class Enemy {
    private String name;
    private ImageView spriteView;
    private int speed;
    private MoveBehavior moveBehavior;
    private float enemyX;
    private float enemyY;
    public abstract void createSpriteView(Context context);
    public abstract ImageView getSpriteView();
    public abstract void move(String direction, int screenWidth, int screenHeight);
}