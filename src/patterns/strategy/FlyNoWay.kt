package patterns.strategy

import patterns.strategy.FlyBehavior

class FlyNoWay : FlyBehavior {
    override fun fly() {
        System.out.println("I can't fly :(")
    }
}