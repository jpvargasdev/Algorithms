package patterns.strategy

abstract class Duck {
    private var flyBehavior: FlyBehavior? = null
    private var quackBehavior: QuackBehavior? = null

    abstract fun display();

    fun performFly() {
        flyBehavior?.fly()
    }

    fun performQuack() {
        quackBehavior?.quack()
    }

    fun swim() {
        System.out.println("All ducks float, even decoys!")
    }

    fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }

    fun setQuackBehavior(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }
}