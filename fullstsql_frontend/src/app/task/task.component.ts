import {Component, OnInit} from '@angular/core';
import {CommonModule} from "@angular/common";
import {TaskService} from "./task.service";
import { Task } from './task.model';
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-task',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './task.component.html',
  styleUrl: './task.component.css'
})
export class TaskComponent implements OnInit{
  constructor(private taskService:TaskService) {}

  newTask:Task ={description:"",completed:false};
  tasks:Task[] = [];
  editingTask:Task|null=null;
  updatedTask:Task={description:"",completed:false};

  ngOnInit() {
    this.getAllTasks();
  }

  createTask():void{
    this.taskService.createTask(this.newTask).subscribe((createdTask)=>{
      this.newTask ={description:"",completed:false}; //resetting task to normal

    })
  }
  getAllTasks(){
    this.taskService.getAllTasks().subscribe( (tasks)=>
      { this.tasks=tasks }
    )
  }
  editTask(task:Task){
    this.editingTask=task;
    this.updatedTask={...task}; }
  updateTask() {
    if (this.editingTask){
      this.taskService.updateTasks(this.editingTask.id!, this.updatedTask).subscribe(
        (result)=>{
          const  index =this.tasks.findIndex(
            (task)=>task.id== this.editingTask!.id )
        if(index != -1){
          this.tasks[index]=result;
          this.cancelEdit();
        }
        }
      )
    }
  }

  cancelEdit(){
    this.editingTask=null;
    this.updatedTask = {description:"",completed:false};
  }

}
