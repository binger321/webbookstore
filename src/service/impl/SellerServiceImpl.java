package service.impl;

import bean.Seller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import service.interfaces.ISellerService;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/8/15
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class SellerServiceImpl implements ISellerService {
    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void insert(Seller seller) {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.save(seller);
        tx.commit();
    }

    @Override
    public boolean check(Seller seller) {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        Seller seller1=s.get(Seller.class,seller.getUsername());
        tx.commit();
        if (seller1!=null){
            if(seller.getPassword().equals(seller1.getPassword())){
                return true;
            }
        }
        return false;

    }
}