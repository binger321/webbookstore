package test;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/8/10
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class TestService {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void hello()
    {
        System.out.println("hello "+ getName());
    }
}