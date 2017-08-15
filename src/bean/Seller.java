package bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2017/8/15
 * Time: 15:03
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Entity
public class Seller {
    private String username;
    private String password;
    private String name;

    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;

        if (username != null ? !username.equals(seller.username) : seller.username != null) return false;
        if (password != null ? !password.equals(seller.password) : seller.password != null) return false;
        if (name != null ? !name.equals(seller.name) : seller.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Seller(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Seller() {
        super();
    }
}