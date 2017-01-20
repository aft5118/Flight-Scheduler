public class Person {
    private String nameOfPerson;
    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public Person() {
        nameOfPerson = "";
    }
    
    public Person(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }
     
}
