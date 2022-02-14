package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.BillboardFilm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BillboardManagerTest {
    BillboardManager manager = new BillboardManager();
    BillboardFilm first = new BillboardFilm(1, "Бладшот", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm second = new BillboardFilm(2, "Вперёд", "мультфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm third = new BillboardFilm(3, "Отель Белград", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm fourth = new BillboardFilm(4, "Джентельмены", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm fifth = new BillboardFilm(5, "Человек-невидимка", "ужасы", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm sixth = new BillboardFilm(6, "Тролли.Мировой тур", "мультильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm seventh = new BillboardFilm(7, "Номер один", "комедия", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm eighth = new BillboardFilm(8, "Шрек", "мультфильм", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm ninth = new BillboardFilm(9, "Перелом", "триллер", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm tenth = new BillboardFilm(10, "Форсаж", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");
    BillboardFilm theEleventh = new BillboardFilm(11, "Шрек 3", "боевик", "https://github.com/netology-code/javaqa-homeworks/blob/master/dependency/pic/afisha.png?raw=true");

    @BeforeEach
    public void setAll() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }



    @Test
    public void shouldAddMovies() {

        BillboardFilm[] actual = manager.getAll();
        BillboardFilm[] expected = new BillboardFilm[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveFilm() {

        BillboardFilm[] actual = manager.removeFilm(10);
        BillboardFilm[] expected = new BillboardFilm[]{first, second, third, fourth, fifth,  sixth, seventh, eighth, ninth,};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAll() {

        BillboardFilm[] actual = manager.getAll();
        BillboardFilm[] expected = new BillboardFilm[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldGetLastFilm() {
        BillboardManager manager = new BillboardManager(4);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);

        BillboardFilm[] expected = new BillboardFilm[]{eighth, seventh, sixth, fifth};
        BillboardFilm[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetLastEighthFilm() {
        BillboardManager manager = new BillboardManager(10);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);


        BillboardFilm[] expected = new BillboardFilm[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        BillboardFilm[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);
    }
}