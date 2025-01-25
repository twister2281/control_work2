class DoubleRoom extends Room {
    private boolean hasExtraBed;
    private boolean hasBalcony;

    public DoubleRoom(int roomNumber, double basePrice, boolean hasExtraBed, boolean hasBalcony) {
        super(roomNumber, 2, basePrice);
        this.hasExtraBed = hasExtraBed;
        this.hasBalcony = hasBalcony;
    }

    public boolean hasExtraBed() {
        return hasExtraBed;
    }

    public void setHasExtraBed(boolean hasExtraBed) {
        this.hasExtraBed = hasExtraBed;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }


    public String enjoyView() {
        return hasBalcony ? "Наслаждайтесь видом с балкона" : "Балкона нема смотрите в стену :( .";
    }

    @Override
    public double calculateTotalCost(int nights) {
        double extraCost = hasExtraBed ? 20.0 : 0.0; // Доплата за дополнительную кровать
        return (getBasePrice() + extraCost) * nights;
    }

    @Override
    public String getRoomInfo() {
        return "DoubleRoom #" + getRoomNumber() +
                " | Price: $" + getBasePrice() +
                " | ExtraBed: " + (hasExtraBed ? "Да" : "Нет") +
                " | Balcony: " + (hasBalcony ? "Да" : "Нет");
    }
}