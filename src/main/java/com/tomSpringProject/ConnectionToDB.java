package com.tomSpringProject;

import com.tomSpringProject.demo.entities.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConnectionToDB {

    private static final String USERNAME = "bootcamp6";
    private static final String PASSWORD = "SimpleKettle";
    private static final String LIVE_CONNECTION =  "jdbc:mysql://db-workshop.public-dev.zuto.cloud/bootcamp6";
    private Connection connection = null;


    public List<Person> connectingToDb() throws SQLException{

        List<Person> listOfusersInfo = new ArrayList<>();
        try{
            connection = DriverManager.getConnection(LIVE_CONNECTION,USERNAME,PASSWORD);

            Statement statement = connection.createStatement();

            ResultSet usersInfo = statement.executeQuery("SELECT name , email, number , location FROM users");

            while (usersInfo.next()){
                String name = usersInfo.getString(1);
                String email = usersInfo.getString(2);
                long number = usersInfo.getLong(3);
                listOfusersInfo.add(new Person(name, null, email, number, Collections.emptyList()));
            }


        }catch(Exception e){
            System.out.println("Connection to database has failed");
            e.printStackTrace();
        }finally {
            connection.close();
        }

        return listOfusersInfo;

    }

    private String getUsersInfo(List<String> listOfusersInfo) {
    StringBuilder stringBuilder = new StringBuilder();
    for(String info:listOfusersInfo){
        stringBuilder.append(info);
    }
     return stringBuilder.toString();
    }
}
