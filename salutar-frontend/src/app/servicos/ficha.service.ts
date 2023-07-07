import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.development';
import { FichaPaciente } from '../model/fichaPaciente';
import { TokenService } from './token.service';

@Injectable({
  providedIn: 'root'
})
export class FichaService {

  constructor(private http: HttpClient, private token: TokenService) { }

  public buscarPacientes(nome: string): Observable<FichaPaciente[]>{
    
    let header = this.token.getTokenHeader();

    return this.http.get<FichaPaciente[]>(environment.baseUrl + 
      "/fichas/buscar?nome=" + nome, {headers: header});
  }
}
