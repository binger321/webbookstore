package test;

import bean.Addresslist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.Address;
import service.AddressImpl;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/8/10
 * Time: 15:38
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        Address ail = (AddressImpl)ac.getBean("address");
        Addresslist al = new Addresslist();
        al.setName("kaka");
        al.setPhone("123456123");
        ail.add(al);
    }


}