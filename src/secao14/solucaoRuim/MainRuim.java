package secao14.solucaoRuim;

import secao14.solucaoRuim.ReservationRuim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainRuim {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (DD/MM/YYYY)");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-in date (DD/MM/YYYY)");

        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check out date must be after check-in date: ");
        }
        else{
            ReservationRuim reservation = new ReservationRuim(number,checkIn,checkOut);
            System.out.println("Reservation: "+ reservation);

            System.out.print("Room number: ");
            number = sc.nextInt();
            System.out.print("Check-in date (DD/MM/YYYY)");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-in date (DD/MM/YYYY)");
            checkOut = sdf.parse(sc.next());

            String error = reservation.updateDates(checkIn,checkOut);
            if (error != null){
                System.out.println("Error in reservation: "+ error);
            }
            else {
                System.out.println("Reservation "+ reservation);
            }
        }

        sc.close();
    }
}
