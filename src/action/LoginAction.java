package action;

import bean.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import service.impl.SellerServiceImpl;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/8/15
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class LoginAction {
    private String userName;
    private String password;
    private String status;
    @Autowired
    private SellerServiceImpl sellerService;

    public void setSellerService(SellerServiceImpl sellerService) {
        this.sellerService = sellerService;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {

        return userName;
    }

    public String getStatus() {
        return status;
    }

    public String login(){
        if ("seller".equals(getStatus()))
        {
            Seller seller=new Seller();
            seller.setUsername(getUserName());
            seller.setPassword(getPassword());
            boolean b=sellerService.check(seller);
            if (b){
                return SUCCESS;
            }
        }
        return ERROR;

    }
}