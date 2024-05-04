package zw.co.tayanasoft.data;

import jakarta.persistence.Entity;

@Entity
public class Ward extends AbstractEntity {

    private Integer code;
    private String name;
    private String councillor;
    private String mobileNumber1;
    private String mobileNumber2;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCouncillor() {
        return councillor;
    }
    public void setCouncillor(String councillor) {
        this.councillor = councillor;
    }
    public String getMobileNumber1() {
        return mobileNumber1;
    }
    public void setMobileNumber1(String mobileNumber1) {
        this.mobileNumber1 = mobileNumber1;
    }
    public String getMobileNumber2() {
        return mobileNumber2;
    }
    public void setMobileNumber2(String mobileNumber2) {
        this.mobileNumber2 = mobileNumber2;
    }

}
