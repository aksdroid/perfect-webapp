import { Component } from '@angular/core';
import { UsersService } from './users.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [UsersService]
})
export class AppComponent {
  title = 'Perfect WebApp';
  results: Object;
  
  constructor(private userService: UsersService) {
    this.userService.getAll()
      .subscribe(results => {
        this.results = results;
      });
  }
}
