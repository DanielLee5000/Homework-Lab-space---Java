package tiktokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ArrayListMyTikTokManagerTest {
    private MyTikTokManager manager;
    private MyTikTokManager topTen;

    @Before
    public void setUp() {
        manager = new ArrayListMyTikTokManager();
        topTen = new ArrayListMyTikTokManager();
        topTen.load("src/tiktokers/Top10TikTokers.txt");
    }

    @Test
    public void topTenContainsBurak() {
        assertNotNull(topTen.get("@cznburak", "Followers"));
    }

    @Test
    public void basicRemove() {
        manager.put("alice", "followers", "100");

        String removed = manager.remove("alice", "followers");

        assertEquals("100", removed);
        assertNull(manager.get("alice", "followers"));
    }

    @Test
    public void removePresentEntry() {
        manager.put("alice", "followers", "100");

        String removed = manager.remove("alice", "followers");

        assertEquals("100", removed);
        assertNull(manager.get("alice", "followers"));
    }

    @Test
    public void removeNonExistentEntryEmptyManager() {
        String removed = manager.remove("alice", "followers");

        assertNull(removed);
    }

    @Test
    public void removeNonExistentEntryNonEmptyManager() {
        manager.put("alice", "followers", "100");
        manager.put("bob", "likes", "50");

        String removed = manager.remove("alice", "likes");

        assertNull(removed);
    }
}
