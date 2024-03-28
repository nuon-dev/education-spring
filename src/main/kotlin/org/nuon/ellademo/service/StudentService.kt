package org.nuon.ellademo.service

import org.nuon.ellademo.model.Student
import org.nuon.ellademo.repository.StudentRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Service
class StudentService(
        private val studentRepository: StudentRepository
) {
    fun getAll(): List<Student> {
        return studentRepository.findAll()
    }

    fun findById(id: Long): Student? =
            studentRepository.findAllById(id)

    fun creatStudent(student: Student): Student? {
        return studentRepository.save(student)
    }

    fun updateStudent(
            studentId: Long,
            name: String
    ): Student? {
        val student = studentRepository.findAllById(studentId)

        if(student == null) {
            return null
        }

        student.name = name

        studentRepository.save(student)

        return student
    }

    fun deleteStudent(id: Long): Boolean {
        try {
            studentRepository.deleteById(id)
        } catch (e: Exception) {
            return false
        }

        return true
    }
}