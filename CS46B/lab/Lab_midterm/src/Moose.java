import java.util.*;
public class Moose implements Comparable<Moose> {
    private String title; private double age; private float numberOfSisters;
    public Moose(String t, double a, float n) { title=t; age=a; numberOfSisters=n; }
    public String getTitle() { return title; } public double getAge() { return age; } public float getNumberOfSisters() { return numberOfSisters; }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moose m = (Moose) obj;
        return Double.compare(m.age, age) == 0 && Float.compare(m.numberOfSisters, numberOfSisters) == 0 && Objects.equals(title, m.title);
    }
    public int hashCode() { return Math.round((float)age + numberOfSisters); }
    public int compareTo(Moose o) {
        int c1 = title.compareTo(o.title); if (c1 != 0) return c1;
        int c2 = Double.compare(age, o.age); if (c2 != 0) return c2;
        return Float.compare(numberOfSisters, o.numberOfSisters);
    }
}
class Herd1 extends ArrayList<Moose> { // Is-A
    public boolean add(Moose x) { if (contains(x)) return false; return super.add(x); }
}
class Herd2 { // Has-A
    private ArrayList<Moose> mList = new ArrayList<>();
    public boolean add(Moose x) { if (mList.contains(x)) return false; return mList.add(x); }
    public boolean contains(Moose x) { return mList.contains(x); } public int size() { return mList.size(); }
    public ArrayList<Moose> getSorted() { ArrayList<Moose> s = new ArrayList<>(mList); Collections.sort(s); return s; }
}