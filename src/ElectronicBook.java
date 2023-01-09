public class ElectronicBook extends Books {
    String kindle;
    String pdf;

    public String getKindle() {
        return kindle;
    }

    public void setKindle(String kindle) {
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
