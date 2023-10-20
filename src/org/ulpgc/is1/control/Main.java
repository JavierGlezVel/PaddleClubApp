package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

public class Main {
    public static void main(String[] args) {

        PaddleManager manager = new PaddleManager();

        Customer cliente1 = new Member("Carlos", "Doe", new NIF("45397598K"), 100, new Address("123 Main St.", 20, 2, "35010"));
        Customer invalidNIFCustomer = new Customer("Alice", "Johnson", new NIF("12SD34TT4"));

        manager.addCustomer(cliente1);
        manager.addCustomer(invalidNIFCustomer);

        Court fastCourt = new Court("Fast Court 1", 20, CourtType.FAST_COURT);
        Court slowCourt = new Court("Slow Court 1", 15, CourtType.SLOW_COURT);

        manager.addCourt(fastCourt);
        manager.addCourt(slowCourt);

        System.out.println(manager.getCustomer(0) + "\n\n");
        System.out.println(manager.getCustomer(1) + "\n\n");
        System.out.println(manager.getCourt(1) + "\n\n");

        Reservation reservation = new Reservation(manager.getCustomer(0), manager.getCourt(1));

        reservation.addExtra(new Umpire("Sergio", "Acosta", 100));

        manager.reserve(reservation);

        System.out.println("There is " + manager.countCustomer() + " members in the club. \n\n");

        manager.remove(1);

        System.out.println(manager.getCustomer(1) == null ? "Not exist \n\n" : manager.getCustomer(1) + "\n\n");

        System.out.println("There is " + manager.countCustomer() + " members in the club. \n\n");

        for (Reservation res: manager.getReservations()){
            System.out.println(res);
        }

    }
}
