package com.uiop07558.javalab4;

class User {
  private int id;
  private String name;
  private String company;
  private String username;
  private String email;
  private String address;
  private String zip;
  private String state;
  private String country;
  private String phone;
  private String photo;

  @Override
  public String toString() {
      return "id: " + id + "\n" +
              "name: " + name + "\n" +
              "company: " + company + "\n" +
              "username: " + username + "\n" +
              "email: " + email + "\n" +
              "address: " + address + "\n" +
              "zip: " + zip + "\n" +
              "state: " + state + "\n" +
              "country: " + country + "\n" +
              "phone: " + phone + "\n" +
              "photo: " + photo + "\n\n";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }
}