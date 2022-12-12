package com.bridgelabz;

import java.util.Scanner;

public class HotelReservationMain {
    public static void main(String[] args)  {
        System.out.println("Welcome to Hotel Reservation Program");
        Scanner scanner = new Scanner(System.in);
        HotelReservationService hotelReservationService = new HotelReservationService();

        hotelReservationService.addHotel(new Hotel("Lakewood", 110, 80, 90, 80, 3));
        hotelReservationService.addHotel(new Hotel("Bridgewood", 160, 110, 60, 50, 4));
        hotelReservationService.addHotel(new Hotel("Ridgewood", 220, 100, 150, 40, 5));

    }
}
