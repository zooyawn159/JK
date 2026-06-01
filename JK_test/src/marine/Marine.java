package marine;

public class Marine {
    public static void main(String[] args) {
        String[] creatures = {"🐋 고래", "🦑 오징어", "🐙 문어", "🦈 상어"};
        int depth = 0;

        System.out.println("=== 바다 탐험 시작 ===");
        for (String c : creatures) {
            depth += 200;
            System.out.println("수심 " + depth + "m: " + c + " 발견!");
        }
        System.out.println("🌊 탐험 완료. 총 수심: " + depth + "m");
    }
}
