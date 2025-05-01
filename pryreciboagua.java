package pryreciboagua;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class pryreciboagua {

    public static void main(String[] args) {
        ArrayList<ReciboAgua> listaAgua = new ArrayList<>();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. agregar Recibo de Agua \n"
                    + "2. mostrar Recibos \n"
                    + "3. total de recibos \n"
                    + "4. total m³ consumidos \n"
                    + "5. valor promedio a pagar \n"
                    + "6. salir"
            ));

            switch (opcion) {
                case 1:
                    String ref = JOptionPane.showInputDialog("Digite número de referencia");
                    int estrato = Integer.parseInt(JOptionPane.showInputDialog("Digite estrato"));
                    double m3 = Double.parseDouble(JOptionPane.showInputDialog("Digite cantidad m³"));
                    double val = Double.parseDouble(JOptionPane.showInputDialog("Digite valor a pagar"));
                    listaAgua.add(new ReciboAgua(ref, estrato, m3, val));
                    break;

                case 2:
                    if (listaAgua.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "no hay recibos cargados");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (ReciboAgua r : listaAgua) {
                            sb.append(r).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,
                            "todos los recibos: " + listaAgua.size()
                    );
                    break;

                case 4:
                    double totalM3 = 0;
                    for (ReciboAgua r : listaAgua) {
                        totalM3 += r.getCantidadM3();
                    }
                    JOptionPane.showMessageDialog(null,
                            "los metros consumidos: " + totalM3
                    );
                    break;

                case 5:
                    if (listaAgua.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "no hay recibos para calcular promedio");
                    } else {
                        double suma = 0;
                        for (ReciboAgua r : listaAgua) {
                            suma += r.getValorPagar();
                        }
                        double prom = suma / listaAgua.size();
                        JOptionPane.showMessageDialog(null,
                                "valor promedio a pagar: " + prom
                        );
                    }
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "esa opcion no es valida");
            }
        } while (opcion != 6);
    }
} //fin de clase 
