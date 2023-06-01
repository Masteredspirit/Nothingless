package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSourceImpl extends CatalogDataSource{
    //Тут мы реализуем весь минимум для работы установленный в абстрактном классе CatalogDataSource

    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products =new ArrayList<>();
        //Вот тут создаем первоначальный ассортимент товаров
        products.add(new Product("1","Iphone","Top Phone",true,100000));

        return products;
    }
}
