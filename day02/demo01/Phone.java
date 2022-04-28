package cn.itcast.day02.demo01;

import org.w3c.dom.ls.LSOutput;

public class Phone {
    String brand;
    double price;
    String colour;

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发信息");

    }
}
