package structural.proxy.style2;

/**
 * 代理 2
 *
 * @author samin
 * @date 2022-10-17
 */
public class Agent2 implements Subject2 {

    private final Subject2 star;

    Agent2(Subject2 star) {
        this.star = star;
    }

    @Override
    public void movie() {
        System.out.println("I am agent. I agree this work...");
        star.movie();
    }

    @Override
    public Agent2 getAgent() {
        return this;
    }
}
