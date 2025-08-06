package ru.dypose.springcore.faсtory.creat_product;

import ru.dypose.springcore.faсtory.interface_product.Document;

public abstract class DocumentCreator {

    protected abstract Document createDocument();

   public void processDocument(){
      Document document=createDocument();
      document.open();
      document.save();
      document.delete();
      System.out.println("processed:"+document.getType());
   }
}
