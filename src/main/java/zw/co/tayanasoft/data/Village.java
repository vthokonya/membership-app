package zw.co.tayanasoft.data;

import jakarta.persistence.Entity;

@Entity
public class Village extends AbstractEntity {

    private String villageName;
    private String headMan;
    private String mobileNumber1;
    private String mobileNumber2;

    public String getVillageName() {
        return villageName;
    }
    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }
    public String getHeadMan() {
        return headMan;
    }
    public void setHeadMan(String headMan) {
        this.headMan = headMan;
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
