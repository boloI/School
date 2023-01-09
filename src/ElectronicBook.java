public class ElectronicBook extends Books {
<<<<<<< HEAD
    String kindle;
    String pdf;

    public String getKindle() {
        return kindle;
    }

    public void setKindle(String kindle) {
=======
    String[] kindle=new String[]{"https://www.gutenberg.org/cache/epub/69761/pg69761-images.html",
            "https://www.gutenberg.org/cache/epub/69760/pg69760-images.html",
    "https://www.gutenberg.org/cache/epub/69758/pg69758-images.html"};
    String pdf;

    public String[] getKindle() {
        return kindle;
    }

    public void setKindle() {
>>>>>>> 71c7c42 (Initial commit)
        this.kindle = kindle;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public ElectronicBook() {
        super();
        this.kindle = kindle;
        this.pdf = pdf;
    }
}
