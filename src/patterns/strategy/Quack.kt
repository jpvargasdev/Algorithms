package patterns.strategy

class Quack : QuackBehavior {
    override fun quack() {
        System.out.println("Quack!")
    }
}