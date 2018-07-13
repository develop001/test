package com.lzj.rv.design.template;

/**
 * Created by lijingyao on 16/3/29 17:05.
 */

public class HouseClient {

    public static void main(String[] args) {

        AbstractHouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }

}
