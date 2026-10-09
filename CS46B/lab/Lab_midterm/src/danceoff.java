import java.util.*;

class Dancer extends ArrayList<String> {
    ArrayList<Integer> position = new ArrayList<>(); int steps = 0;
    public Dancer(int x) { position.add(x); }
    int getPosition() { if (collapsed()) return -1; return position.get(steps); }
    public void dance() { steps++; }
    public String toString() { return position.toString() + ": " + steps; }
    public boolean isStanding() { return steps < position.size(); }
    public boolean collapsed() { return !isStanding(); } // 修正原題目的 lisStanding() 筆誤
    public int distanceTo(Dancer d2) { return Math.abs(getPosition() - d2.getPosition()); }

    private static void danceoff(Dancer d1, Dancer d2) {
        System.out.println("dancer 1: " + d1); System.out.println("dancer 2: " + d2);
        System.out.println("distance: " + d1.distanceTo(d2));
        
        assert d1.getPosition() != d2.getPosition() : "dancers too close"; // Step 2
        assert d1.distanceTo(d2) <= 5 : "dancers too far apart"; // Step 3
        
        while (d1.isStanding() && d2.isStanding()) {
            d1.dance(); d2.dance();
            assert d1.distanceTo(d2) <= 5 : "dancers too far apart"; // Step 4
        }
        
        assert !(d1.isStanding() && d2.isStanding()) : "both dancers still standing"; // Step 5
        if (d1.isStanding()) assert d1.contains("disco_ball") : "winning dancer didn't get prize"; // Step 6
        if (d2.isStanding()) assert d2.contains("disco_ball") : "winning dancer didn't get prize"; // Step 7
    }

    public static void main(String[] args) {
        Dancer dancer1 = new Dancer(0); Dancer dancer2 = new Dancer(1);
        if (dancer1.distanceTo(dancer2) <= 5) { danceoff(dancer1, dancer2); }
    }
}