package patterns.strategy

class MallardDuck : Duck {
    constructor() {
        setFlyBehavior(FlyNoWay())
        setQuackBehavior(Quack())
    }

    override fun display() {
        System.out.println("I'm a real Mallard duck");
    }
}