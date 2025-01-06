package local.mon_projet.demo.model;

import jakarta.persistence.*;

@Entity(name = "Username") // Nom unique pour cette entité
@Table(name = "username")  // Nom de la table dans MySQL
public class Username {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PersonID") // Colonne exacte dans la base
    private Long personID;

    @Column(name = "LastName") // Colonne exacte dans la base
    private String lastName;

    @Column(name = "FirstName") // Colonne exacte dans la base
    private String firstName;

    // Getters et Setters
    public Long getPersonID() {
        return personID;
    }

    public void setPersonID(Long personID) {
        this.personID = personID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
