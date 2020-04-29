package sample.model;

public class Car {
    private Type type;
    private Motor motor;
    private Rim rim;
    private Upholstery upholstery;
    private StearingWheel stearingWheel;
    private Spoiler spoiler;
    private Colour colour;
    private GpsNavigation gpsNavigation;
    private AirCondition airCondition;
    private SunRoof sunRoof;
    private TowHitch towHitch;

    public void setMotor(Motor motor) {
        if (motor.getCompatibleWithType() == this.type) {
            this.motor = motor;

        } else
            throw new IllegalArgumentException("Car of" + type + "is not compatible with Motor " + motor.getName() + ". (only compatible with " + motor.getCompatibleWithType());

    }

    public void setRim(Rim rim) {
        this.rim = rim;
    }

    public void setUpholstery(Upholstery upholstery){
        this.upholstery = upholstery;
    }

    public void setStearingWheel(StearingWheel stearingWheel){
        this.stearingWheel = stearingWheel;
    }

    public void setSpoiler(Spoiler spoiler){
        this.spoiler = spoiler;
    }

    public void setColour(Colour colour){
        this.colour = colour;
    }

    public void setGpsNavigation(GpsNavigation gpsNavigation){
        this.gpsNavigation = gpsNavigation;
    }

    public void setAirCondition(AirCondition airCondition){
        this.airCondition = airCondition;
    }

    public void setSunRoof(SunRoof sunRoof){
        this.sunRoof = sunRoof;
    }

    public void setTowHitch(TowHitch towHitch){
        this.towHitch = towHitch;
    }

    public int totalPrice() {
        return motor.getPrice() + rim.getPrice() + upholstery.getPrice() + stearingWheel.getPrice()
                + spoiler.getPrice() + colour.getPrice() + gpsNavigation.getPrice() + airCondition.getPrice()
                + sunRoof.getPrice() + towHitch.getPrice();

    }

}
