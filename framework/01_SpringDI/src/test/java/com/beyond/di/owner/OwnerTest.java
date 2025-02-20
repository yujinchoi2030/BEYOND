package com.beyond.di.owner;

import com.beyond.di.config.RootConfig;
import com.beyond.di.pet.Cat;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

// JUnit에서 스프링을 사용할 수 있도록 SpringExtension.class 사용하여 확장한다.
@ExtendWith(SpringExtension.class)
// @ContextConfiguration을 통해서 설정 파일을 읽고 애플리케이션 컨텍스트를 생성한다.
// @ContextConfiguration(locations = "classpath:spring/root-context.xml")
@ContextConfiguration(classes = RootConfig.class)
@DisplayName("Owner 클래스 테스트")
class OwnerTest {
    @Autowired
    @Qualifier("lee")
    private Owner owner;

    @Test
    @Disabled
    @DisplayName("실행 환경 테스트")
    void nothing() {
        // 이 테스트를 통해서 현재 프로젝트가 테스트가 가능한 환경인지 확인한다.
    }

    @Test
    @DisplayName("Owner 객체 생성 테스트")
    void create() {
        // 기존에 자바 애플리케이션에서는 다형성을 통해서 객체 간의 결합도를 느슨하게 만들어준다.
        // 생성자를 통한 의존성 주입
        // Owner owner = new Owner("홍길동", 24, new Dog("멍멍이"));
        // Owner owner = new Owner("홍길동", 24, new Cat("야옹이"));

        Owner owner = new Owner();

        owner.setName("홍길동");
        owner.setAge(24);
        // 메소드를 통한 의존성 주입
        // owner.setPet(new Dog("멍멍이"));
        owner.setPet(new Cat("야옹이"));

        // System.out.println(owner);

        assertThat(owner).isNotNull();
        assertThat(owner.getName()).isEqualTo("홍길동");
        assertThat(owner.getPet()).isNotNull();
    }

    @Test
    void genericXmlApplicationContextTest() {
        ApplicationContext context =
//                기본적으로 클래스 패스를 기준으로 파일을 찾는다.
//                new GenericXmlApplicationContext("spring/root-context.xml");
                new GenericXmlApplicationContext("classpath:spring/root-context.xml");

        // Owner owner = (Owner) context.getBean("hong");
        // Owner owner = context.getBean("hong", Owner.class);
        Owner owner = context.getBean("lee", Owner.class);

        System.out.println(owner);

        assertThat(context).isNotNull();
        assertThat(owner).isNotNull();
        assertThat(owner.getPet()).isNotNull();
    }

    @Test
    void annotationConfigApplicationContextTest() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(RootConfig.class);

        // Owner owner = context.getBean("owner", Owner.class);
        // Owner owner = context.getBean("hong", Owner.class);
        Owner owner = context.getBean("lee", Owner.class);

        // System.out.println(owner);

        assertThat(context).isNotNull();
        assertThat(owner).isNotNull();
    }

    @Test
    void autowiredTest() {
        System.out.println(owner);

        assertThat(owner).isNotNull();
        assertThat(owner.getPet()).isNotNull();
    }
}