import { Injectable } from '@angular/core';
import { Question } from '../datamodel/question';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {
 


  constructor(private http: HttpClient) { }
  javaLink = 'http://localhost:8080/quiz-rest-services/rest/questions'
  questionList : Question[];
  getQuestions() : Question[]{
    this.http.get<Question[]>(this.javaLink).subscribe(data => {
      this.questionList=data;
    })
    console.log(this.questionList.length)
    return this.questionList
  }
  save(question: Question): void {
    this.questionList.push(question);
  }
}
