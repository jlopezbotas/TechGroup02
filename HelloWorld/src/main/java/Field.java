public class Field {
    String content = "";
    String emptyValue = "_";
    public boolean isEmpty() {
        return content.equals("") || content.equals(emptyValue);
    }
}
