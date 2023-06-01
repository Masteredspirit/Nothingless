package data.data_source.order;

import data.models.Order;

public abstract class OrderDataSource {
    //А вот тут мы устанавливаем самый минимум для всех OrderDataSourceImpl, которые будут созданы
    public abstract void createOrder(Order order);
}
