package data.data_source.order;

import data.models.Order;

public class MockOrderDataSourceImpl extends OrderDataSource{
    //Вот тут мы реализуем весь минимум для работы установленный в абстрактном классе OrderDataSource
    private Order order;

    @Override
    public void createOrder(Order order) {
        this.order = order;
    }
}
