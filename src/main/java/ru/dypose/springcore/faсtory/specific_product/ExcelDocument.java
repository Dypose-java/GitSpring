package ru.dypose.springcore.faсtory.specific_product;

import ru.dypose.springcore.faсtory.interface_product.Document;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.print("Открыть:");
        getType();
    }

    @Override
    public void save() {
        System.out.println("Сохранить:");
        getType();
    }

    @Override
    public void delete() {
        System.out.println("Удалить:");
        getType();
    }

    @Override
    public String getType() {
        return "Excel";
    }
}
