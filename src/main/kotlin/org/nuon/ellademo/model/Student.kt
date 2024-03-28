package org.nuon.ellademo.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity(name = "edu_ella_student")
class Student(
        @Id
        val id: Long,
        var name: String,
        val gender: String,
        val age: Int,
        val isGraduated: Boolean,
        val createtime: LocalDateTime,
        val lastModifiedTime: LocalDateTime?,
        val mobile: String?,
        val majorId: Long?
) {

}