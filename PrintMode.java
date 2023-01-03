public abstract class PrintMode {
    private int number_of_pages;
    private int page_size;
    private double orientation;
    private double color_intensity;
    private double cost_per_page;


    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public double getOrientation() {
        return orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }

    public double getColor_intensity() {
        return color_intensity;
    }

    public void setColor_intensity(double color_intensity) {
        this.color_intensity = color_intensity;
    }

    public double getCost_per_page() {
        return cost_per_page;
    }

    public void setCost_per_page(double cost_per_page) {
        this.cost_per_page = cost_per_page;
    }

}
