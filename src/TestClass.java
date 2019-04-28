public class TestClass {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Document myBankAccount = new Document("Info.bin", 1);
        printer.setDoc(myBankAccount);
        Document copy = (Document) printer.clone();
        System.out.println(myBankAccount + "\n" + copy);
    }
}
