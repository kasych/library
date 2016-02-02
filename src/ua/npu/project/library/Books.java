package ua.npu.project.library;


public class Books extends Publication {
    public int pages;
    public String nema;
    public String avtor;

    public Books(int pages, String nema, String avtor) {
        this.pages = pages;
        this.nema = nema;
        this.avtor = avtor;
    }

    public Books() {
        this.pages=0;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getNema() {
        return nema;
    }

    public void setNema(String nema) {
        this.nema = nema;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }
}


