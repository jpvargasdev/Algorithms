package patterns.strategy

import patterns.strategy.FlyBehavior

class FlyRocketPowered : FlyBehavior {
    override fun fly() {
        System.out.println("I'm flying with a rocket!")
    }
}