package com.lzj.design.doubleDispatch;

/**
 * Created by lijingyao on 15/12/22 12:35.
 */
public class Circle implements Figure {
    @Override
    public void printOn(Printer printer) {
        printer.printCircle(this); // <-- the "trick" !
    }
}

