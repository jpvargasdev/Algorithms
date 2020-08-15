package patterns.strategy

class ModelDuck : Duck {
    constructor() {
        setFlyBehavior(FlyNoWay())
        setQuackBehavior(Quack())
    }
    override fun display() {
        System.out.println("I'm a model duck")
    }
}