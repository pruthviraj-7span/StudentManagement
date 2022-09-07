package com.studentManagement.entites;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rollNumber;
    private String name;
    private String address;
    private Long age;
    private Date date;
    private Long mobile;
    private Double mark;
    private String email;
//    @OneToMany
//    private List<Subject> subjects;

}
