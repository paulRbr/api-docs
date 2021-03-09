// Customer.java

package io.quicktype;

import java.time.LocalDate;

public class Customer {
    private String addressCity;
    private String addressLineOne;
    private String addressLineTwo;
    private String addressState;
    private String addressZip;
    private BusinessDetails businessDetails;
    private long customerID;
    private LocalDate dateOfBirth;
    private String email;
    private String nameFirst;
    private String nameLast;
    private String nameMiddle;
    private String namePrefix;
    private String nameSuffix;
    private String phoneNumber;
    private String ssn;

    /**
     * Address city.
     */
    public String getAddressCity() { return addressCity; }
    public void setAddressCity(String value) { this.addressCity = value; }

    /**
     * Address line one.
     */
    public String getAddressLineOne() { return addressLineOne; }
    public void setAddressLineOne(String value) { this.addressLineOne = value; }

    /**
     * Address line two.
     */
    public String getAddressLineTwo() { return addressLineTwo; }
    public void setAddressLineTwo(String value) { this.addressLineTwo = value; }

    /**
     * Address state.
     */
    public String getAddressState() { return addressState; }
    public void setAddressState(String value) { this.addressState = value; }

    /**
     * Five digit zipcode or nine digit 'ZIP+4'
     */
    public String getAddressZip() { return addressZip; }
    public void setAddressZip(String value) { this.addressZip = value; }

    public BusinessDetails getBusinessDetails() { return businessDetails; }
    public void setBusinessDetails(BusinessDetails value) { this.businessDetails = value; }

    /**
     * A Canopy-generated unique ID for the customer
     */
    public long getCustomerID() { return customerID; }
    public void setCustomerID(long value) { this.customerID = value; }

    /**
     * Customer's date of birth in ISO 8601 format
     */
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate value) { this.dateOfBirth = value; }

    /**
     * The email address of this Customer
     */
    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    /**
     * Customer's first name. Primary account holder or controlling officer name for Business
     * customers.
     */
    public String getNameFirst() { return nameFirst; }
    public void setNameFirst(String value) { this.nameFirst = value; }

    /**
     * Customer's last name. Primary account holder or controlling officer name for Business
     * customers.
     */
    public String getNameLast() { return nameLast; }
    public void setNameLast(String value) { this.nameLast = value; }

    /**
     * Customer's middle name. Primary account holder or controlling officer name for Business
     * customers.
     */
    public String getNameMiddle() { return nameMiddle; }
    public void setNameMiddle(String value) { this.nameMiddle = value; }

    /**
     * Prefix to the customer's name. Primary account holder or controlling officer name for
     * Business customers.
     */
    public String getNamePrefix() { return namePrefix; }
    public void setNamePrefix(String value) { this.namePrefix = value; }

    /**
     * Suffix to the customer's name
     */
    public String getNameSuffix() { return nameSuffix; }
    public void setNameSuffix(String value) { this.nameSuffix = value; }

    /**
     * Customer's phone number in E.164 format
     */
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String value) { this.phoneNumber = value; }

    /**
     * Social security number of the customer
     */
    public String getSsn() { return ssn; }
    public void setSsn(String value) { this.ssn = value; }
}

// BusinessDetails.java

package io.quicktype;

public class BusinessDetails {
    private String businessEin;
    private String businessLegalName;
    private String doingBusinessAs;

    /**
     * EIN of the business
     */
    public String getBusinessEin() { return businessEin; }
    public void setBusinessEin(String value) { this.businessEin = value; }

    /**
     * The legal name of the Business
     */
    public String getBusinessLegalName() { return businessLegalName; }
    public void setBusinessLegalName(String value) { this.businessLegalName = value; }

    /**
     * The DBA name of the Business
     */
    public String getDoingBusinessAs() { return doingBusinessAs; }
    public void setDoingBusinessAs(String value) { this.doingBusinessAs = value; }
}
