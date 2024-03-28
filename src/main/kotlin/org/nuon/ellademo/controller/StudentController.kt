package org.nuon.ellademo.controller

import org.nuon.ellademo.model.Student
import org.nuon.ellademo.service.StudentService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController(
        private val studentService: StudentService
) {
    @GetMapping("/student/all")
    fun getAll(): List<Student> {
        return studentService.getAll()
    }

    @GetMapping("student")
    fun findById(
            @RequestParam id: Long
    ): Student? {
        return studentService.findById(id)
    }

    @PostMapping("/student")
    fun creatStudent(
            @RequestBody student: Student
    ): Student? {
        return studentService.creatStudent(student)
    }

    @PutMapping("/student/name")
    fun updateStudentName(
            @RequestParam studentId: Long,
            @RequestParam name: String
    ): Student? {
        return studentService.updateStudent(studentId,name)
    }

    @DeleteMapping("/student")
    fun deleteStudent(
            @RequestParam id: Long
    ): Boolean {
        return studentService.deleteStudent(id)
    }
}

