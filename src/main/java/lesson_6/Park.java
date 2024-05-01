package lesson_6;

public class Park {
    public static class Attraction {
        private String name;
        private String startOfWorking;
        private String finishOfWorking;
        private int cost;

        public Attraction(String name, String startOfWorking, String finishOfWorking, int cost) {
            this.name = name;
            this.startOfWorking = startOfWorking;
            this.finishOfWorking = finishOfWorking;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", startOfWorking='" + startOfWorking + '\'' +
                    ", finifhOfWorking='" + finishOfWorking + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
}
