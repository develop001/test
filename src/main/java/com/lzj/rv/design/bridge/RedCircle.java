package com.lzj.rv.design.bridge;

/**
 * Created by lijingyao on 16/4/28 10:14.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}