package Models;

import java.util.Objects;


public class Reservations {
    private String name;
    private String reservedBook;
    private int reservationTime;

    public Reservations(String name, String reservedBook, int reservationTime) {
        this.name = name;
        this.reservedBook = reservedBook;
        this.reservationTime = reservationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReservedBook() {
        return reservedBook;
    }

    public void setReservedBook(String reservedBook) {
        this.reservedBook = reservedBook;
    }

    public int getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(int reservationTime) {
        this.reservationTime = reservationTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.reservedBook);
        hash = 23 * hash + this.reservationTime;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservations other = (Reservations) obj;
        if (this.reservationTime != other.reservationTime) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.reservedBook, other.reservedBook);
    }

    @Override
    public String toString() {
        return "Reservations{" + "name=" + name + ", reservedBook=" + reservedBook + ", reservationTime=" + reservationTime + '}';
    }
    
    
}
