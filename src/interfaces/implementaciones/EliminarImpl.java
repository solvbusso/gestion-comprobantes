package interfaces.implementaciones;

import interfaces.IEliminar;
import modelos.Factura;
import modelos.Remito;

import java.util.ArrayList;
import java.util.List;

public class EliminarImpl implements IEliminar {
    @Override
    public Factura eliminarFacturasXCodigo(List<Factura> facturas, int codigo) {
        Factura facturaAEliminar = null;

        for (Factura i : facturas) {
            if (facturaAEliminar.getCodigo() == codigo) {
                facturaAEliminar = i;
            }
        }
        return facturaAEliminar;
    }

    @Override
    public List<Remito> eliminarRemitosXFirma(List<Remito> remitos, boolean firma) {
        List<Remito> remitosAEliminar = new ArrayList<>();

        for (Remito i : remitos) {
            if (!i.isEstaFirmado()) {
                remitosAEliminar.add(i);
            }
        }
        return remitosAEliminar;
    }
}
