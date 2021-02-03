package interfaces.implementaciones;

import interfaces.IModificar;
import modelos.Factura;
import modelos.Remito;

import java.util.ArrayList;
import java.util.List;

public class ModificarImpl implements IModificar {
    @Override
    public List<Factura> modificarVendedor(List<Factura> facturas, String vendedor, String nuevoVendedor) {
        List<Factura> facturasModificadas = new ArrayList<>();

        for (Factura facturaIteradora : facturas) {
            if (facturaIteradora.getVendedor().equals(vendedor)) {
                facturaIteradora.setVendedor(nuevoVendedor);
                facturasModificadas.add(facturaIteradora);
            }
        }
        return facturasModificadas;
    }

    @Override
    public List<Factura> modificarCodigo(List<Factura> facturas, int codigo) {
        List<Factura> facturasModificadas = new ArrayList<>();

        int contador = 0;
        for (Factura facturaIteradora : facturas) {
            if (facturaIteradora.getCodigo() == 000) {
                contador ++;
                facturaIteradora.setCodigo(codigo + contador);
                facturasModificadas.add(facturaIteradora);
            }
        }
        return facturasModificadas;
    }


    @Override
    public List<Remito> modificar(List<Remito> remitos, int fechaDeEntrega, int nuevaFecha) {
        return null;
    }
}
