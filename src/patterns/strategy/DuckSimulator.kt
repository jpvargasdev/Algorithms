package patterns.strategy

fun main(args: Array<String>) {
    val mallardDuck: MallardDuck =
        MallardDuck()
    mallardDuck.performQuack()
    mallardDuck.performFly()

    val modelDuck : ModelDuck = ModelDuck()
    modelDuck.performQuack()
    modelDuck.setFlyBehavior(FlyRocketPowered())
    modelDuck.performFly()
}