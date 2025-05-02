package com.kaab.CachingData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner  implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
    private final BookRepository bookRepository;

    public AppRunner(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        logger.info("...fetching books");
        long startTime = System.currentTimeMillis();
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime-startTime;
        System.out.println("time taken : " + timeTaken);
    }
}
