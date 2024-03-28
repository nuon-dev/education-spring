package org.nuon.ellademo.repository

import org.nuon.ellademo.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Long> {
    // SELECT * FROM edu_ella_student;
    override fun findAll(): List<Student>

    // BY == WHERE
    // SELECT * FROM edu_ella_student WHERE id = ?;
    fun findAllById(id: Long): Student?
}