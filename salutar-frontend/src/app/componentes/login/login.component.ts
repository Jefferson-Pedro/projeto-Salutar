import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { SalutarToken } from 'src/app/model/salutarToken';
import { Usuario } from 'src/app/model/usuario';
import { LoginService } from 'src/app/servicos/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  public usuario: Usuario = new Usuario ();
  public loading: boolean = false;
  public mensagem: string = "";

  constructor(private route: Router, private service:LoginService){

  }

  public logar(){
    this.loading = true;
    this.service.efetuarLogin(this.usuario).subscribe({
      next: (res: SalutarToken)=>{
        alert('Deu certo!');
        this.loading = false;
        localStorage.setItem('SalutarTk', res.token);
        this.route.navigate(['main']);
      },
      error:(err: any)=>{
        alert('Não é possivel autenticar usuário!');
        this.mensagem = 'Usuário/Senha invalidos!'
        this.loading = false;
      },    
  });
  }
}
