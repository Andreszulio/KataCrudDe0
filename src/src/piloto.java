public class piloto {
    String namePilot;
    int pilotID;
    int age;
    double totalDistance;
    int championsWon;

    public piloto(String namePilot, int pilotID, int age, double totalDistance, int championsWon) {
        this.namePilot = namePilot;
        this.pilotID = pilotID;
        this.age = age;
        this.totalDistance = totalDistance;
        this.championsWon = championsWon;
    }

    public String getNamePilot() {
        return namePilot;
    }

    public void setNamePilot(String namePilot) {
        this.namePilot = namePilot;
    }

    public int getPilotID() {
        return pilotID;
    }

    public void setPilotID(int pilotID) {
        this.pilotID = pilotID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public int getChampionsWon() {
        return championsWon;
    }

    public void setChampionsWon(int championsWon) {
        this.championsWon = championsWon;
    }

    @Override
    public String toString() {
        return "piloto{" +
                "namePilot='" + namePilot + '\'' +
                ", pilotID=" + pilotID +
                ", age=" + age +
                ", totalDistance=" + totalDistance +
                ", championsWon=" + championsWon +
                '}';
    }
}
