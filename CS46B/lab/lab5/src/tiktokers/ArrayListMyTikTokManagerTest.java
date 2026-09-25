package tiktokers;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ArrayListMyTikTokManagerTest {
    @Test 
    public void basicRemove() {
        MyTikTokManager manager = new ArrayListMyTikTokManager();
        manager.put("alice", "followers", "100");

        String removed = manager.remove("alice", "followers");

        assertEquals("100", removed);
        assertNull(manager.get("alice", "followers"));
    }

    @Test
    public void removePresentEntry() {
        MyTikTokManager manager = new ArrayListMyTikTokManager();
        manager.put("alice", "followers", "100");

        String removed = manager.remove("alice", "followers");

        assertEquals("100", removed);
        assertNull(manager.get("alice", "followers"));
    }

    @Test
    public void removeNonExistentEntryEmptyManager() {
        MyTikTokManager manager = new ArrayListMyTikTokManager();

        String removed = manager.remove("alice", "followers");

        assertNull(removed);
    }

    @Test
    public void removeNonExistentEntryNonEmptyManager() {
        MyTikTokManager manager = new ArrayListMyTikTokManager();
        manager.put("alice", "followers", "100");
        manager.put("bob", "likes", "50");

        String removed = manager.remove("alice", "likes");

        assertNull(removed);
    }
}
