package com.careerit.jfs.cbook;

public class Contact {

    private String cid;
    private String name;
    private String email;
    private String mobile;

    public Contact(String name, String email, String mobile) {
        if (cid == null || cid.isEmpty()) {
            this.cid = CidGenerator.generateCid();
        }
        this.cid = cid;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
