package nl.novi.javaprogrammeren.one;

public class Person {
    private String firstName;
    private String lastName;
    private String lastNameInsertion;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String lastNameInsertion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastNameInsertion = lastNameInsertion;
    }

    public void setFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastNameInsertion = "";
    }
    public void setFullName(String firstName, String lastNameInsertion, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastNameInsertion = lastNameInsertion;
    }

    public String getFullName() {
        if(lastNameInsertion == null || lastNameInsertion.equalsIgnoreCase("")) {
            return firstName + " " + lastName;
        }
        return firstName + " " + lastNameInsertion + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastNameInsertion() {
        return lastNameInsertion;
    }

    public void setLastNameInsertion(String lastNameInsertion) {
        this.lastNameInsertion = lastNameInsertion;
    }
}
