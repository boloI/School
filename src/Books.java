public class Books {
    String[] authorNames = new String[]{"Bimal Jalal", "Ruskin Bond", "Vinit Karnik"};

    public String[] getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames() {
        this.authorNames = authorNames;
    }

    public String Books() {
        this.authorNames = authorNames;
        for (int i = 0; i <= authorNames.length;)
            return authorNames[i];

        return null;
    }
}
