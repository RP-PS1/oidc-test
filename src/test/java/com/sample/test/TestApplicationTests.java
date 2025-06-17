package com.sample.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.sample.test.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content, null);
        }
    }
}
	// void testJpa_insert() {
	// 	Question q1 = new Question();
	// 	q1.setSubject("test1-1");
	// 	q1.setContent("test1-2");
	// 	q1.setCreateDate(LocalDateTime.now());
	// 	this.questionRepostiroy.save(q1);

	// 	Question q2 = new Question();
	// 	q2.setSubject("test2-1");
	// 	q2.setContent("test2-2");
	// 	q2.setCreateDate(LocalDateTime.now());
	// 	this.questionRepostiroy.save(q2);
	// }
	// void testJpa() {
	// 	List<Question> all = this.questionRepostiroy.findAll();
	// 	assertEquals(2, all.size());
	
	// 	Question q = all.get(1);
	// 	assertEquals("test2-1", q.getSubject());
	// }

