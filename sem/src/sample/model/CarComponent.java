package sample.model;

abstract class CarComponent {
    private int price;
    private String name;
    private boolean defaultChoice;
    private Type compatibleWithType;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDefaultChoice() {
        return defaultChoice;
    }

    public void setDefaultChoice(boolean defaultChoice) {
        this.defaultChoice = defaultChoice;
    }

    public Type getCompatibleWithType() {
        return compatibleWithType;
    }

    public void setCompatibleWithType(Type compatibleWithType) {
        this.compatibleWithType = compatibleWithType;
    }
}
