public class auto {
    private String piloto;
    private String color;
    double distancia;


    public auto(String piloto, String color, double distancia) {
        this.piloto = piloto;
        this.color = color;
        this.distancia = distancia;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void velocidad(int velocidad){
        double distance = velocidad*100+getDistancia();
        setDistancia(distance);
    }

    @Override
    public String toString() {
        return "auto{" +
                "piloto='" + piloto + '\'' +
                ", color='" + color + '\'' +
                ", distancia=" + distancia +
                '}';
    }
}
