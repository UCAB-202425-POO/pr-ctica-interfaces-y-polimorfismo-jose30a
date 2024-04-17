package ve.edu.ucab.lab;

import java.util.ArrayList;
import java.util.List;

public class ArrayAlimenticios {
    List<EsAlimento> alimentos = new ArrayList<>();

    public void agregarAlimento(EsAlimento alimento) {alimentos.add(alimento);}

    public void eliminarProducto(EsAlimento alimento) {alimentos.remove(alimento);}

    public int calcularCalorias(){
        int cal=0;
        for (EsAlimento a : alimentos) {
            cal+= a.getCalorias();
        }
    return cal;}
}
