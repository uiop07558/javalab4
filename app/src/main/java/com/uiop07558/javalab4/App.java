package com.uiop07558.javalab4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
  public static void main(String[] args) {
    try {
      String usersUrl = "https://fake-json-api.mock.beeceptor.com/users";
      String usersJson = fetchData(usersUrl);
      ObjectMapper mapper = new ObjectMapper();
      List<User> users = mapper.readValue(usersJson,
          mapper.getTypeFactory().constructCollectionType(List.class, User.class));

      System.out.println("Users:");
      for (User user : users) {
        System.out.println(user);
      }

      String companiesUrl = "https://fake-json-api.mock.beeceptor.com/companies";
      String companiesJson = fetchData(companiesUrl);
      List<Company> companies = mapper.readValue(companiesJson,
          mapper.getTypeFactory().constructCollectionType(List.class, Company.class));

      System.out.println("\nCompanies:");
      for (Company company : companies) {
        System.out.println(company);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

  }


  private static String fetchData(String urlString) throws Exception {
    URL url = new URL(urlString);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    StringBuilder response = new StringBuilder();
    String line;
    while ((line = in.readLine()) != null) {
      response.append(line);
    }
    in.close();
    return response.toString();
  }
}
