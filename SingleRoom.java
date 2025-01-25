class SingleRoom extends Room {
    private boolean hasMiniBar;
    private boolean hasTV;

    public SingleRoom(int roomNumber, double basePrice, boolean hasMiniBar, boolean hasTV) {
        super(roomNumber, 1, basePrice);
        this.hasMiniBar = hasMiniBar;
        this.hasTV = hasTV;
    }

    public boolean hasMiniBar() {
        return hasMiniBar;
    }

    public void setHasMiniBar(boolean hasMiniBar) {
        this.hasMiniBar = hasMiniBar;
    }

    public boolean hasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public String enjoyMiniBar() {
        return hasMiniBar ? "Наслаждайся мини-баром" : "У комнаты нет мини-бара соре.";
    }

    @Override
    public double calculateTotalCost(int nights) {
        return getBasePrice() * nights;
    }

    @Override
    public String getRoomInfo() {
        return "SingleRoom #" + getRoomNumber() +
                " | Price: $" + getBasePrice() +
                " | MiniBar: " + (hasMiniBar ? "Да" : "нет") +
                " | TV: " + (hasTV ? "да" : "нет");
    }
}
