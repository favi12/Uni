public class Hochschule {

    private String name;
    private Student[] studenten;
    private Dozent[] dozenten;
    private int anzahlStudenten;
    private int anzahlDozenten;
    
    // Konstruktor
    public Hochschule(String name) {
        this.name = name;
        this.studenten = new Student[10]; // Maximum 10 Studenten
        this.dozenten = new Dozent[10];   // Maximum 10 Dozenten
        this.anzahlStudenten = 0;
        this.anzahlDozenten = 0;
    }
    
    // Getter-Methoden
    public String getName() {
        return name;
    }
    
    public Student[] getStudenten() {
        return studenten;
    }
    
    public Dozent[] getDozenten() {
        return dozenten;
    }
    
    public int getAnzahlStudenten() {
        return anzahlStudenten;
    }
    
    public int getAnzahlDozenten() {
        return anzahlDozenten;
    }
    
    // Setter-Methoden
    public void setName(String name) {
        this.name = name;
    }
    
    // Methode zum Hinzufügen eines Studenten
    public void addStudent(Student student) {
        if (anzahlStudenten < studenten.length) {
            studenten[anzahlStudenten] = student;
            anzahlStudenten++;
            System.out.println("Student " + student.getName() + " wurde hinzugefügt.");
        } else {
            System.out.println("Maximale Anzahl von Studenten erreicht!");
        }
    }
    
    // Methode zum Hinzufügen eines Dozenten
    public void addDozent(Dozent dozent) {
        if (anzahlDozenten < dozenten.length) {
            dozenten[anzahlDozenten] = dozent;
            anzahlDozenten++;
            System.out.println("Dozent " + dozent.getName() + " wurde hinzugefügt.");
        } else {
            System.out.println("Maximale Anzahl von Dozenten erreicht!");
        }
    }
    
    // Methode zur Ausgabe aller Studenten
    public void alleStudentenAusgeben() {
        System.out.println("\n=== Alle Studenten der " + name + " ===");
        for (int i = 0; i < anzahlStudenten; i++) {
            System.out.println(studenten[i]);
        }
    }
    
    // Methode zur Ausgabe aller Dozenten
    public void alleDozentenenAusgeben() {
        System.out.println("\n=== Alle Dozenten der " + name + " ===");
        for (int i = 0; i < anzahlDozenten; i++) {
            System.out.println(dozenten[i]);
        }
    }
    
    // toString-Methode
    @Override
    public String toString() {
        return "Hochschule{" +
                "Name='" + name + '\'' +
                ", Anzahl Studenten=" + anzahlStudenten +
                ", Anzahl Dozenten=" + anzahlDozenten +
                '}';
    }
}

// Hauptklasse mit main-Methode
public class HochschuleManagement {
    public static void main(String[] args) {
        // Hochschule erstellen
        Hochschule hochschule = new Hochschule("Technische Hochschule Berlin");
        
        System.out.println("=== Hochschule erstellt ===");
        System.out.println(hochschule);
        
        // 3 Studenten erstellen
        Student student1 = new Student("Max Mustermann", "Informatik", 12345);
        Student student2 = new Student("Anna Schmidt", "Maschinenbau", 12346);
        Student student3 = new Student("Tom Weber", "Elektrotechnik", 12347);
        
        // Studenten zur Hochschule hinzufügen
        System.out.println("\n=== Studenten hinzufügen ===");
        hochschule.addStudent(student1);
        hochschule.addStudent(student2);
        hochschule.addStudent(student3);
        
        // 3 Dozenten erstellen
        Dozent dozent1 = new Dozent("Prof. Dr. Mueller", "Informatik", 54321);
        Dozent dozent2 = new Dozent("Dr. Schneider", "Maschinenbau", 54322);
        Dozent dozent3 = new Dozent("Prof. Fischer", "Elektrotechnik", 54323);
        
        // Dozenten zur Hochschule hinzufügen
        System.out.println("\n=== Dozenten hinzufügen ===");
        hochschule.addDozent(dozent1);
        hochschule.addDozent(dozent2);
        hochschule.addDozent(dozent3);
        
        // Alle Studenten und Dozenten ausgeben
        hochschule.alleStudentenAusgeben();
        hochschule.alleDozentenenAusgeben();
        
        // Daten manipulieren - Beispiele für Setter-Verwendung
        System.out.println("\n=== Daten manipulieren ===");
        System.out.println("Vor der Änderung: " + student1);
        student1.setBereich("Wirtschaftsinformatik");
        student1.setName("Maximilian Mustermann");
        System.out.println("Nach der Änderung: " + student1);
        
        System.out.println("\nVor der Änderung: " + dozent1);
        dozent1.setBereich("Softwareentwicklung");
        System.out.println("Nach der Änderung: " + dozent1);
        
        // Getter-Methoden testen
        System.out.println("\n=== Getter-Methoden testen ===");
        System.out.println("Name des ersten Studenten: " + student2.getName());
        System.out.println("Bereich des zweiten Dozenten: " + dozent2.getBereich());
        System.out.println("Personalnummer des dritten Studenten: " + student3.getPersonalnummer());
        
        // Hochschule-Informationen ausgeben
        System.out.println("\n=== Final Hochschule-Status ===");
        System.out.println(hochschule);
        System.out.println("Hochschulname: " + hochschule.getName());
        System.out.println("Anzahl Studenten: " + hochschule.getAnzahlStudenten());
        System.out.println("Anzahl Dozenten: " + hochschule.getAnzahlDozenten());
    }
}



