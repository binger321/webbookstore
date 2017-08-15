package service.interfaces;

import bean.Seller;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/8/15
 * Time: 15:39
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface ISellerService{
    public void insert(Seller seller);
    public boolean check(Seller seller);
}
