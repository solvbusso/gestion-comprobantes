package interfaces.implementaciones;

import interfaces.IBuscar;
import modelos.Factura;
import modelos.Remito;

import java.util.ArrayList;
import java.util.List;

public class BuscarImpl implements IBuscar {


    @Override
    public List<Factura> buscarXMonto(List<Factura> facturas, int monto) {
        List<Factura> facturasMayoresA = new ArrayList<>();

        for (Factura facturaIteradora : facturas) {
            if (facturaIteradora.getMonto() > monto) {
                facturasMayoresA.add(facturaIteradora);
            }
        }
        return facturasMayoresA;
    }

    @Override
    public List<Factura> buscarXCliete(List<Factura> facturas, String cliente) {
        List<Factura> facturasPorCliente = new ArrayList<>();

        for (Factura facturaIteradora : facturas) {
            if (facturaIteradora.getCliente() != null) {
                if (facturaIteradora.getCliente().equals(cliente)) {
                    facturasPorCliente.add(facturaIteradora);
                }
            }
        }
        return facturasPorCliente;
    }

    @Override
    public List<Remito> buscarXFirma(List<Remito> remitos, boolean estaFirmado) {
        List<Remito> remitosFirmados = new ArrayList<>();

        for (Remito remitoIterador : remitos) {
            if (remitoIterador.isEstaFirmado()) {
                remitosFirmados.add(remitoIterador);
            }
        }
        return remitosFirmados;
    }
}
