import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Usuario } from '../model/usuario';
import { SalutarToken } from '../model/salutarToken';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class LoginService {


  constructor(private http: HttpClient) { }

  public efetuarLogin(usuario: Usuario): Observable<SalutarToken>{
    return this.http.post<SalutarToken>(environment.baseUrl+"/login", usuario);
  }
}
