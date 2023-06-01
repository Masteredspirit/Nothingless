package view;


import java.util.ArrayList;

public abstract class  AppView {
    public final String title; //Текст что мы будем выводить на экран.

    public final ArrayList<AppView> children; //Дети которые сейчас с нами находятся рядом бы будем обходить, используя метод action();
    public AppView(String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }
    public abstract void action();


    public void displayChildren(){
        System.out.println("Chose from 1 to " + (children.size() + 1));
        //тут мы отображаем children: CartItem || Order || Product
        for (int i = 0; i < children.size(); i++) {
            System.out.println((i+1) + " " +children.get(i).title);
        }
        System.out.println((children.size()+1) + " Back");
    }
}
