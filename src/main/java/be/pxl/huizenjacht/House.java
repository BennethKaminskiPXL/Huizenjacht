package be.pxl.huizenjacht;

public class House {
    private String code;
    private String name;
    private Status status;
    private String city;
    private double price;

    public House(String code, String name, Status status, String city, double price) {
        this.code = code;
        this.name = name;
        this.status = status;
        this.city = city;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }
}
