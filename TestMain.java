import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        // Leer y guardar usuarios e inmuebles
        Inmobiliaria via = new Inmobiliaria();

        ModeloInmoviliaria modelo = new ModeloInmoviliaria(via);

        // controlador (se activa con los eventos de la vista)
        Personal p1 = new Personal("mahm","aaa", modelo.getInmobiliaria());
        Vendedor v1 = new Vendedor( "nvc", modelo.getInmobiliaria());

        // alta de personal
        modelo.getInmobiliaria().altaPersonal(p1);

        // alta de inmueble
        p1.altaInmueble("Urbano", "Puebla", 100.3f, 100000, 4, 2, "bonito", "foto", 99999, true);

        // logearse en el programa
        System.out.println(modelo.getInmobiliaria().logearse("mahm", "aaaa"));

        // dar de baja a personal (?)
        modelo.getInmobiliaria().bajaPersonal(p1);

        // alta de vendedores
        modelo.getInmobiliaria().altaVendedor(v1);

        ArrayList<Float> pagos = new ArrayList<Float>();
        pagos = v1.cotizarPagos(80000, 20000, pagos);

        System.out.println("");

        // baja de inmueble
        p1.bajaInmueble(0);
    }
}