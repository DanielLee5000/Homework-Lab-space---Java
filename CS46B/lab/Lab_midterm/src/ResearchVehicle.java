class ResearchVehicle {
    private String name, captain;
    public ResearchVehicle(String name, String captain) { this.name = name; this.captain = captain; }
    public boolean goesUnderwater() { return this instanceof Submarine; }
}
class Ship extends ResearchVehicle { Ship(String n, String c) { super(n, c); } }
class SpaceStation extends ResearchVehicle { SpaceStation(String n, String c) { super(n, c); } }
class Submarine extends ResearchVehicle { Submarine(String n, String c) { super(n, c); } }
