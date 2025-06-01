public class Dozent {
    
    class Dozent {
    private String name;
    private String bereich;
    private int personalnummer;
    
    // Konstruktor
    public Dozent(String name, String bereich, int personalnummer) {
        this.name = name;
        this.bereich = bereich;
        this.personalnummer = personalnummer;
    }
    
    // Getter-Methoden
    public String getName() {
        return name;
    }
    
    public String getBereich() {
        return bereich;
    }
    
    public int getPersonalnummer() {
        return personalnummer;
    }
    
    // Setter-Methoden
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBereich(String bereich) {
        this.bereich = bereich;
    }
    
    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }
    
    // toString-Methode
    @Override
    public String toString() {
        return "Dozent{" +
                "Name='" + name + '\'' +
                ", Bereich='" + bereich + '\'' +
                ", Personalnummer=" + personalnummer +
                '}';
    }
}


}
