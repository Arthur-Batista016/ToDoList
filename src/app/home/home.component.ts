import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

  baseUrl:string = 'http://localhost:8080/list'

  getLists(){
    fetch(this.baseUrl + "/Get").then(dados => dados.json()).then(dados=>{console.log(dados)})
  }

}
