import { Component, OnInit } from '@angular/core';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  providers: [UsersService]
})
export class HomeComponent implements OnInit {

  title = 'Perfect WebApp';
  results: Object;
  
  constructor(private userService: UsersService) {
    this.userService.getAll()
      .subscribe(results => {
        this.results = results;
      });
  }

  ngOnInit() {
  }

}
