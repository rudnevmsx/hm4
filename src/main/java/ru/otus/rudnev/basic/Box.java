package ru.otus.rudnev.basic;

public class Box {
    final int size;
    private String color;
    private boolean isOpened;
    private boolean isEmpty;
    private String item;

    public Box(int size, String color, boolean isOpened, boolean isEmpty) {
        this.size = size;
        this.color = color;
        this.isOpened = isOpened;
        this.isEmpty = isEmpty;
    }

    public void info(){
        System.out.println("Размер коробки: " + this.size);
        System.out.println("Цвет коробки: " + this.color);
        System.out.println("Коробка открыта? " + this.isOpened);
        System.out.println("Коробка пуста? " + this.isEmpty);
        System.out.println("В");
    }

    public void changeColor(String newColor){
        this.color = newColor;
        System.out.println("Коробка перекрашена в " + newColor);
    }

    public void openBox(){
        if (this.isOpened){
            System.out.println("Коробка уже открыта");
        }
        else {
            this.isOpened = true;
            System.out.println("Коробка открыта");
        }
    }

    public void closeBox(){
        if (!this.isOpened){
            System.out.println("Коробка уже закрыта");
        }
        else {
            this.isOpened = false;
            System.out.println("Коробка закрыта");
        }
    }

    public void putItem(String item){
        if (this.item != null){
            System.out.println("В коробке уже есть предмет " + this.item);
        }
        else {
            this.item = item;
            System.out.println("В коробку положили " + this.item);
        }
    }
}
