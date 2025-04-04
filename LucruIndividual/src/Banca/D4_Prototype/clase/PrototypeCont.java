package Banca.D4_Prototype.clase;

public interface PrototypeCont {
    PrototypeCont clone();
    void setNumeClient(String numeClient);
    void setIBAN(String IBAN);
    void setValuta(Valuta valuta);
    void setSold(float sold);
}
