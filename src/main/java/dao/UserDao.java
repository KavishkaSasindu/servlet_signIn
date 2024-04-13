package dao;

import db.DbConnection;
import model.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    Connection conn;
    public UserDao(){
        DbConnection dbConnection = new DbConnection();
        conn = dbConnection.getConnection();
    }

    public boolean addUser(UserModel userModel){
        int insertRow = 0;

        try{
            final String INSERT_QUERY = "INSERT INTO user(name,email,password) VALUES(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(INSERT_QUERY);
            stmt.setString(1, userModel.getName());
            stmt.setString(2,userModel.getEmail());
            stmt.setString(3, userModel.getPassword());
            insertRow = stmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return insertRow>0;
    }

    public boolean logIn(String email, String password){
        try{
            final String SEARCH_QUERY = "SELECT * FROM user WHERE email=? AND password=?";
            PreparedStatement stmt = conn.prepareStatement(SEARCH_QUERY);
            stmt.setString(1,email);
            stmt.setString(2,password);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return true;
            }


        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return false;
    }

    public List<UserModel> getAllUsers(){
        List<UserModel> user = new ArrayList<>();
        try{
            final String ALL_DATA_QUERY = "SELECT * FROM user";
            PreparedStatement stmt = conn.prepareStatement(ALL_DATA_QUERY);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                UserModel userModel = new UserModel();
                userModel.setId(rs.getInt("id"));
                userModel.setName(rs.getString("name"));
                userModel.setEmail(rs.getString("email"));

                user.add(userModel);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return user;
    }
}
