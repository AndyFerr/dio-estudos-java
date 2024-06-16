package estudoInterface;

import estudoInterface.interfaces.Impressora;
import estudoInterface.Equipamentos.EquipamentoMultifuncional;
import estudoInterface.interfaces.Copiadora;
import estudoInterface.interfaces.Digitalzadora;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();


        // Como o euqipamento multifuncional também é todos esses 3, pode-se fazer assim:
        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalzadora digitalzadora = em;

        impressora.imprimir();
        copiadora.copiar();
        digitalzadora.digitalizar();
    }
}
