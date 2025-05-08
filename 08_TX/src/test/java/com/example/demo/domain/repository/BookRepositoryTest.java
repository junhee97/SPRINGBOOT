package com.example.demo.domain.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    // 기본 CRUD TEST

    @Test
    public void t1() throws Exception {

//        //INSERT
//        Book book = Book.builder().bookCode(1111L).bookName("리눅스").publisher("한빛").isbn("1111-1111").build();
//        // bookRepository.save(book);
//
//        //UPDATE
//        book.setBookName("JAVA");
//        book.setPublisher("이지");
//        book.setIsbn("2222-2222");
//        bookRepository.save(book);

        //DELETE
        bookRepository.deleteById(1111L);

    }

    @Test
    public void t2() throws Exception {

//        Optional<Book> bookOptional = bookRepository.findById(1111L);
//        if(bookOptional.isPresent())
//            System.out.println(bookOptional.get());

//        List<Book> list = bookRepository.findByBookName("LINUX");
//        list.stream().forEach(System.out::println);

//        List<Book> list = bookRepository.findByPublisher("한빛");
//        list.stream().forEach(System.out::println);

//        Book book = bookRepository.findByBookNameAndIsbn("LINUX", "1111");
//        System.out.println(book);

//        List<Book> list = bookRepository.findByBookNameContains("I");
//        list.stream().forEach(System.out::println);

//        int count = bookRepository.countByBookName("LINUX");
//        System.out.println(count);
        int count = bookRepository.countByBookNameContains("I");
        System.out.println(count);

    }

}