package org.example.battleships.commons;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Юнит тест для класса ENUM - Ships
 *
 * @author kremlsa@yandex.ru
 * @version 1.0
 */
class ShipsTest {

    @Test()
    @DisplayName("Печатаем имена кораблей")
    public void testEnum() {
        for (Ships ship : Ships.values()) {
            System.out.println("Ship name - " + ship.getName()
                    + ",  length - " + ship.getLen()
                    + ", quantity - " + ship.getQuantity());
        }
    }

}