package com.lms.librarymanagementsystem.service.impl;

import com.lms.librarymanagementsystem.Enum.CardStatus;
import com.lms.librarymanagementsystem.entity.Card;
import com.lms.librarymanagementsystem.entity.Student;
import com.lms.librarymanagementsystem.repository.StudentRepository;
import com.lms.librarymanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
   StudentRepository studentRepository;


    @Override
    public String addStudent(Student student) {
        //generate a new card for the student
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTill("2024-01-01");
        card.setStudent(student);

        //swt card for the student
        student.setCard(card);
        studentRepository.save(student);
        return " student card added successfully";
    }
}
