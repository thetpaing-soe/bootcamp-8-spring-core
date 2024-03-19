package org.example.beans;

import org.example.annotation.QuestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static org.example.annotation.QuestType.Type.*;

@Component
public class Knight {

    private Quest quest;

    private MyClass myClass;

    @Autowired
    public Knight(@QuestType(Dimsel) Quest quest, @Autowired(required = false) MyClass myClass) {
        this.quest = quest;
        this.myClass = myClass;
    }

    public String goQuest() {
        return quest.goQuest();
    }

//    public void setQuest(Quest quest) {
//        this.quest = quest;
//    }
}
