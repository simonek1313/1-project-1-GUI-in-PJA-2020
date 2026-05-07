package pl.pja.grzesym;
/**
Klasa definiujaca wlasny wyjatek, ktory wskazuje na przepelnienie pomieszczenia
 */
public class TooManyThingsException extends Exception {

    public TooManyThingsException(){
        super("Remove some old items to insert a new item");
    }

}
