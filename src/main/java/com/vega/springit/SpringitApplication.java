package com.vega.springit;

import com.vega.springit.domain.Comment;
import com.vega.springit.domain.Link;
import com.vega.springit.repository.CommentRepository;
import com.vega.springit.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner (LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("This is another test link", "https://another.com");
            linkRepository.save(link);

            Comment comment = new Comment("Super super!", link);
            commentRepository.save(comment);
//            link.addComment(comment);
//            LOGGER.info("CommandLineRunner runner  link: {}", link);
//            LOGGER.info("comments: {}", link.getComments());
//            Comment com1 = commentRepository.getById(1L);
//            LOGGER.info("CommandLineRunner runner  comment from db id =: {}", com1.getId());
//            LOGGER.info("CommandLineRunner runner  comment from db link =: {}", com1.getLink().getUrl());
        };
    }
}

