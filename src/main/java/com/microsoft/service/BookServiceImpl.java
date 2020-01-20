package com.microsoft.service;

import com.microsoft.mapper.BookMapper;
import com.microsoft.pojo.Books;
import lombok.Setter;

import java.util.List;

public class BookServiceImpl implements BookService {
    //service层调用Mapper层，组合Mapper
    @Setter
    private BookMapper mapper;

    public int addBook(Books book) {
        return mapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return mapper.deleteBookById(id);
    }

    public int updateBook(Books book) {
        return mapper.updateBook(book);
    }

    public Books queryBookById(int id) {
        return mapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return mapper.queryAllBooks();
    }
}
