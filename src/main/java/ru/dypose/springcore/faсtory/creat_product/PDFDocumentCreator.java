package ru.dypose.springcore.faсtory.creat_product;

import ru.dypose.springcore.faсtory.interface_product.Document;
import ru.dypose.springcore.faсtory.specific_product.PDFDocument;

public class PDFDocumentCreator extends DocumentCreator{
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
