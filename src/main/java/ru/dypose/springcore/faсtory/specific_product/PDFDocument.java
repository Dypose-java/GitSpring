package ru.dypose.springcore.faсtory.specific_product;

import ru.dypose.springcore.faсtory.interface_product.Document;

public class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("Открыть PDF");
    }

    @Override
    public void save() {
        System.out.println("Сохранить PDF");
    }

    @Override
    public void delete() {
        System.out.println("Удалить PDF");
    }

    @Override
    public String getType() {
        return "PDF";
    }
}
