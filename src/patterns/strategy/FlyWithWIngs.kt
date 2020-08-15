package patterns.strategy

import patterns.strategy.FlyBehavior

class FlyWithWIngs : FlyBehavior {
    override fun fly() {
        System.out.println("I'm flying!!")
    }
}