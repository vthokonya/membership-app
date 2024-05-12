package zw.co.tayanasoft.data;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;

@Entity
public class Member extends AbstractEntity {

    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private String occupation;

    //private String role;
    //private boolean important;
    private String idType;
    private String identityNumber;
    private LocalDate dateSettled;
    @ManyToOne
    @JoinColumn(name = "ward_id")
    private Ward ward;
    @ManyToOne
    @JoinColumn(name = "village_id")
    private Village village;
    private String nkFullName;
    private String nkOccupation;
    private String nkIdType;
    private String nkIdentityNumber;
    private LocalDate nkDateOfBirth;
    private String nkMobileNumber;

    public Member() {
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    /*public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public boolean isImportant() {
        return important;
    }
    public void setImportant(boolean important) {
        this.important = important;
    }*/
    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public LocalDate getDateSettled() {
        return dateSettled;
    }

    public void setDateSettled(LocalDate dateSettled) {
        this.dateSettled = dateSettled;
    }

    public String getNkFullName() {
        return nkFullName;
    }

    public void setNkFullName(String nkFullName) {
        this.nkFullName = nkFullName;
    }

    public String getNkOccupation() {
        return nkOccupation;
    }

    public void setNkOccupation(String nkOccupation) {
        this.nkOccupation = nkOccupation;
    }

    public String getNkIdType() {
        return nkIdType;
    }

    public void setNkIdType(String nkIdType) {
        this.nkIdType = nkIdType;
    }

    public String getNkIdentityNumber() {
        return nkIdentityNumber;
    }

    public void setNkIdentityNumber(String nkIdentityNumber) {
        this.nkIdentityNumber = nkIdentityNumber;
    }

    public LocalDate getNkDateOfBirth() {
        return nkDateOfBirth;
    }

    public void setNkDateOfBirth(LocalDate nkDateOfBirth) {
        this.nkDateOfBirth = nkDateOfBirth;
    }

    public String getNkMobileNumber() {
        return nkMobileNumber;
    }

    public void setNkMobileNumber(String nkMobileNumber) {
        this.nkMobileNumber = nkMobileNumber;
    }
}
