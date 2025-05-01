package pryreciboagua;

public class ReciboAgua {

    private String nroReferencia;
    private int estrato;
    private double cantidadM3;
    private double valorPagar;

    public ReciboAgua(String nroReferencia, int estrato, double cantidadM3, double valorPagar) {
        this.nroReferencia = nroReferencia;
        this.estrato = estrato;
        this.cantidadM3 = cantidadM3;
        this.valorPagar = valorPagar;
    }

    public double getCantidadM3() {
        return cantidadM3;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    @Override
    public String toString() {
        return nroReferencia
                + " estrato " + estrato
                + " m³ " + cantidadM3
                + " valor " + valorPagar;
    }
}
