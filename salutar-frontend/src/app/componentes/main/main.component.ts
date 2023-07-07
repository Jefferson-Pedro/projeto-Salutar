import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FichaPaciente } from 'src/app/model/fichaPaciente';
import { FichaService } from 'src/app/servicos/ficha.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainComponent implements OnInit{

  public lista: FichaPaciente[] = [];
  public keyword: string = "";
  public loading: boolean = false;

  constructor(private fichaServ: FichaService, private route: Router){}

  ngOnInit(): void {}

  public pesquisar(){
    this.fichaServ.buscarPacientes(this.keyword).subscribe({
      next: (res: FichaPaciente[]) => {
        this.loading = false;
        this.lista = res;
      },
      error: (err: any) =>{
        alert('Erro ao buscar o Paciente!');
        this.loading = false;
      }
  });
  }

  public adicionar(){
    this.route.navigate(['ficha']);
  }

}
