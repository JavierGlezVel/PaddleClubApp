package org.ulpgc.is1.control;
import org.ulpgc.is1.model.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        PaddleManager manager = new PaddleManager();

        Customer cliente1 = new Member("Carlos", 100, new NIF("45397598K"), "Almeida", new Address("Aguadulce", 40, 35004, "Las Palmas de Gran Canaria"));
        Customer cliente2 = new Customer("Pedro", "Domínguez", new NIF("12SD34TT4"));

        manager.addCustomer(cliente1);
        manager.addCustomer(cliente2);

        Court pistaRapida = new Court("Pista rapida 1", 30, CourtType.FastCourt);
        Court pistaLenta = new Court("Pista lenta 1", 20, CourtType.SlowCourt);

        manager.addCourt(pistaRapida);
        manager.addCourt(pistaLenta);

        System.out.println(manager.getCustomer(0) + "\n\n");
        System.out.println(manager.getCustomer(1) + "\n\n");
        System.out.println(manager.getCourt(1) + "\n\n");

        Reservation reservation = new Reservation(manager.getCustomer(0), manager.getCourt(1));

        reservation.addExtra(new Umpire("Alberto", "González Hernández", 150));

        manager.reserve(reservation);

        System.out.println("Existen actualmente " + manager.countCustomer() + " socios en el club. \n\n");

        manager.remove(1);

        System.out.println(manager.getCustomer(1) == null ? "No existe \n\n" : manager.getCustomer(1) + "\n\n");

        System.out.println("Existen actualmente" + manager.countCustomer() + " socios en el club. \n\n");

        for (Reservation res: manager.getReservations()){
            System.out.println(res);
        }

    }
}
