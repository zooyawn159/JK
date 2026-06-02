package marine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarineTest {

    @Test
    public void testSeaCreatureDepth() {
        SeaCreature shark = new SeaCreature("🦈 상어", 800, "...");
        assertEquals(800, shark.getDepth());
    }

    @Test
    public void testSeaCreatureName() {
        SeaCreature whale = new SeaCreature("🐋 고래", 200, "우우우~");
        assertEquals("🐋 고래", whale.getName());
    }

    @Test
    public void testDeepestCreature() {
        SeaCreature[] creatures = {
            new SeaCreature("🐋 고래",  200, "우우우~"),
            new SeaCreature("🦈 상어",  800, "...")
        };
        SeaCreature deepest = creatures[0];
        for (SeaCreature c : creatures) {
            if (c.getDepth() > deepest.getDepth()) deepest = c;
        }
        assertEquals("🦈 상어", deepest.getName());
    }
}