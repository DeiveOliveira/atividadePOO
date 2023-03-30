package br.com.carsolft.dao;

import br.com.carsolft.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarDao {

    public void createCar(Car car){

        String sql = "INSERT INTO CAR (NAME) VALUES (?)";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, car.getName());

            preparedStatement.execute();

            System.out.println("Success in connection");

            connection.close();

        }catch (Exception e){

            System.out.println("fail in connection");

        }

    }

}
