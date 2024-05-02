package lesson_6;

public class Park {
    public class Attraction {
        private String name;
        private String startWork;
        private String finishWork;
        private int cost;

        public Attraction(String name, String startWork, String finishWork, int cost) {
            this.name = name;
            this.startWork = startWork;
            this.finishWork = finishWork;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", startWork ='" + startWork + '\'' +
                    ", finishWork ='" + finishWork + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
}
