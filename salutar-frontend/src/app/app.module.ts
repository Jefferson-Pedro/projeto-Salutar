import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './componentes/login/login.component';
import { MainComponent } from './componentes/main/main.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from  '@angular/common/http';
import { WaitIconComponent } from './componentes/wait-icon/wait-icon.component';
import { FichaPacienteComponent } from './componentes/ficha-paciente/ficha-paciente.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MainComponent,
    WaitIconComponent,
    FichaPacienteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
