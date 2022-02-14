package ru.netology.manager;

import ru.netology.domain.BillboardFilm;

import lombok.AllArgsConstructor;

public class BillboardManager {
    private BillboardFilm[] films = new BillboardFilm[0];
    private int limitShowFilms = 10;

    public BillboardManager() {
    }

    public BillboardManager(int limitShowFilms) {
        this.limitShowFilms = limitShowFilms;
    }


    public void add(BillboardFilm film) {

        int array = films.length + 1;
        BillboardFilm[] tmp = new BillboardFilm[array];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }

        int index = tmp.length - 1;
        tmp[index] = film;
        films = tmp;
    }

    public BillboardFilm[] removeFilm(int id) {
        int array = films.length - 1;
        BillboardFilm[] tmp = new BillboardFilm[array];
        int index = 0;
        for (BillboardFilm film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
            films = tmp;
        }
        return tmp;
    }

    public BillboardFilm[] getAll() {
        BillboardFilm[] result = new BillboardFilm[films.length];
        for (int i = 0; i < films.length; i++) {
            int index = films.length - 1 - i;
            result[i] = films[index];
        }
        return result;
    }

    public BillboardFilm[] getLastFilm() {
        int resultLength;
        if (films.length < limitShowFilms) {
            resultLength = films.length;
        } else {
            resultLength = limitShowFilms;
        }
        BillboardFilm[] result = new BillboardFilm[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - 1 - i;
            result[i] = films[index];
        }
        films = result;
        return result;
    }
}
