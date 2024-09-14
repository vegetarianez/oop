import java.util.ArrayList;

public class Main {//9
    public static void drawAllDeliveries(Schedule schedule){
        for (Delivery delivery1 : schedule.deliveries) {
            System.out.println("Пациенту " + delivery1.patient.name);
            System.out.println("доставить " + delivery1.drug.milligrames + " миллиграммов" );
            System.out.println("препарата " + delivery1.drug.nameOfDrug);
            System.out.println("дата: " + delivery1.date);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        schedule.deliveries = new ArrayList<>();



        Patient pat1 = new Patient(54, "Alex", "allergic to eggs");
        Drug drug1 = new Drug("aspirin", 1000);


        Delivery delivery = new Delivery("01.01.2025", pat1, drug1);

        schedule.deliveries.add(delivery);

        drawAllDeliveries(schedule);

    }
}