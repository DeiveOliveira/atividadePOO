package br.com.carsolft;

import br.com.carsolft.dao.CarDao;
import br.com.carsolft.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/senac")

public class CreateCarServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String carName = request.getParameter("comentario");
            Car car =new Car();
            car.setName(carName);

            CarDao carDao =  new CarDao();
            carDao.createCar(car);

        System.out.println(carName);

        request.getRequestDispatcher("Sobre.html").forward(request, response);

    }
}
