package marine;

public class Marine {
    public static void main(String[] args) {
        SeaCreature[] creatures = {
            new SeaCreature("🐋 고래",  200, "우우우~"),
            new SeaCreature("🦑 오징어", 400, "....(무언의 먹물)"),
            new SeaCreature("🐙 문어",  600, "슉슉"),
            new SeaCreature("🦈 상어",  800, "...")
        };

        System.out.println("=== 바다 탐험 시작 ===");
        for (SeaCreature c : creatures) {
            c.introduce();
        }

        // 가장 깊은 곳에 사는 생물 찾기
        SeaCreature deepest = creatures[0];
        for (SeaCreature c : creatures) {
            if (c.getDepth() > deepest.getDepth()) deepest = c;
        }
        System.out.println("🏆 최심해 생물: " + deepest.getName());
    }
}
