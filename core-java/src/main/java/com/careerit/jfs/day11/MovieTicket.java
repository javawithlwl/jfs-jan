package com.careerit.jfs.day11;

public class MovieTicket {

        private String movieName;
        private Day day;

        private double actualPrice=200;
        private double discountPrice;
        private double extraPrice;
        private double finalPrice;
        public MovieTicket(String movieName, Day day) {
            this.movieName = movieName;
            this.day = day;
        }

        public void showTicketPriceDetails(){
            System.out.println("You booked movie : "+movieName+" on "+day);
            switch (day){
                case MONDAY:
                    discountPrice = actualPrice * 0.10;
                    finalPrice = actualPrice - discountPrice;
                    System.out.println("Actual price : "+actualPrice);
                    System.out.println("Discount price : "+discountPrice);
                    System.out.println("Final price : "+finalPrice);
                    System.out.println("You saved : "+discountPrice);
                    break;
                case TUESDAY:
                    discountPrice = actualPrice * 0.20;
                    finalPrice = actualPrice - discountPrice;
                    System.out.println("Actual price : "+actualPrice);
                    System.out.println("Discount price : "+discountPrice);
                    System.out.println("Final price : "+finalPrice);
                    System.out.println("You saved : "+discountPrice);
                    break;
                case WEDNESDAY:
                case THURSDAY:
                    discountPrice = actualPrice * 0.05;
                    finalPrice = actualPrice - discountPrice;
                    System.out.println("Actual price : "+actualPrice);
                    System.out.println("Discount price : "+discountPrice);
                    System.out.println("Final price : "+finalPrice);
                    System.out.println("You saved : "+discountPrice);
                    break;
                case FRIDAY:
                case SATURDAY:
                case SUNDAY:
                    extraPrice = actualPrice * 0.10;
                    finalPrice = actualPrice + extraPrice;
                    System.out.println("Actual price : "+actualPrice);
                    System.out.println("Extra price : "+extraPrice);
                    System.out.println("Final price : "+finalPrice);
                    System.out.println("You paid extra : "+extraPrice);
                    break;
                default:
                    System.out.println("Invalid day");
            }
        }

        // if day is TUESDAY then 20% discount
        // if day is Monday then 10% discount
        // if day is Wednesday, Thursday then 5% discount
        // if day is Friday,Saturday and Sunday then 10% extra



    // You booked movie : Tenet on TUESDAY
    // Actual price : 200
    // Discount price : 40
    // Final price : 160
    // You saved : 40

    // You booked movie : Tenet on Sunday
    // Actual price : 200
    // Extra price : 20
    // Final price : 220
    // You paid extra : 20
}
