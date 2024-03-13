package com.careerit.jfs.day11;

public class MovieTicketManager {

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket("Avengers", Day.TUESDAY);
        ticket.showTicketPriceDetails();
    }
}
