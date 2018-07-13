package com.lzj.design.template;

/**
 * Created by lijingyao on 16/3/29 17:04.
 */
public class WoodenHouse extends AbstractHouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }

}