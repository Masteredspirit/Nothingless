package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource {
    //Вот тут мы устанавливаем самый минимум для всех CatalogDataSourceImpl
    public abstract ArrayList<Product> getCatalog();
}
