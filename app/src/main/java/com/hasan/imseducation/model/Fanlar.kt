package com.hasan.imseducation.model

class Subject private constructor() {
    companion object {
        private val subjects = listOf("Matematika", "Fizika", "Informatika")
        fun getSubject(id: Int): String {
            return subjects[id]
        }

        fun getSubjectId(subject:String): Int {
            return subjects.indexOf(subject)
        }

        fun getAllSubjects(): List<String> {
            return subjects
        }
    }

}

class Ques private constructor() {
    companion object {
        private val ques = listOf("1-daraja", "2-daraja", "3-daraja")
        fun getQues(id: Int): String {
            return ques[id]
        }

        fun getQuesId(ques:String): Int {
            return ques.indexOf(ques)
        }

        fun getAllQues(): List<String> {
            return ques
        }
    }

}

