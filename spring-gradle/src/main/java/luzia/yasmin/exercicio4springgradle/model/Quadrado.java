package luzia.yasmin.exercicio4springgradle.model;

public class Quadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return Math.pow(this.lado, 2);
    }

    public double calcularPerimetro(){
        return this.lado * 4;
    }

    @Override
    public String toString() {
        return "\nQuadrado: "
                + "\nLado: " + this.lado
                + "\nArea: " + this.calcularArea()
                + "\nPerimetro: " + this.calcularPerimetro();
    }
}
