public enum kindEmpoyee {

    FEEDER ("Годувальник"),
    CARETAKER ("Доглядач");

    private String kind;

    kindEmpoyee(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
}
