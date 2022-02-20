package logic;

import dao.GeneralDao;
import dao.PassengerDao;
import dao.impl.PassengerDaoImpl;
import entity.Passenger;
import lombok.Data;

import java.util.Date;

@Data
public class Main {
    private static PassengerDao passengerDao = new PassengerDaoImpl();
    public static void main(String[] args) {

        Passenger passenger =  Passenger.builder()
                .id(11)
                .passport("AA1222")
                .surname("Petrenko")
                .name("Ivan")
                .ticketId(1)
                .build();

        passengerDao.add(passenger);
        passenger.setBirthdate(new Date());
        passengerDao.update(passenger);
      System.out.println(passengerDao.get(1));
        passengerDao.delete(passenger);

       System.out.println(passengerDao.getAll());


    }
}
