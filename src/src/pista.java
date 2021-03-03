public class pista {
    int totalCompetitors;
    double totalDistance;

    public pista(int totalCompetitors, double totalDistance) {
        this.totalCompetitors = totalCompetitors;
        this.totalDistance = totalDistance;
    }

    public int getTotalCompetitors() {
        return totalCompetitors;
    }

    public void setTotalCompetitors(int totalCompetitors) {
        this.totalCompetitors = totalCompetitors;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    @Override
    public String toString() {
        return "pista{" +
                "totalCompetitors=" + totalCompetitors +
                ", totalDistance=" + totalDistance +
                '}';
    }
}
