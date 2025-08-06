package ru.dypose.springcore.faсtory.specific_product;

import ru.dypose.springcore.faсtory.interface_product.Document;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Открыть документ word");
    }

    @Override
    public void save() {
        System.out.println("Сохранить документ word");
    }

    @Override
    public void delete() {
        System.out.println("Удалить документ word");
    }

    @Override
    public String getType() {
        return "WORD";
    }
}
