package com.chainsys.pricing;

class Laptop {
    private String brand;
    private String model;
    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String processor;
    private int ram;
    private int storage;
    private double price;

    public Laptop(String brand, String model, String processor, int ram, int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
               "\nModel: " + model +
               "\nProcessor: " + processor +
               "\nRAM: " + ram + "GB" +
               "\nStorage: " + storage + "GB SSD" +
               "\nPrice: $" + price;
    }
}

class Clothes {
    private String type;
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String material;
    private String color;
    private String size;
    private double price;

    public Clothes(String type, String material, String color, String size, double price) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type: " + type +
               "\nMaterial: " + material +
               "\nColor: " + color +
               "\nSize: " + size +
               "\nPrice: $" + price;
    }
}

