package ru.job4j.articles.cashe;

import ru.job4j.articles.model.Word;

import java.lang.ref.SoftReference;
import java.util.List;

public abstract class WordsCache<V> {

    public SoftReference<List<V>> data;

    public void addAll(List<V> v) {
        data = new SoftReference<>(v);
    }

    public List<V> getAll() {
        List<V> rsl = null;
        if (data != null) {
            rsl = data.get();
        }
        return rsl;
    }

}
