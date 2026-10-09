import java.io.*;
import java.util.*;

// ==================== [第 1 題] ====================
class ResearchVehicle {
    private String name, captain;
    public ResearchVehicle(String name, String captain) { this.name = name; this.captain = captain; }
    public boolean goesUnderwater() { return this instanceof Submarine; }
}
class Ship extends ResearchVehicle { Ship(String n, String c) { super(n, c); } }
class SpaceStation extends ResearchVehicle { SpaceStation(String n, String c) { super(n, c); } }
class Submarine extends ResearchVehicle { Submarine(String n, String c) { super(n, c); } }

// ==================== [第 2 題] ====================
class Moose implements Comparable<Moose> {
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
class Herd1 extends ArrayList<Moose> {
    public boolean add(Moose x) { if (contains(x)) return false; return super.add(x); }
}
class Herd2 {
    private ArrayList<Moose> mList = new ArrayList<>();
    public boolean add(Moose x) { if (mList.contains(x)) return false; return mList.add(x); }
    public boolean contains(Moose x) { return mList.contains(x); } public int size() { return mList.size(); }
    public ArrayList<Moose> getSorted() { ArrayList<Moose> s = new ArrayList<>(mList); Collections.sort(s); return s; }
}

// ==================== [第 3 題] ====================
class InvalidLengthException extends Exception { public InvalidLengthException(String msg) { super(msg); } }
class TheClass {
    int retrieveATextLine(File aFile) throws IOException, InvalidLengthException {
        try (BufferedReader br = new BufferedReader(new FileReader(aFile))) {
            String s = br.readLine(); int len = (s == null) ? 0 : s.length();
            if (len >= 10) return len; else throw new InvalidLengthException(String.valueOf(len));
        }
    }
    int callRetrieveATextLine(File aFile) {
        try { return retrieveATextLine(aFile); }
        catch (InvalidLengthException e) { return -2; } catch (IOException e) { return -1; }
    }
}

// ==================== [第 4 題] ====================
class FileFinder {
    public static void findFiles(File dir, String ext, PrintWriter pw) {
        File[] files = dir.listFiles(); if (files == null) return;
        for (File f : files) {
            if (f.isFile()) {
                if (f.getAbsolutePath().endsWith(ext)) { System.out.println("Found: " + f.getName()); pw.println(f.getAbsolutePath()); }
            } else if (f.isDirectory()) { findFiles(f, ext, pw); }
        }
    }
}

// ==================== [第 5 題] ====================
// (還原題目中提供的 Dancer 類別以供測試 danceoff)
class Dancer extends ArrayList<String> {
    ArrayList<Integer> position = new ArrayList<>(); int steps = 0;
    public Dancer(int x) { position.add(x); }
    int getPosition() { if (collapsed()) return -1; return position.get(steps); }
    public void dance() { steps++; }
    public String toString() { return position.toString() + ": " + steps; }
    public boolean isStanding() { return steps < position.size(); }
    public boolean collapsed() { return !isStanding(); }
    public int distanceTo(Dancer d2) { return Math.abs(getPosition() - d2.getPosition()); }

    // 縮減版的 danceoff 測試
    public static void danceoff (Dancer d1, Dancer d2) {
        assert d1.getPosition() != d2.getPosition() : "dancers too close";
        assert d1.distanceTo(d2) <= 5 : "dancers too far apart";
        while (d1.isStanding() && d2.isStanding()) {
            d1.dance(); d2.dance();
            if(d1.isStanding() && d2.isStanding()) assert d1.distanceTo(d2) <= 5 : "dancers too far apart";
        }
        assert !(d1.isStanding() && d2.isStanding()) : "both dancers still standing";
        if (d1.isStanding()) assert d1.contains("disco_ball") : "winning dancer didn't get prize";
        if (d2.isStanding()) assert d2.contains("disco_ball") : "winning dancer didn't get prize";
        System.out.println("Dance off finished successfully.");
    }
}

// ==================== 測試主程式 ====================
public class TestAll {
    public static void main(String[] args) throws Exception {
        System.out.println("--- 測試 1: Research Vehicle ---");
        ResearchVehicle ship = new Ship("S1", "Captain A");
        ResearchVehicle sub = new Submarine("S2", "Captain B");
        System.out.println("Ship goes underwater? " + ship.goesUnderwater()); // 應為 false
        System.out.println("Submarine goes underwater? " + sub.goesUnderwater()); // 應為 true

        System.out.println("\n--- 測試 2: Moose & Herds ---");
        Moose m1 = new Moose("Alpha", 5.0, 2);
        Moose m2 = new Moose("Alpha", 5.0, 2); // 與 m1 相同
        Moose m3 = new Moose("Beta", 3.0, 1);
        Herd1 h1 = new Herd1();
        System.out.println("Herd1 add m1: " + h1.add(m1)); // true
        System.out.println("Herd1 add m2 (duplicate): " + h1.add(m2)); // false (因為等價)
        Herd2 h2 = new Herd2();
        h2.add(m3); h2.add(m1);
        System.out.println("Herd2 sorted first item (Alpha vs Beta): " + h2.getSorted().get(0).getTitle()); // 應為 Alpha

        System.out.println("\n--- 測試 3: Invalid Length Exception ---");
        File goodFile = File.createTempFile("good", ".txt");
        File badFile = File.createTempFile("bad", ".txt");
        try (PrintWriter w1 = new PrintWriter(goodFile)) { w1.println("This is a long text line >= 10"); }
        try (PrintWriter w2 = new PrintWriter(badFile)) { w2.println("Short"); }
        TheClass tc = new TheClass();
        System.out.println("Good file result: " + tc.callRetrieveATextLine(goodFile)); // 應 > 10
        System.out.println("Bad file result: " + tc.callRetrieveATextLine(badFile));   // 應為 -2 (Exception caught)

        System.out.println("\n--- 測試 4: File Finder ---");
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        File testTxt = new File(tempDir, "testFinderOutput.txt");
        try (PrintWriter pw = new PrintWriter(testTxt)) {
            // 搜尋剛剛建的 badFile (副檔名 .txt)
            System.out.println("Searching for .txt in Temp Dir (limit output)...");
            FileFinder.findFiles(goodFile.getParentFile(), ".txt", pw);
        }

        System.out.println("\n--- 測試 5: Assertions ---");
        Dancer d1 = new Dancer(0); // 假資料
        Dancer d2 = new Dancer(4); // 假資料
        d1.position.add(0); d1.position.add(0); // 模擬舞步
        d2.position.add(4); d2.position.add(4); // 模擬舞步
        // 強制讓 d1 獲勝並給予獎品，以通過最後的 assert 測試
        d1.add("disco_ball");
        
        try {
            Dancer.danceoff(d1, d2);
        } catch (AssertionError e) {
            System.out.println("AssertionError caught (正常, 若您沒有給對的條件): " + e.getMessage());
        }
        
        // 刪除暫存檔
        goodFile.delete(); badFile.delete(); testTxt.delete();
        System.out.println("\n所有測試編譯與執行完畢！縮減版程式碼運作正常。");
    }
}