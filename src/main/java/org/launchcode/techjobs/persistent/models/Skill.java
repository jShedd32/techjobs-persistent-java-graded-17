package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
public class Skill extends AbstractEntity {

    @NotNull(message = "Description can not be empty")
    @Size(min = 1, max = 1000, message = "Description should be between 1-1000 characters")
    public String description;

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
