package com.example.studentservices.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Course {
    private final String id;
    private final String name;
    private final String description;
    private final List<String> steps;

    @Override
    public String toString() {
        return String.format(
                "Course [id=%s, name=%s, description=%s, steps=%s]", id, name, description, steps);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int resultado = 1;
        resultado = prime * resultado + ((id == null) ? 0 : id.hashCode());
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
