import java.util.ArrayList;

public class Student extends Person {

    public ArrayList<Subject> subjectTaken = new ArrayList<>();

    Student(String fn, String ln) {
        super(fn, ln);
    }

    void remSubject(String scode) {
        boolean removed = subjectTaken.removeIf(s -> s.code.equals(scode));
        if (removed)
            System.out.println("Subject " + scode + " removed");
        else
            System.out.println("Subject " + scode + " not found");
    }

    void addSubject(String cd, char res) {
        subjectTaken.add(new Subject(cd, res));
    }

    void printTranscript() {
        for (Subject s : subjectTaken)
            System.out.println(s);
    }
    @Override
    public String toString() {
        return "Student name: " + getName();
    }
}
