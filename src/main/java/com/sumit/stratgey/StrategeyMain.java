package com.sumit.stratgey;

public class StrategeyMain {

    public static void main(String[] args) {
        FlyableWithoutWings flyableWithoutWings = new FlyableWithoutWings();
        FlyableWithWings flyableWithWings = new FlyableWithWings();
        QuackWithMouth quackWithMouth = new QuackWithMouth();
        QuackWithoutMouth quackWithoutMouth = new QuackWithoutMouth();

        Dock dock = new MalardDuck(quackWithMouth,flyableWithWings);
        dock.flyMe();
        dock.quackMe();
    }
}
