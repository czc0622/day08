package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable {
    @Id
    private Integer sid;

    private String sname;

    private String sex;

    private String shobby;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date sbirth;

    private Integer mid;
    
    @Transient
    private Major major;
    
    @Transient
    private String start;
    
    @Transient
    private String end;
    
    public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	private static final long serialVersionUID = 1L;

    /**
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * @return shobby
     */
    public String getShobby() {
        return shobby;
    }

    /**
     * @param shobby
     */
    public void setShobby(String shobby) {
        this.shobby = shobby == null ? null : shobby.trim();
    }

    /**
     * @return sbirth
     */
    public Date getSbirth() {
        return sbirth;
    }

    /**
     * @param sbirth
     */
    public void setSbirth(Date sbirth) {
        this.sbirth = sbirth;
    }

    /**
     * @return mid
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * @param mid
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sname=").append(sname);
        sb.append(", sex=").append(sex);
        sb.append(", shobby=").append(shobby);
        sb.append(", sbirth=").append(sbirth);
        sb.append(", mid=").append(mid);
        sb.append("]");
        return sb.toString();
    }
}