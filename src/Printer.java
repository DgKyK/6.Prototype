public class Printer implements DocumentClone {
    private Document doc;

    public Printer(){
        doc = new Document();
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    @Override
    public Object clone() {
        return new Document(doc.getName(),doc.getPageNumber());
    }
}
