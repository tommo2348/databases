package com.tomSpringProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionToDB {

    private static final String USERNAME = "bootcamp6";
    private static final String PASSWORD = "SimpleKettle";
    private static final String LIVE_CONNECTION =  "jdbc:mysql://db-workshop.public-dev.zuto.cloud/bootcamp6";
    private Connection connection = null;


    public List<String> connectingToDb() throws SQLException{

        List<String> listOfusersInfo = new ArrayList<>();
        try{
            connection = DriverManager.getConnection(LIVE_CONNECTION,USERNAME,PASSWORD);

            Statement statement = connection.createStatement();

            ResultSet usersInfo = statement.executeQuery("SELECT name , email, number , location FROM users WHERE email = '@!'");

            while (usersInfo.next()){
                listOfusersInfo.add(usersInfo.getString(0));
                listOfusersInfo.add(usersInfo.getString(1));
                listOfusersInfo.add(usersInfo.getString(2));
            }

            getUsersInfo(listOfusersInfo);

        }catch(Exception e){
            System.out.println("Connection to database has failed");
            e.printStackTrace();
        }finally {
            connection.close();
        }

        return listOfusersInfo;

    }

    private List<String> getUsersInfo(List<String> listOfusersInfo) {

    }
}
