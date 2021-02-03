package interfaces.implementaciones;
import interfaces.IPoblar;
import modelos.Factura;
import modelos.Remito;
import java.util.ArrayList;
import java.util.List;

public class PoblarImpl implements IPoblar {

    @Override
    public List<Factura> crearFacturas() {
        List<Factura> facturas = new ArrayList<>();

        Factura factura = new Factura (1,000, "Alto Parque",'C',20000,"Javier", true);
        Factura factura2 = new Factura (2,000, "Proaco",'A',365,"Javier", true);
        Factura factura3 = new Factura (1,000, "Edisur",'B',78220,"Javier", true);
        Factura factura4 = new Factura (1,000, "Alto Parque",'A',54300,"Javier", true);
        Factura factura5 = new Factura (2,005, "EPEC",'A',900,"Javier", true);
        Factura factura6 = new Factura (1,006, "Piobau",'C',7890,"Javier", true);

        facturas.add(factura);
        facturas.add(factura2);
        facturas.add(factura3);
        facturas.add(factura4);
        facturas.add(factura5);
        facturas.add(factura6);

        return facturas;
    }


    @Override
    public List<Remito> crearRemitos() {
        List<Remito> remitos = new ArrayList<>();

        Remito remito = new Remito(1,001,"Proaco",0112,true);
        Remito remito2 = new Remito(2,002,"Proaco",0212,true);
        Remito remito3 = new Remito(1,003,"Alto Parque",0112,false);
        Remito remito4 = new Remito(1,004,"EPEC",0412,true);
        Remito remito5 = new Remito(2,005,"Proaco",0112,false);
        Remito remito6 = new Remito(1,006,"Proaco",0612,true);

        remitos.add(remito);
        remitos.add(remito2);
        remitos.add(remito3);
        remitos.add(remito4);
        remitos.add(remito5);
        remitos.add(remito6);

        return remitos;
    }


}
