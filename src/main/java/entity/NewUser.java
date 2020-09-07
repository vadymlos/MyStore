package entity;


import lombok.Data;

@Data
public class NewUser {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String company;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String mobPhone;
    private String addressAlias;

    public NewUser(String firstName, String lastName, String password, String company, String address, String city, String zip, String mobPhone, String addressAlias) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.company = company;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.mobPhone = mobPhone;
        this.addressAlias = addressAlias;
    }

    public NewUser(String email) {
        this.email = email;
    }

    public NewUser(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
