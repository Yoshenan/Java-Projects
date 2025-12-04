
public class Subject {
    public String code;
    public char result;

    public Subject(String code, char result) {
        this.code = code;
        this.result = result;
    }

    @Override
    public String toString() {
        return code + " : " + result;
    }
}

