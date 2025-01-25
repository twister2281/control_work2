public class Main {
    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom(101, 50.0, true, true);
        DoubleRoom doubleRoom = new DoubleRoom(202, 100.0, true, false);

        System.out.println(singleRoom.getRoomInfo());
        System.out.println(doubleRoom.getRoomInfo());


        System.out.println("Бронирование однушки: " + singleRoom.bookRoom());
        System.out.println("Бронирование двушки: " + doubleRoom.cancelBooking());


        System.out.println(singleRoom.enjoyMiniBar());
        System.out.println(doubleRoom.enjoyView());

        System.out.println("Стоимость за 3 ночи в однушке: $" + singleRoom.calculateTotalCost(3));
        System.out.println("Стоимость за 2 ночи в двушке: $" + doubleRoom.calculateTotalCost(2));
    }
}