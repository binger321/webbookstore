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
public class Statuslist {
    private String status;
    private String chinese;

    @Id
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "chinese")
    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Statuslist that = (Statuslist) o;

        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (chinese != null ? !chinese.equals(that.chinese) : that.chinese != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = status != null ? status.hashCode() : 0;
        result = 31 * result + (chinese != null ? chinese.hashCode() : 0);
        return result;
    }
}