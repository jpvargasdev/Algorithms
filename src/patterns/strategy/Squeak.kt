package patterns.strategy

import patterns.strategy.QuackBehavior

class Squeak : QuackBehavior {
    override fun quack() {
        System.out.println("Squeak")
    }
}