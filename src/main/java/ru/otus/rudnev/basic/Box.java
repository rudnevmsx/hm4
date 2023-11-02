package ru.otus.rudnev.basic;

public class Box {
    private int size;
    private String color;
    private boolean isOpened;
    private boolean isEmpty;

    public Box(int size, String color, boolean isOpened, boolean isEmpty) {
        this.size = size;
        this.color = color;
        this.isOpened = isOpened;
        this.isEmpty = isEmpty;
    }

    public void boxInfo(){
        System.out.println("Размер коробки: " + this.size);
        System.out.println("Цвет коробки: " + this.color);
        System.out.println("Коробка открыта? " + this.isOpened);
        System.out.println("Коробка пуста? " + this.isEmpty);
    }

    public void changeColor(String newColor){
        this.color = newColor;
        System.out.println("Коробка перекрашена в " + newColor);
    }

    public void openBox(){
        this.isOpened = !this.isOpened;
        System.out.println("Коробка закрыта?" + this.isOpened);
    }

    public void putItem(){
        if (this.isOpened == true){
            this.isEmpty = !this.isEmpty;
        }
        else{
            System.out.println("Коробка закрыта, её необходимо открыть!");
        }
    }
}
