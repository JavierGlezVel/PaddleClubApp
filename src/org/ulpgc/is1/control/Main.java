package org.ulpgc.is1.control;
import org.ulpgc.is1.model.*;
public class Main {
    public static void main(String[] args) {
        PaddleManager controlador = new PaddleManager();
        init(controlador);

        //Imprimimos por pantalla los clientes y los miembros del club.
        System.out.println(controlador.getCustomer(0));
        System.out.println(controlador.getCustomer(1));
        System.out.println("Existen actualmente " + controlador.countCustomer() + " socio/os en el club. \n");

        //Imprimimos por pantalla la pista seleccionada
        System.out.println(controlador.getCourt(1) + "\n");

        //Creamos una reserva añadiendo un árbitro.
        Reservation reservation = new Reservation(controlador.getCustomer(0), controlador.getCourt(1));
        reservation.addExtra(new Umpire("Alberto", "González Hernández", 150));
        controlador.reserve(reservation);

        //Eliminamos un miembro del club y lo imprimimos.
        controlador.remove(1);
        System.out.println("Miembro eliminado. \n");

        //Impreimimos si existe o no ese miembro y cuantos quedan en el club.
        System.out.println(controlador.getCustomer(1) == null ? "No existe" : controlador.getCustomer(1));
        System.out.println("Existen actualmente " + controlador.countCustomer() + " socio/os en el club. \n\n");

        for (Reservation res: controlador.getReservations()){
            System.out.println(res);
        }

    }

    public static void init (PaddleManager manager) {
        //Creamos un miembro del club con NIF válido.
        Customer cliente1 = new Member("Javier", "González", new NIF("45615233T"), 100, new Address("Aguadulce", 40, 35004, "Las Palmas de Gran Canaria"));
        //Creamos un cliente con NIF no válido.
        Customer cliente2 = new Customer("Martina", "Giraudo", new NIF("12SD34TT4"));

        //Los añadimos como clientes para una reserva,
        manager.addCustomer(cliente1);
        manager.addCustomer(cliente2);

        //Creamos las pistas con sus respectivos precios
        Court pistaRapida = new Court("Pista rapida", 30, CourtType.FastCourt);
        Court pistaLenta = new Court("Pista lenta", 20, CourtType.SlowCourt);

        //Las añadimos.
        manager.addCourt(pistaRapida);
        manager.addCourt(pistaLenta);
    }
}
