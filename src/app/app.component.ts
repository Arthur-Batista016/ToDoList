import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { TaskComponent } from './task/task.component';


@Component({
  selector: 'app-root',
  imports: [RouterOutlet,HomeComponent,TaskComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'todo-list-interface';
}
