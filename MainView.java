package view;

import java.util.ArrayList;

public class MainView extends AppView{
    //Тут мы будем отображать что находится в AppView
    public MainView(ArrayList<AppView> children) {
        super("Shop", children);
    }

    @Override
    public void action() {
        System.out.println("Welcome");
    }


}
