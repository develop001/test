package com.lzj.rv.design.template;

/**
 * Created by lijingyao on 16/3/29 17:05.
 */
public class GlassHouse extends AbstractHouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }

}