package org.example.battleships.commons;

/**
 * Enum для хранения характеристик кораблей
 * для игры морской бой
 *
 * @author kremlsa@yandex.ru
 * @version 1.0
 */
public enum Ships {
    AIR(5, "Aircraft Carrier", 1),//авианосец
    BS(4, "Battleship", 1),//линкор
    SUB(3, "Submarine", 2),//субмарина
    CRU(3, "Cruiser", 2),//крейсер
    DEST(2, "Destroyer", 3);//эсминец

    int length;//длина корабля
    String shipName;//наименование корабля
    int quantity;//допустимое количество кораблей

    //Конструктор
    Ships(int length, String shipName, int quantity) {
        this.length = length;
        this.shipName = shipName;
        this.quantity = quantity;
    }

    /**
     * Метод для возврата длины корабля
     *
     * @return длина корабля. int
     */
    public int getLen() {
        return length;
    }

    /**
     * Метод для возврата допустимого количества кораблей на поле
     *
     * @return количество кораблей на поле. int
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Метод для возврата наименования корабля
     *
     * @return имя корабля. int
     */
    public String getName() {
        return shipName;
    }
}