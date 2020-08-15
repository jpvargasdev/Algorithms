package patterns.strategy

class MuteQuack : QuackBehavior {
    override fun quack() {
        System.out.println("<< Silence >>")
    }
}