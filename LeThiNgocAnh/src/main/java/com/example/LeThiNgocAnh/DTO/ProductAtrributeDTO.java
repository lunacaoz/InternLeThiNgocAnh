package com.example.LeThiNgocAnh.DTO;

import com.example.LeThiNgocAnh.entity.Color;
import com.example.LeThiNgocAnh.entity.Size;

public class ProductAtrributeDTO {
    private Size id_size;
    private Color id_color;
    private int quantity;
    public Size getId_size() {
        return id_size;
    }

    public void setId_size(Size id_size) {
        this.id_size = id_size;
    }

    public Color getId_color() {
        return id_color;
    }

    public void setId_color(Color id_color) {
        this.id_color = id_color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
