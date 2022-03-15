package com.company.CustomerComposition;

public class Customer {

    private Account account;
    private Address shippingAddress;
    private Address BillingAddress;
    private boolean isRewards;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return BillingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        BillingAddress = billingAddress;
    }

    public boolean isRewards() {
        return isRewards;
    }

    public void setRewards(boolean rewards) {
        isRewards = rewards;
    }
}
