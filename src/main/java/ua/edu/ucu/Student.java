package ua.edu.ucu;


class Student {

    private double GPA;
    private int year;
    private String name;
    private String surname;

    public Student(String name, String surname, double GPA, int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return (int) GPA + 13 * year + 169 * name.hashCode()
                + 2197 * surname.hashCode();
    }


    @Override
    public boolean equals(Object st) {
        if (!(st instanceof Student)) {
            return false;
        }
        Student other = (Student) st;
        if (other.hashCode() != hashCode()) {
            return false;
        }
        return GPA == other.GPA && year == other.year
                && name.equals(other.name) && surname.equals(other.surname);

    }

    @Override
    public String toString() {
        return "Student: name: " + name + ", surname: " + surname + ", " + "GPA: " + GPA + ", studying year: " + year + '}';
    }
}
