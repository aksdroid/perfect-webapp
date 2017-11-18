import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/debounceTime';
import 'rxjs/add/operator/distinctUntilChanged';
import 'rxjs/add/operator/switchMap';

@Injectable()
export class UsersService {

  baseUrl: string = '/api/users';

  constructor(private http: Http) { }

  getAll() {
    return this.http
        .get(this.baseUrl)
        .map(res => res.json());
  }

}
