public class Person {
    String firstName;
    String lastName;
    String domisili;
    
    // public Person() {

    // }

    // public Person(String firstName, String lastName, String domisili) {
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.domisili = domisili;
    // }

    public String getDomisili() {
        return domisili;
    }
    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    // public String getFullName(){
    //     return firstName+" "+lastName;
    // }

    public String getFullName(){
        String getFullName = firstName+" "+lastName;
        return getFullName;
    }

}
