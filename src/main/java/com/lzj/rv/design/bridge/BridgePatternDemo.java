package com.lzj.rv.design.bridge;

/**
 * Created by lijingyao on 16/4/28 10:15.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        AbstractShape redCircle = new Circle(100, 100, 10, new RedCircle());
        AbstractShape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
