public class Field {
    private String value = "";
    private String emptyValue = "_";
    public boolean isEmpty() {
        return value.equals("") || value.equals(emptyValue);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
