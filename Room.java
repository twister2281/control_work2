abstract class Room implements Reservable {
    private int roomNumber;
    private int capacity;
    private double basePrice;
    private boolean isBooked;

    public Room(int roomNumber, int capacity, double basePrice) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.basePrice = basePrice;
        this.isBooked = false;
    }


    public abstract double calculateTotalCost(int nights);
    public abstract String getRoomInfo();

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }


    @Override
    public boolean bookRoom() {
        if (!isBooked) {
            isBooked = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean cancelBooking() {
        if (isBooked) {
            isBooked = false;
            return true;
        }
        return false;
    }
}