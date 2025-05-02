package com.kaab.CachingData;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
