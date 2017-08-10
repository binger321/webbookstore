package service;

import bean.Addresslist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/8/10
 * Time: 18:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class AddressImpl implements Address{
    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(Addresslist al) {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.save(al);
        tx.commit();
    }
}