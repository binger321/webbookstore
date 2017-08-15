package action;

import bean.Seller;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import service.impl.SellerServiceImpl;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/8/15
 * Time: 15:29
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class RegisterAction extends ActionSupport{
    private String status;
    private String realName;
    private String userName;
    private String password;

    @Autowired
    private SellerServiceImpl sellerService;

    public void setSellerService(SellerServiceImpl sellerService) {
        this.sellerService = sellerService;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public String getRealName() {

        return realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String register(){
        if ("seller".equals(getStatus())){
            Seller seller=new Seller(userName,password,realName);
            sellerService.insert(seller);
            return SUCCESS;
        }else
            return ERROR;

    }
}