/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.UserHelper;
import java.util.List;
import pojos.User;

/**
 *
 * @author basisa20
 */
public class testUser2 {

    public static void main(String[] args) {
        UserHelper test = new UserHelper();
        User user = test.getUser("puspa@usd.ac.id", "1234");
        if (user != null) {
            Gson gson = new Gson();
            String json = gson.toJson(user);
            System.out.println(json);
        }
        User user1 = test.getUser("puspa@usd.ac.id", "1234567890");
        if (user1 != null) {
            Gson gson = new Gson();
            String json = gson.toJson(user1);
            System.out.println(json);
        }
        User user2 = test.getUser("puspaningtyas@gmail.com", "1234567890");
        if (user2 != null) {
            Gson gson = new Gson();
            String json = gson.toJson(user2);
            System.out.println(json);
        }
        User user3 = test.getUser("puspa@usd.ac.id", "123456789");
        if (user3 != null) {
            Gson gson = new Gson();
            String json = gson.toJson(user3);
            System.out.println(json);
        }
    }
}
