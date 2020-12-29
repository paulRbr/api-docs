package io.quicktype;

import java.time.OffsetDateTime;

public class Customer {
    private String addressCity;
    private String addressLineOne;
    private String addressLineTwo;
    private String addressState;
    private String addressZip;
    private long customerID;
    private OffsetDateTime dateOfBirth;
    private String email;
    private String nameFirst;
    private String nameLast;
    private String nameMiddle;
    private String namePrefix;
    private String nameSuffix;
    private String phoneNumber;
    private String ssn;

    /**
     * Address city
     */
    public String getAddressCity() { return addressCity; }
    public void setAddressCity(String value) { this.addressCity = value; }

    /**
     * Address line one
     */
    public String getAddressLineOne() { return addressLineOne; }
    public void setAddressLineOne(String value) { this.addressLineOne = value; }

    /**
     * Address line two
     */
    public String getAddressLineTwo() { return addressLineTwo; }
    public void setAddressLineTwo(String value) { this.addressLineTwo = value; }

    /**
     * Address state
     */
    public String getAddressState() { return addressState; }
    public void setAddressState(String value) { this.addressState = value; }

    /**
     * Address zip code
     */
    public String getAddressZip() { return addressZip; }
    public void setAddressZip(String value) { this.addressZip = value; }

    /**
     * A Canopy-generated unique ID for the customer
     */
    public long getCustomerID() { return customerID; }
    public void setCustomerID(long value) { this.customerID = value; }

    /**
     * Customer's date of birth
     */
    public OffsetDateTime getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(OffsetDateTime value) { this.dateOfBirth = value; }

    /**
     * The email address of this customer
     */
    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    /**
     * Customer's first name
     */
    public String getNameFirst() { return nameFirst; }
    public void setNameFirst(String value) { this.nameFirst = value; }

    /**
     * Customer's last name
     */
    public String getNameLast() { return nameLast; }
    public void setNameLast(String value) { this.nameLast = value; }

    /**
     * Customer's middle name
     */
    public String getNameMiddle() { return nameMiddle; }
    public void setNameMiddle(String value) { this.nameMiddle = value; }

    /**
     * Prefix to the customer's name
     */
    public String getNamePrefix() { return namePrefix; }
    public void setNamePrefix(String value) { this.namePrefix = value; }

    /**
     * Prefix to the customer's name
     */
    public String getNameSuffix() { return nameSuffix; }
    public void setNameSuffix(String value) { this.nameSuffix = value; }

    /**
     * Phone number of the customer
     */
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String value) { this.phoneNumber = value; }

    /**
     * Social security number of the customer
     */
    public String getSsn() { return ssn; }
    public void setSsn(String value) { this.ssn = value; }
}
