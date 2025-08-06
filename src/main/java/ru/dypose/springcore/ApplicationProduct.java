package ru.dypose.springcore;


import ru.dypose.springcore.faсtory.creat_product.DocumentCreator;
import ru.dypose.springcore.faсtory.creat_product.ExcelDocumentCreator;
import ru.dypose.springcore.faсtory.creat_product.PDFDocumentCreator;
import ru.dypose.springcore.faсtory.creat_product.WORDDocumentCreator;

public class ApplicationProduct {
    //удобство в создание новых продуктов
    public static void main(String[] args) {

        DocumentCreator documentCreator = new WORDDocumentCreator();
        documentCreator.processDocument();
        DocumentCreator documentCreator1 = new PDFDocumentCreator();
        documentCreator1.processDocument();
        DocumentCreator documentCreator2 = new ExcelDocumentCreator();
        documentCreator2.processDocument();
    }
}
