package com.lzj.design.doubleDispatch;

/**
 * Created by lijingyao on 15/12/22 12:36.
 */
public class InkjetPrinter implements Printer {

    @Override
    public void printCircle(Circle circle) {
        // ... rasterizing logic for inkjet printing of circles here ...
        System.out.println("Inkjet printer prints a cirlce.");
    }

    @Override
    public void printRectangle(Rectangle rectangle) {
        // ... rasterizing logic for inkjet printing of rectangles here ...
        System.out.println("Inkjet printer prints a rectangle.");
    }
}
