package model;

public class House {
    private String id;
    private String name;
    private String image;
    private String description;
    private String bathRoomQuantity;
    private String bedRoomQuantity;
    private String price;

    public House() {
    }

    public House(String id, String name, String image, String description, String bathRoomQuantity, String bedRoomQuantity, String price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.bathRoomQuantity = bathRoomQuantity;
        this.bedRoomQuantity = bedRoomQuantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getBathRoomQuantity() {
        return bathRoomQuantity;
    }

    public String getBedRoomQuantity() {
        return bedRoomQuantity;
    }

    public String getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBathRoomQuantity(String bathRoomQuantity) {
        this.bathRoomQuantity = bathRoomQuantity;
    }

    public void setBedRoomQuantity(String bedRoomQuantity) {
        this.bedRoomQuantity = bedRoomQuantity;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
