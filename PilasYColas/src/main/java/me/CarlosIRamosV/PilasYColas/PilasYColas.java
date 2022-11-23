package me.CarlosIRamosV.PilasYColas;

/**
 * @author Carlos Ramos
 * @version 1.0
 */
@SuppressWarnings({"unused", "DuplicatedCode"})
public class PilasYColas {
    private int pila[];
    private int cola[];
    private byte tam, numElemP, numElemC;

    public PilasYColas() {
        tam=5;
        pila=new int[tam];
        cola=new int[tam];
        numElemP=0;
        numElemC=0;
    }

    public PilasYColas(byte tam) {
        this.tam=tam;
        pila=new int[tam];
        cola=new int[tam];
        numElemP=0;
        numElemC=0;
    }

    public boolean agregarPila(int dato){
        if(numElemP<tam){
            if (numElemP>0){
                for (int i = numElemP; i > 0; i--)
                    pila[i]=pila[i-1];
                pila[0]=dato;
            }
            pila[0]=dato;
            numElemP++;
            return true;
        }
        return false;
    }

    public boolean eliminarPila(){
        if (numElemP>0) {
            for (int i = 0; i < numElemP-1; i++) {
                pila[i]=pila[i+1];
            }
            numElemP--;
            return true;
        }
        return false;
    }

    public boolean agregarCola(int dato){
        if(numElemC<tam){
            if (numElemC>0){
                for (int i = numElemC; i > 0; i--)
                    cola[i]=cola[i-1];
                cola[0]=dato;
            }
            cola[0]=dato;
            numElemC++;
            return true;
        }
        return false;
    }

    public boolean eliminarCola(){
        if(numElemC>0){
            numElemC--;
            return true;
        }else
            return false;
    }

    public String getPila(){
        StringBuilder auxiliar= new StringBuilder();
        for (int i = 0; i < numElemP; i++)
            auxiliar.append(" ").append(pila[i]);
        return auxiliar.toString();
    }

    public String getCola(){
        StringBuilder auxiliar= new StringBuilder();
        for (int i = 0; i < numElemC; i++)
            auxiliar.append(" ").append(cola[i]);
        return auxiliar.toString();
    }
}