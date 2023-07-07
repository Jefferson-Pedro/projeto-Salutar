import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './componentes/login/login.component';
import { MainComponent } from './componentes/main/main.component';
import { FichaPacienteComponent } from './componentes/ficha-paciente/ficha-paciente.component';

const routes: Routes = [
  {path:'', component: LoginComponent},
  {path:'main', component: MainComponent},
  {path:'ficha', component: FichaPacienteComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
