package io.pivotal.model;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by pradeep on 22/07/16.
 */
@Entity
public class Greeting {
    @Id
    private Integer id;

    private String text;

    public Greeting(){

    }

    public Greeting(Integer id, String text){
        this.id = id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Greeting:[id="+id+", text="+text+"]";
    }
}
