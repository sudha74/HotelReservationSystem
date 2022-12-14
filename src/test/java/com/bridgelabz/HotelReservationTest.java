package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    static HotelReservationService hotelReservationService;

    @BeforeAll
    static void initialize() {
        hotelReservationService = new HotelReservationService();
        hotelReservationService.addHotel(new Hotel("Lakewood", 110, 80, 90, 80, 3));
        hotelReservationService.addHotel(new Hotel("Bridgewood", 160, 110, 60, 50, 4));
        hotelReservationService.addHotel(new Hotel("Ridgewood", 220, 100, 150, 40, 5));
    }

    @Test
    void givenHotel_ShouldBe_AddedToHotelList() {
        boolean result = hotelReservationService.addHotel(new Hotel("Lakewood", 110, 80, 90, 80, 3));
        Assertions.assertTrue(result);
    }

}
