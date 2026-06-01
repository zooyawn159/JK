package marine;

public class SeaCreature {
    private String name;
    private int depth;
    private String sound;

    public SeaCreature(String name, int depth, String sound) {
        this.name  = name;
        this.depth = depth;
        this.sound = sound;
    }

    public void introduce() {
        System.out.println(name + " | 수심 " + depth + "m | " + sound);
    }

    public int getDepth() { return depth; }
    public String getName() { return name; }
}
