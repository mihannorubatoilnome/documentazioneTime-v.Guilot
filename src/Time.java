/**
 * La classe rappresenta e gestisce dati di tipo temporale
 * @author Edmard Guilot
 */

public class Time {

    /**
     * Numero di secondi dell'oggetto tempo
     */
    protected int secondi;

    /**
     * Numero di minuti dell'oggetto tempo
     */
    protected int minuti;

    /**
     * Numero di ore dell'oggetto tempo
     */
    protected int ore;

    /**
     * Costruttore di un oggetto Time dato come parametro il numero di secondi
     * @param secondi Numero di secondi da assegnare all'oggetto
     */
    public Time(int secondi){
        this.secondi = secondi;
    }

    /**
     * Costruttore di un oggetto Time dato come parametro il numero di ore, minuti e secondi
     * @param ore Numero di ore da assegnare all'oggetto
     * @param minuti Numero di minuti da assegnare all'oggetto
     * @param secondi Numero di secondi da assegnare all'oggetto
     */
    public Time(int ore, int minuti, int secondi) {
        this.secondi = secondi;
        this.minuti = minuti;
        this.ore = ore;
    }

    /**
     * Metodo che restituisce il numero di secondi
     * @return Il numero di secondi dell'oggetto
     */
    public int getSecondi() {
        return secondi;
    }

    /**
     * Metodo che assegna il numero di secondi
     * @param secondi Numero di secondi da assegnare
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    /**
     * Metodo che restituisce il numero di minuti
     * @return Il numero di minuti dell'oggetto
     */
    public int getMinuti() {
        return minuti;
    }

    /**
     * Metodo che assegna il numero di minuti
     * @param minuti Numero di minuti da assegnare
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    /**
     * Metodo che restituisce il numero di ore
     * @return Il numero di ore dell'oggetto
     */
    public int getOre() {
        return ore;
    }

    /**
     * Metodo che assegna il numero di ore
     * @param ore Numero di ore da assegnare
     */
    public void setOre(int ore) {
        this.ore = ore;
    }

    public void addSecondi(int secondi){
        this.secondi = this.secondi + secondi;
    }

    /**
     * Metodo che converte i secondi totali in minuti e ore
     */
    public void normalize(){
        if(secondi >= 60){
            minuti = secondi / 60;
            secondi = secondi - minuti * 60;
        }
        if(minuti >= 60){
            ore = minuti / 60;
            minuti = minuti - ore * 60;
        }
    }

    /**
     * Metodo che esprime le ore, i minuti e i secondi dell'oggetto Time in secondi
     * @return Il numero totale di secondi
     */
    public int convertiSecondi(){
        return (+ore * 3600 + minuti * 60 + secondi);
    }

    /**
     * Metodo che restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Time [ ore : minuti : secondi ]
     */
    @Override
    public String toString() {
        return "\nTime [ " + this.ore + " : " + this.minuti + " : " + secondi + " ]"+
        "\n----------------------------------------------------------------------";
    }

    
}
