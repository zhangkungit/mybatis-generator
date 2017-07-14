package zhangkun.model;

import java.util.Date;

public class Require {
    private Integer id;

    private String aCustId;

    private String bCustId;

    private String msg;

    private String status;

    private Date createTime;

    private String isRequire;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getaCustId() {
        return aCustId;
    }

    public void setaCustId(String aCustId) {
        this.aCustId = aCustId == null ? null : aCustId.trim();
    }

    public String getbCustId() {
        return bCustId;
    }

    public void setbCustId(String bCustId) {
        this.bCustId = bCustId == null ? null : bCustId.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsRequire() {
        return isRequire;
    }

    public void setIsRequire(String isRequire) {
        this.isRequire = isRequire == null ? null : isRequire.trim();
    }
}