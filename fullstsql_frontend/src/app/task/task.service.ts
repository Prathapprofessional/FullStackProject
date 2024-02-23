import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Task} from "./task.model";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  private apiUrl= "http://localhost:8080/api/tasks";

  constructor(private httpClient: HttpClient) { }

  createTask(newTask: Task):Observable<Task>{
    return this.httpClient.post<Task>(this.apiUrl,newTask);
  }
}
