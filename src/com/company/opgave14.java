package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class opgave14 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<ExamQuestion> examQuestions = new ArrayList<>();
        for (int i = 1; i <= 14; i++) {
            examQuestions.add(new ExamQuestion(i));
        }

        File file = new File("data/" + "questions.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));
        for (ExamQuestion examQuestion : examQuestions) {
            System.out.println(examQuestion);
            ps.println(examQuestion);
        }
    }
}

    class ExamQuestion {
        private int number;
        private String grade;

        public ExamQuestion(int number) {
            this.number = number;
            grade = randomgrade();
        }

        public String randomgrade() {
            Random r = new Random();
            int randomNumber = r.nextInt(6) + 1;
            if (randomNumber == 1) {
                return "A";
            } else if (randomNumber == 2) {
                return "B";
            } else if (randomNumber == 3) {
                return "C";
            } else if (randomNumber == 4) {
                return "D";
            } else if (randomNumber == 5) {
                return "E";
            } else {
                return "F";
            }
        }

        @Override
        public String toString() {
            return "number " + number + " grade " + grade;
        }
    }


