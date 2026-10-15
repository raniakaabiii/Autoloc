package tn.esprit.autoloc.Services;

import java.util.List;
import tn.esprit.autoloc.domain.Reservation;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    void deleteReservation(Long id);
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(Long id);
    Reservation updateReservation(Reservation reservation);
}
