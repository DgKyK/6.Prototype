public class Document {
    private String name;
    private int pageNumber;

    public Document() {
        this.name = "New Document";
    }

    public Document(String name, int pageNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
