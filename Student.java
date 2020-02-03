package main.java;

// Student class:
public class Student {

    // Class fields:
    int id;
    String firstName;
    String lastName;
    String city;
    String nativeLanguage;
    double grade;

    // Overriding "toString()" method to output the values in the fields:
    @Override
    public String toString() {
        return id + "," + firstName + "," + lastName + "," + city + "," + nativeLanguage + "," + grade;
    }

    // Student class constructor, that takes all our fields as parameters:
    public Student(int id, String firstName, String lastName, String city, String nativeLanguage, double grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.nativeLanguage = nativeLanguage;
        this.grade = grade;
    }

    // Program entry point (main class):
    public static void main(String[] args) {

        // Creating a "Student" object and feeding it actual parameter values:
        Student myStudent = new Student(1, "Mihai", "Szocs", "Floresti", "Romanian", 10);

        // Creating a String with the myStudent info via the altered "toString()" method:
        String studentInfo = myStudent.toString();

        // Tokenizing the myStudent info String and adding the tokens to a String array:
        String[] myTokens = studentInfo.split(",");

        // Creating a new Student object
        Student newStudent = new Student(Integer.parseInt(myTokens[0]), myTokens[1], myTokens[2], myTokens[3], myTokens[4], Double.parseDouble(myTokens[5]));

        // Extra: checkig the results:
        System.out.println("MYSTUDENT OBJECT: " + myStudent);
        System.out.println("\nSTUDENTINFO STRING: " + studentInfo);
        System.out.println("\nMYTOKENS ARRAY ELEMENTS:");
            for (int i = 0; i < myTokens.length; i++) {
                System.out.println(myTokens[i]);
            };
        System.out.println("\nNEWSTUDENT OBJECT: " + newStudent);
    }
}