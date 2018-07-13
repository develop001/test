package com.lzj.rv.design.bridge;

/**
 * Created by lijingyao on 16/4/28 10:14.
 */
public abstract class AbstractShape {
    protected DrawAPI drawAPI;

    protected AbstractShape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}