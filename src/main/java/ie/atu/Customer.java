package ie.atu;

public class Customer {
    private String title;
    private String name;
    private long phone;
    private String eircode;

    public Customer(String title, String name, long phone, String eircode){
        setTitle(title);
        setName(name);
        setPhone(phone);
        setEircode(eircode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if("Mr".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title)) {
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Invalid title, please use Mr , Ms , or Mrs");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name,must be minimum 3 characters");
        }
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        if(String.valueOf(phone).length() >= 7) {
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("Invalid phone no. ,must be 7 characters minimum");
        }
    }

    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        if(eircode.length() == 7) {
            this.eircode = eircode;
        }
        else{
            throw new IllegalArgumentException("Invalid eircode, must be 7 characters");
        }
    }
}
