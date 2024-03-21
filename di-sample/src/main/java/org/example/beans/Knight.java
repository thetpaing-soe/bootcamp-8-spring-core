package org.example.beans;

import org.example.annotation.QuestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.util.Optional;

import static org.example.annotation.QuestType.Type.*;

@Component
public class Knight {

//    @Autowired
//    @QuestType(Dragon)
    private Quest quest;

    private MyClass myClass;

    @Autowired
    public Knight(@QuestType(Dimsel) Quest quest, @Autowired(required = false) MyClass myClass) {
        this.quest = quest;
        this.myClass = myClass;
    }

    public Knight(@QuestType(YoYeYo) Quest quest) {
        this.quest = quest;
        System.out.println("Constructor::" + quest);
    }

//    public Knight() {
//        super();
//        System.out.println("Constructor::" + quest);
//    }

    @PostConstruct
    public void doSomething() {
        System.out.println("postConstruct::" + quest);
    }

    public String goQuest() {
        return quest.goQuest();
    }

//    @Autowired
    public void setQuest(Quest yoYeYoQuest) {
        this.quest = yoYeYoQuest;
        System.out.println("Setter::" + quest);
    }
}
