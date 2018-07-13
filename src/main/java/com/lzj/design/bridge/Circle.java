package com.lzj.design.bridge;

/**
 * Created by lijingyao on 16/4/28 10:15.
 */
public class Circle extends AbstractShape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}