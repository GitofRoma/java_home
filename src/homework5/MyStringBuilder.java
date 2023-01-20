package homework5;

public class MyStringBuilder {
    public static void myReplace(StringBuilder strInput, String strFrom, String strTo) {

        int index = strInput.indexOf(strFrom);
        strInput.deleteCharAt(index);
        strInput.insert(index, strTo);

    }
}
